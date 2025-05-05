package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;

import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.sirius.business.api.session.Session;

public abstract class AbstractHeaderCodeGenerator extends AbstractCodeGenerator {

	public AbstractHeaderCodeGenerator(Model model) {
	   super(model);
	}

	public abstract void declareExternalVariableDeclaration() throws IOException;
	public abstract void declareExternalConstantsDeclaration() throws IOException;
	public abstract void declareClassDescription() throws IOException;
	public abstract void declareExternalFunctionsDeclaration() throws IOException;
	public abstract void declareExternalClassInstanciation() throws IOException;

	public void generate(String folder) throws IOException {
		createSourceFile(folder);
		
		setHeaderFileGeneration(model.getProjectName(), "Sequencer library");
		
		startMonoInclusion();
		
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
		
		declareSection("External variables declaration");
		declareExternalVariableDeclaration();

		declareSection("External constants declaration");
		declareExternalConstantsDeclaration();

		declareSection("Class declaration");
		declareClassDescription();

		declareSection("External functions declaration");
		declareExternalFunctionsDeclaration();

		declareSection("External Class instantiation");
		declareExternalClassInstanciation();

		closeMonoInclusion();	
		setEndOfFile();
		closeGeneratedFile();
	}
}
