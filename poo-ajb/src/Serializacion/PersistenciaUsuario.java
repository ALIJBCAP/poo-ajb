/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

/**
 *
 * @author T-102
 */
import java.io.*;
public class PersistenciaUsuario {
  Usuario u;
//generamos el metodo para serializar a nuestro usuario                             

  public void guardar(){
      // para serializar el primer paso es genertar el archivo ffisico donde estara nuestro objeto de tipo usuario         
      File file=new File("archivaldo.ali");
      //despues lo abrimos para escribir sobre el 
      try{
      FileOutputStream fos=new FileOutputStream(file);
      //Luego Serializamos
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      //Guardamos Nuestro Usuario
      oos.writeObject(u);
      //ponemos un mensajito        
          System.out.println("Objeto guardado con exito!!");
      
  } catch(Exception e)
      
  {
  }
  }
  
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    public Usuario recobrarUsuario(){
        File file=new File("archivaldo.ali");
        Usuario recobrado=null;
                // el proceso inverso
                
    try{
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        recobrado= (Usuario)ois.readObject();
        
        
    }catch(Exception e){
        
    }
  return recobrado;
    }
}
