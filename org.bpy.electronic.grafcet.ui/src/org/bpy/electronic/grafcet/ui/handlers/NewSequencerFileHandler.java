package org.bpy.electronic.grafcet.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.bpy.electronic.ArduinoGrafcet.GrafcetFactory;
import org.bpy.electronic.ArduinoGrafcet.Model;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class NewSequencerFileHandler  implements IHandler  {

   @Override
   public void addHandlerListener(IHandlerListener handlerListener) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void dispose() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public Object execute(ExecutionEvent event) throws ExecutionException {
      ResourceSetImpl resourceSet = new ResourceSetImpl();
      URI fileURI = URI.createFileURI(new File("chemin/vers/model.grafcet").getAbsolutePath());
      Resource resource = resourceSet.createResource(fileURI);

      Model model = GrafcetFactory.eINSTANCE.createModel();
      resource.getContents().add(model);

      try {
         resource.save(Collections.EMPTY_MAP);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }

   @Override
   public boolean isEnabled() {
      // TODO Auto-generated method stub
      return true;
   }

   @Override
   public boolean isHandled() {
      // TODO Auto-generated method stub
      return true;
   }

   @Override
   public void removeHandlerListener(IHandlerListener handlerListener) {
      // TODO Auto-generated method stub
      
   }

}
