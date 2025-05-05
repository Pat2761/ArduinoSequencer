package org.bpy.electronic.grafcet.core.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.bpy.electronic.ArduinoGrafcet.Model;

public abstract class AbstractCodeGenerator {
   
   protected final int CONSTANTE_VALUE_LOCATION = 60;

	protected BufferedWriter writer;

   protected Model model;
	
	protected static final int defineValuePosition = 50;

	public AbstractCodeGenerator(Model model) {
	   this.model = model;
   }
	
	public abstract void generate(String folder) throws IOException;
	public abstract String getFileName();
	public abstract Map<String,String> getSystemInclusionCollection();
	public abstract Map<String, String> getProjectInclusionCollection();
	public abstract void declarePreprocessorConstants() throws IOException;
	public abstract void declarePreprocessorMacros() throws IOException;
	public abstract void declareTypeDeclaration() throws IOException;
	
	
	protected void createSourceFile(String folder) {
		try {
			writer = new BufferedWriter(new FileWriter(new File(folder + "/" + getFileName())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void setHeaderFileGeneration(String projectName, String objective) throws IOException {
		writer.write("/* ************************************************************************\n");
		writer.write(" * Project : " + projectName + "\n");	
		writer.write(" * File    : " + getFileName() + "\n");
		writer.write(" * ------------------------------------------------------------------------\n");
		writer.write(" * PURPOSE:\n");
		writer.write(" * 	" + objective + "\n");
		writer.write(" * ------------------------------------------------------------------------\n");
		writer.write(" * This program is free software; you can redistribute it and/or modify\n");
		writer.write(" *    it under the terms of the GNU General Public License as published by\n");
		writer.write(" *    the Free Software Foundation; either version 2 of the License, or\n");
		writer.write(" *    (at your option) any later version.\n");
		writer.write(" *\n");
		writer.write(" *    This program is distributed in the hope that it will be useful,\n");
		writer.write(" *    but WITHOUT ANY WARRANTY; without even the implied warranty of\n");
		writer.write(" *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n");
		writer.write(" *    GNU General Public License for more details.\n");
		writer.write(" *\n");
		writer.write(" *    You should have received a copy of the GNU General Public License\n");
		writer.write(" *    along with this program; see the file COPYING. If not, write to the\n");
		writer.write(" *    Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.\n");
		writer.write(" *\n");
		writer.write(" *    Copyright (C) 2025 : Patrick BRIAND\n");
		writer.write(" * ------------------------------------------------------------------------\n");
		writer.write(" *  Created on: 15 mars 2025\n");
		writer.write(" *  Evolutions:\n");
		writer.write(" *     1.00  : Initial\n");
		writer.write(" *\n");
		writer.write(" *************************************************************************/\n");
	}

	protected void setEndOfFile() throws IOException {
		writer.write("\n");
		setStartCommentBlock();
		writer.write("   End of file\n");
		setCloseCommentBlock();
	}

	protected void setStartCommentBlock() throws IOException {
      writer.write("/* --------------------------------------------------------------------------------- \n");
	}
	
   protected void setCloseCommentBlock() throws IOException {
      writer.write("   ------------------------------------------------------------------------------ */\n");
   }

   protected void closeGeneratedFile() throws IOException {
		writer.flush();
		writer.close();
	}

	protected void startMonoInclusion() throws IOException {
		writer.write("\n");
		writer.write("#ifndef " + getFileName().toUpperCase().replace(".","_") + "_\n");
		writer.write("#define " + getFileName().toUpperCase().replace(".","_") + "_\n");
	}

	protected void closeMonoInclusion() throws IOException {
		writer.write("\n");
		writer.write("#endif // " + getFileName().toUpperCase().replace(".","_") + "_\n");
	}

	protected void declareSection(String sectionName) throws IOException {
		writer.write("\n");
      setStartCommentBlock();
		writer.write("   " + sectionName + "\n");
      setCloseCommentBlock();
	}
	
	protected void declareSystemInclusion() throws IOException {
		Map<String,String> inclusionCollection = getSystemInclusionCollection();
		for (Entry<String, String> entry : inclusionCollection.entrySet()) {
			StringBuilder builder = new StringBuilder("#include <");
			builder.append(entry.getKey());
			builder.append("> ");
			
			String spaces = " ".repeat(35 - builder.toString().length());
			builder.append(spaces);
			builder.append("// " + entry.getValue());
			builder.append("\n");
			writer.write(builder.toString());
		}
	}

	protected void declareProjectInclusion() throws IOException {
		Map<String,String> inclusionCollection = getProjectInclusionCollection();
		for (Entry<String, String> entry : inclusionCollection.entrySet()) {
			StringBuilder builder = new StringBuilder("#include \"");
			builder.append(entry.getKey());
			builder.append("\" ");
			
			String spaces = " ".repeat(35 - builder.toString().length());
			builder.append(spaces);
			builder.append("// " + entry.getValue());
			builder.append("\n");
			writer.write(builder.toString());
		}
	}
	
	protected String addNeededSpace(String stringToFormat, int stringSize) {
		int size = stringSize - 1 - stringToFormat.length();
		String spaces = " ";
		if (size > 1) {
			spaces = " ".repeat(size);
		}
		return spaces;
	}
	
	protected String convertToUpperSnakeCase(String input) {
	    if (input == null || input.isEmpty()) {
	        return input;
	    }

	    StringBuilder result = new StringBuilder();
	    result.append(input.charAt(0)); // on commence par le premier caractère

	    for (int i = 1; i < input.length(); i++) {
	        char c = input.charAt(i);
	        if (Character.isUpperCase(c)) {
	            result.append('_'); // on ajoute un souligné bas avant une majuscule
	        }
	        result.append(c);
	    }

	    return result.toString().toUpperCase();
	}
}
