package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;

import org.bpy.electronic.ArduinoGrafcet.Model;

public abstract class AbstractSourceCodeGenerator extends AbstractCodeGenerator {

	public AbstractSourceCodeGenerator(Model model) {
		super(model);
	}
	
	abstract void declareComponentVariables() throws IOException;
	abstract void declareClassInstantiation() throws IOException;
	abstract void declareLocalesFunctions() throws IOException;
	abstract void declareClassMethods() throws IOException;
	abstract void declareConstantVariables() throws IOException;
	
	public void generate(String folder) throws IOException {
		createSourceFile(folder);
		
		setHeaderFileGeneration(model.getProjectName(), "Sequencer library");
		
		declareSection("System inclusions");
		declareSystemInclusion();
		
		declareSection("Project inclusions");
		declareProjectInclusion();
		
		declareSection("Preprocessor constants definition");
		declarePreprocessorConstants();

		declareSection("Preprocessor macros definition");
		declarePreprocessorMacros();
	
		declareSection("Types declaration");
		declareTypeDeclaration();
		
		declareSection("Variables declaration");
		declareComponentVariables();
		
		declareSection("Constants declaration");
		declareConstantVariables();

		declareSection("Class instantiation");
		declareClassInstantiation();

		declareSection("Local functions");
		declareLocalesFunctions();

		declareSection("Class methods");
		declareClassMethods();

		setEndOfFile();
		closeGeneratedFile();
	}

}
