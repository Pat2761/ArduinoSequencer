package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.ArduinoGrafcet.Transition;
import org.bpy.electronic.ArduinoGrafcet.TransitionAction;

public class GrafcetHeaderCodeGenerator extends AbstractHeaderCodeGenerator {

   private Grafcet grafcet;

   public GrafcetHeaderCodeGenerator(Model model, Grafcet grafcet) {
      super(model);
      this.grafcet = grafcet;
   }

   @Override
   public void declareExternalVariableDeclaration() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   public void declareExternalConstantsDeclaration() throws IOException {
      writer.write("extern const tGrafcetStepDescription " + grafcet.getName() + "Description;\n");
      writer.newLine();
   }

   @Override
   public void declareClassDescription() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   public void declareExternalFunctionsDeclaration() throws IOException {
      
      setStartCommentBlock();
      writer.write(" * Declare all step functions of the grafcet\n");
      setCloseCommentBlock();
      for (GrafcetStep step : grafcet.getSteps()) {
         StringBuilder strBuilder = new StringBuilder("extern uint8_t ");
         strBuilder.append(step.getName());
         strBuilder.append("(uint8_t currentStep);\n");
         writer.write(strBuilder.toString());
      }
      writer.newLine();
      
      List<String> transitions = new ArrayList<>();
      List<String> actions = new ArrayList<>();
      for (GrafcetStep step : grafcet.getSteps()) {
         for (GrafcetElement element : step.getGrafcetElements()) {

            if (element instanceof TransitionAction transitionAction) {
               addFunctionIfNeeded(transitions, transitionAction.getTransitionFct());
               addFunctionIfNeeded(actions, transitionAction.getActionFct());
            
            } else if (element instanceof Action action) {
               addFunctionIfNeeded(actions, action.getActionFct());

            } else if (element instanceof Transition transition) {
               addFunctionIfNeeded(transitions, transition.getTransitionFct());
            }
          }   
       }
      
      setStartCommentBlock();
      writer.write(" * Declare all transitions of the grafcet\n");
      setCloseCommentBlock();
      Collections.sort(transitions);
      for (String transition : transitions) {
         StringBuilder strBuilder = new StringBuilder("extern boolean ");
         strBuilder.append(transition);
         strBuilder.append("(void);\n");
         writer.write(strBuilder.toString());
      }
      writer.newLine();

      setStartCommentBlock();
      writer.write(" * Declare all actions of the grafcet\n");
      setCloseCommentBlock();
     Collections.sort(actions);
      for (String action : actions) {
         StringBuilder strBuilder = new StringBuilder("extern void ");
         strBuilder.append(action);
         strBuilder.append("(void);\n");
         writer.write(strBuilder.toString());
      }
   }

   private void addFunctionIfNeeded(List<String> functionList, String fctName) {
      if (!functionList.contains(fctName)) {
         functionList.add(fctName);
      }
      
   }

   @Override
   public void declareExternalClassInstanciation() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   public String getFileName() {
      return grafcet.getName() + "_cfg.hpp";
   }

   @Override
   public Map<String, String> getSystemInclusionCollection() {
      Map<String, String> includes = new HashMap<>();
      includes.put("Arduino.h", "For data types definitions");
      return includes;
   }

   @Override
   public Map<String, String> getProjectInclusionCollection() {
      Map<String, String> includes = new HashMap<>();
      includes.put("Sequencer.hpp", "need type definitions for the sequencer");
      return includes;
   }

   @Override
   public void declarePreprocessorConstants() throws IOException {
      setStartCommentBlock();
      writer.write(" * Define the Step constants\n");
      setCloseCommentBlock();
      writer.newLine();
      
      writer.write("// Define the number of steps in the grafcet\n");
      StringBuilder strBuilder = new StringBuilder("#define ");
      strBuilder.append(convertToUpperSnakeCase(grafcet.getName()));
      strBuilder.append("_NB_STEPS ");
      strBuilder.append(addNeededSpace(strBuilder.toString(), CONSTANTE_VALUE_LOCATION));
      strBuilder.append(grafcet.getSteps().size() + "\n");
      writer.write(strBuilder.toString());
      writer.newLine();
      
      int order = 0;
      GrafcetEntryPoint entryPoint = grafcet.getEntryPoint();
      if (entryPoint != null) {
         GrafcetStep step = entryPoint.getStep();
         exportStepConstant(step, order++);
         
         for (GrafcetStep otherStep : grafcet.getSteps()) {
            if (otherStep != step) {
               exportStepConstant(otherStep, order++);
            }
         }
      }
   }

   private void exportStepConstant(GrafcetStep step, int order) throws IOException {
      writer.write("// Step identifier : " + step.getComment() + "\n");
      StringBuilder strBuilder = new StringBuilder("#define ");
      strBuilder.append(convertToUpperSnakeCase(step.getName()));
      strBuilder.append("_STEP_ID");
      strBuilder.append(addNeededSpace(strBuilder.toString(), CONSTANTE_VALUE_LOCATION));
      strBuilder.append(order + "\n");
      writer.write(strBuilder.toString());
   }

   @Override
   public void declarePreprocessorMacros() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   public void declareTypeDeclaration() throws IOException {
      // TODO Auto-generated method stub

   }

}
