package org.bpy.electronic.grafcet.core.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bpy.electronic.ArduinoGrafcet.Action;
import org.bpy.electronic.ArduinoGrafcet.Grafcet;
import org.bpy.electronic.ArduinoGrafcet.GrafcetElement;
import org.bpy.electronic.ArduinoGrafcet.GrafcetEntryPoint;
import org.bpy.electronic.ArduinoGrafcet.GrafcetStep;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.bpy.electronic.ArduinoGrafcet.PassThrough;
import org.bpy.electronic.ArduinoGrafcet.Report;
import org.bpy.electronic.ArduinoGrafcet.Transition;
import org.bpy.electronic.ArduinoGrafcet.TransitionAction;

public class GrafcetSourceCodeGenerator extends AbstractSourceCodeGenerator {

   private Grafcet grafcet;

   public GrafcetSourceCodeGenerator(Model model, Grafcet grafcet) {
      super(model);
      this.grafcet = grafcet;
   }

   @Override
   void declareComponentVariables() {
      // TODO Auto-generated method stub

   }

   @Override
   void declareClassInstantiation() {
      // TODO Auto-generated method stub

   }

   @Override
   void declareLocalesFunctions() throws IOException {
      for (GrafcetStep step : grafcet.getSteps()) {
         
         setStartCommentBlock();
         
         StringBuilder strBuilder = new StringBuilder("   STEP: ");
         strBuilder.append((step.getComment() != null ? step.getComment() : ""));
         strBuilder.append("\n");
         strBuilder.append("   ------------------------------------------------------------------------------\n");
         strBuilder.append("   DESCRIPTION:\n");
         strBuilder.append((step.getDescription() != null ? step.getDescription() : ""));
         strBuilder.append("\n");
         writer.write(strBuilder.toString());
         setCloseCommentBlock();
         
         strBuilder = new StringBuilder("uint8_t ");
         strBuilder.append(step.getName());
         strBuilder.append("(uint8_t currentStep) {\n");
         writer.write(strBuilder.toString());
         createStepFunction(step);
         writer.newLine();
         writer.write("   return currentStep;\n");
         writer.write("}\n");
         writer.newLine();
      }
   }

   private void createStepFunction(GrafcetStep step) throws IOException {
      List<GrafcetElement> grafcetElements = new ArrayList<>();
      
      for (GrafcetElement element : step.getGrafcetElements()) {
         grafcetElements.add(element);
      }
      
      Collections.sort(grafcetElements, new Comparator<GrafcetElement>() {

        @Override
         public int compare(GrafcetElement o1, GrafcetElement o2) {
           Integer el1 = o1.getLocation();
           Integer el2 = o2.getLocation();
           return el1.compareTo(el2);
         }
      });
      
      int elementCounter = 0;
      StringBuilder builder = new StringBuilder();
      String spaceBefore = "   ";
      for (GrafcetElement element : grafcetElements) {
         
         if (element instanceof TransitionAction transitionAction) {
            builder.append(generateElement(transitionAction, spaceBefore));
         
         } else if (element instanceof Action action) {
            builder.append(generateElement(action, spaceBefore));
                    
         } else if (element instanceof Transition transition) {
            builder.append(generateElement(transition, spaceBefore));

         } else if (element instanceof PassThrough passThrough) {
            builder.append(generateElement(passThrough, spaceBefore));

         }
         if (elementCounter < grafcetElements.size()-1) {
            builder.append(" else ");
         }
         elementCounter++;
         
         spaceBefore = " ";
      }
      writer.write(builder.toString());
   }

   private Object generateElement(PassThrough passThrough, String spaceBefore) {
      StringBuilder builder = new StringBuilder(spaceBefore);
      builder.append(" {\n");
      builder.append(computeNextStep(passThrough));
      builder.append("   }");
      return builder.toString();
  }

   private Object generateElement(Transition transition, String spaceBefore) {
      StringBuilder builder = new StringBuilder(spaceBefore);
      builder.append("if (");
      builder.append(transition.getTransitionFct());
      builder.append("()) {\n");
      builder.append(computeNextStep(transition));
      builder.append("   }");
      return builder.toString();
  }

   private Object generateElement(Action action, String spaceBefore) {
      StringBuilder builder = new StringBuilder(spaceBefore);
      builder.append(" {\n");
      builder.append("      " + action.getActionFct());
      builder.append("();\n");
      builder.append(computeNextStep(action));
      builder.append("   }");
      return builder.toString();
   }

   private String generateElement(TransitionAction transitionAction, String spaceBefore) {
      StringBuilder builder = new StringBuilder(spaceBefore);
      builder.append("if (");
      builder.append(transitionAction.getTransitionFct());
      builder.append("()) {\n");
      builder.append("      " + transitionAction.getActionFct());
      builder.append("();\n");
      builder.append(computeNextStep(transitionAction));
      builder.append("   }");
      return builder.toString();
   }

   private String computeNextStep(GrafcetElement element) {
      if (element.getNextReportStep() != null) {
         Report report = element.getNextReportStep();
         GrafcetStep nextStep = report.getNextStep();
         return computeNextStep(nextStep);
      
      } else if (element.getNextStep() != null) {
         return computeNextStep(element.getNextStep());
      
      } else {
         return computeNextStep((GrafcetStep)null);
      }
      
   }

   private String computeNextStep(GrafcetStep nextStep) {
      if (nextStep == null) {
         StringBuilder strBuilder = new StringBuilder("      ");
         strBuilder.append("sequencer.setState(");
         strBuilder.append(convertToUpperSnakeCase(grafcet.getName()));
         strBuilder.append("_GRAFCET_ID, STOP);\n");
         return strBuilder.toString();
      }
      
      StringBuilder strBuilder = new StringBuilder("      currentStep = ");
      strBuilder.append(convertToUpperSnakeCase(nextStep.getName()));
      strBuilder.append("_STEP_ID");
      strBuilder.append(";\n");
      return strBuilder.toString();
   }

   @Override
   void declareClassMethods() {
      // TODO Auto-generated method stub

   }

   @Override
   public String getFileName() {
      return grafcet.getName() + "_cfg.cpp";
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
      includes.put("Sequencer.hpp", "For sequencer structures");
      for (Grafcet grafcet : model.getGrafcets()) {
         includes.put(grafcet.getName() + "_cfg.hpp", "Inclusion of the grafcet " + grafcet.getName());
      }
      return includes;
   }

   @Override
   public void declarePreprocessorConstants() throws IOException {
   }

   @Override
   public void declarePreprocessorMacros() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   public void declareTypeDeclaration() throws IOException {
      // TODO Auto-generated method stub

   }

   @Override
   void declareConstantVariables() throws IOException {
      setStartCommentBlock();
      writer.write("   Declare steps of the grafcet\n");
      setCloseCommentBlock();
      writer.newLine();
      
      StringBuilder builder = new StringBuilder("uint8_t (*");
      builder.append(grafcet.getName());
      builder.append("Steps[");
      builder.append(convertToUpperSnakeCase(grafcet.getName()));
      builder.append("_NB_STEPS])(uint8_t currentStep) = {\n");
      
      
      int stepCounter = 0;
      GrafcetEntryPoint entryPoint = grafcet.getEntryPoint();
      if (entryPoint != null) {
         GrafcetStep step = entryPoint.getStep();
         if (step != null) {
            exportStepDeclaration(builder, step, stepCounter++);
            for (GrafcetStep otherStep : grafcet.getSteps()) {
               if (otherStep != step) {
                  exportStepDeclaration(builder, otherStep, stepCounter++);
               }
            }
         }
      }
      
      builder.append("};\n");
      writer.write(builder.toString());
      writer.newLine();
      
      setStartCommentBlock();
      writer.write("   Declare grafcet configuration\n");
      setCloseCommentBlock();
      
      builder = new StringBuilder("const tGrafcetStepDescription ");
      builder.append(grafcet.getName());
      builder.append("Description {\n");
      builder.append("   " + (grafcet.isAutorun()? "RUNNING" : "STOP") + ",\n");
      builder.append("   ");
      builder.append(grafcet.getName());
      builder.append("Steps\n");
      builder.append("};\n");
      
      writer.write(builder.toString());
      writer.newLine();
   }

   private void exportStepDeclaration(StringBuilder builder, GrafcetStep step, int stepCounter) {
      builder.append("   " + step.getName() );
      if (stepCounter<grafcet.getSteps().size()) {
         builder.append(",");
      }
      builder.append("\n");
   }
}
