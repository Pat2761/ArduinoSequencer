package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntry;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.business.api.session.Session;

public class SequencerHeaderGenerator extends AbstractHeaderCodeGenerator {

	public SequencerHeaderGenerator(Model model) {
		super(model);
	}
	
	@Override
	public String getFileName() {
		return "Sequencer.hpp";
	} 

	@Override
	public void generate(String folder) throws IOException {
		super.generate(folder);
	}

	@Override
	public Map<String, String> getSystemInclusionCollection() {
		Map<String,String> includes = new HashMap<>();
		includes.put("Arduino.h", "For data types definitions");
		return includes;
	}

	@Override
	public Map<String, String> getProjectInclusionCollection() {
		return new HashMap<>();
	}

	@Override
	public void declarePreprocessorConstants() throws IOException {
		EList<Grafcet> grafcets = model.getGrafcets();
		
		writer.write("// Define the number of graphs manages by the sequencer\n");
		StringBuilder builder = new StringBuilder("#define NB_GRAFCETS");
		builder.append(addNeededSpace(builder.toString(), defineValuePosition));
		builder.append(grafcets.size());
		builder.append("\n");
		writer.write(builder.toString());
		writer.newLine();

		int counter = 0;
		writer.write("// Define grafcet identifiers\n");

		GrafcetEntry grafcetEntry = model.getGrafcetEntry();

		
		Grafcet grafcet = grafcetEntry.getStartingGrafcet();
      exporteGrafcetIdentifier(grafcet, counter);

		counter++;
		
		while (grafcet.getNext() != null) {
			grafcet = grafcet.getNext();
	      exporteGrafcetIdentifier(grafcet, counter);
			counter++;
		}
		writer.newLine();
	}

	private void exporteGrafcetIdentifier(Grafcet grafcet, int counter) throws IOException {
      StringBuilder builder = new StringBuilder("// ");
      builder.append(grafcet.getName());
      builder.append(" grafcet identifier \n");
      writer.append(builder);
      
      builder = new StringBuilder();
      builder.append("#define ");
      builder.append(convertToUpperSnakeCase(grafcet.getName()));
      builder.append("_GRAFCET_ID");
      builder.append(addNeededSpace(builder.toString(), defineValuePosition));
      builder.append(counter);
      builder.append("\n");
      writer.write(builder.toString());
      writer.newLine();
   }

   @Override
	public void declarePreprocessorMacros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareTypeDeclaration() throws IOException {
      setStartCommentBlock();
      writer.write("   define the grafcet states\n");
      setCloseCommentBlock();

      StringBuilder strBuilder = new StringBuilder("typedef enum\n");
      strBuilder.append("{\n");
      strBuilder.append("	STOP,\n");
      strBuilder.append("	RUNNING,\n");
      strBuilder.append("	FREEZED\n");
      strBuilder.append("} tGrafcetStatus;\n");
		writer.append(strBuilder.toString());
		writer.newLine();
      
		setStartCommentBlock();
		writer.write("   define the structure tGrafcetStepDescription\n");
		setCloseCommentBlock();
		
		strBuilder = new StringBuilder("typedef struct\n");
		strBuilder.append("{\n");
		strBuilder.append("   tGrafcetStatus status;\n");
		strBuilder.append("   uint8_t  (** stepFunction) (uint8_t currentStep);\n");
		strBuilder.append("} tGrafcetStepDescription;\n");
		strBuilder.append("\n");
		writer.write(strBuilder.toString());
		writer.newLine();
	}

	@Override
	public void declareExternalVariableDeclaration() {
		// TODO Auto-generated method stub
		
	}
		
	@Override
	public void declareExternalConstantsDeclaration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareClassDescription() throws IOException {
		writer.write("class Sequencer {\n");
		writer.write("	public:\n");
		writer.write("		// Initialization of the sequencer\n");
		writer.write("		void initialize(void);\n");
		writer.write("		\n");
		writer.write("		// Engine of the sequence\n");
		writer.write("		void engine(void);\n");
		writer.write("		\n");
		writer.write("		// set grafcet state\n");
		writer.write("		void setState(uint8_t grafcet, tGrafcetStatus state);\n");
		writer.write("		\n");
		writer.write("};\n");
	}

	@Override
	public void declareExternalFunctionsDeclaration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareExternalClassInstanciation() throws IOException {
		writer.write("extern Sequencer sequencer;\n");
		
	}

}
