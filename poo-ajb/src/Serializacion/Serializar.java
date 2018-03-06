/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.*;
public class Serializar {
    public static void main(String[] args) {
        //primero generamos un ususario
        Usuario u=new Usuario(20,"pedro");
        //Generamos un modelo de la clase a serializar
        PersistenciaUsuario p=new PersistenciaUsuario();
        //ajustamos su atributo usuario
        p.setU(u);
        //ahora al comprimir
        p.guardar();
    }
    
}
