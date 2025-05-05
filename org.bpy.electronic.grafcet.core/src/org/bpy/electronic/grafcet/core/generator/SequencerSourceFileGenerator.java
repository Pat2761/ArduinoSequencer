package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.Model;

public class SequencerSourceFileGenerator extends AbstractSourceCodeGenerator {
	
	public SequencerSourceFileGenerator(Model model) {
		super(model);
	}

	@Override
	public String getFileName() {
		return "Sequencer.cpp";
	}

	@Override
	public Map<String, String> getSystemInclusionCollection() {
		Map<String,String> includes = new HashMap<>();
		includes.put("Arduino.h", "For data types definitions");
		return includes;
	}

	@Override
	public Map<String, String> getProjectInclusionCollection() {
		Map<String,String> includes = new HashMap<>();
		includes.put("Sequencer.hpp", "Include Sequencer header file");
		
		for (Grafcet grafcet : model.getGrafcets()) {
		   includes.put(grafcet.getName() + "_cfg.hpp", grafcet.getName() + " configuration");
		}
		return includes;
	}

	@Override
	public void declarePreprocessorConstants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declarePreprocessorMacros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareTypeDeclaration() throws IOException {
	   writer.write("typedef struct {\n");
	   writer.write("   const tGrafcetStatus state;\n");
	   writer.write("   const tGrafcetStepDescription grafcetDescriptions;\n");
	   writer.write("} tGrafcetDescription;\n");
	   writer.newLine();
	   
	   writer.write("typedef struct {\n");
	   writer.write("   tGrafcetStatus grafcetStatus;\n");
	   writer.write("   uint8_t currentStep;\n");
	   writer.write("} tGrafcetExecutionState;\n");
      writer.newLine();
	}

	@Override
	void declareComponentVariables() throws IOException {
		writer.write("tGrafcetExecutionState grafcetsExecutionState[NB_GRAFCETS];\n");
	}

	@Override
	void declareClassInstantiation() throws IOException {
		writer.write("Sequencer sequencer;\n");
	}

	@Override
	void declareLocalesFunctions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void declareClassMethods() throws IOException {
	   writer.write("void Sequencer::initialize(void) {\n");
	   writer.write("   uint8_t grafcetNumber;\n");
	   writer.write("\n");
	   writer.write("   for (grafcetNumber=0 ; grafcetNumber<NB_GRAFCETS ; grafcetNumber++) {\n");
	   writer.write("      grafcetsExecutionState[grafcetNumber].grafcetStatus = grafcetDescription[grafcetNumber].state;\n");
	   writer.write("      grafcetsExecutionState[grafcetNumber].currentStep = 0;\n");
	   writer.write("   }\n");
	   writer.write("}\n");
      writer.newLine();

	   writer.write("void Sequencer::engine(void) {\n");
	   writer.write(" uint8_t grafcetNumber;\n");
	   writer.write("\n");
	   writer.write("   for (grafcetNumber=0 ; grafcetNumber<NB_GRAFCETS ; grafcetNumber++) {\n");
	   writer.write("      if (grafcetsExecutionState[grafcetNumber].grafcetStatus == RUNNING) {\n");
	   writer.write("         uint8_t currentStep = grafcetsExecutionState[grafcetNumber].currentStep;\n");
	   writer.write("         uint8_t  (* stepFunction) (uint8_t currentStep) = grafcetDescription[grafcetNumber].grafcetDescriptions.stepFunction[currentStep];\n");
	   writer.write("         grafcetsExecutionState[grafcetNumber].currentStep = stepFunction(currentStep);\n");
	   writer.write("      }\n");
	   writer.write("   }\n");
	   writer.write("}\n");
	   writer.newLine();
	   
	   writer.write("void Sequencer::setState(uint8_t grafcetId, tGrafcetStatus state) {\n");
	   writer.write("   grafcetsExecutionState[grafcetId].grafcetStatus = state;\n");
	   writer.write("}\n");
      writer.newLine();
	}

   @Override
   void declareConstantVariables() throws IOException {
      StringBuilder strBuilder = new StringBuilder("const tGrafcetDescription grafcetDescription[NB_GRAFCETS] = {\n");
      
      int grafcetCounter;
      for (grafcetCounter = 0; grafcetCounter<model.getGrafcets().size(); grafcetCounter++) {

         strBuilder.append("   { ");
         Grafcet grafcet = model.getGrafcets().get(grafcetCounter);
         
         if (grafcet.isAutorun()) {
            strBuilder.append("RUNNING , ");
         } else {
            strBuilder.append("STOP    , ");
         }
         strBuilder.append(grafcet.getName() + "Description }");
         if (grafcetCounter < model.getGrafcets().size()-1) {
            strBuilder.append(",");
         }
         strBuilder.append("\n");
      }
      strBuilder.append("};");
      writer.write(strBuilder.toString());
      writer.newLine();
   }
}
