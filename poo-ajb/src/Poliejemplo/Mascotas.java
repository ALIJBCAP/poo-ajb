/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliejemplo;
import java.util.*;
/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
       //Primero Generamos a los Gatos       
       Animal animales[]= new Animal [13];
       animales[0]=new Gato();
       animales[1]=new Gato();
       animales[2]=new Gato();
       //Siguen los perros
       animales[3]=new Perro();
       animales[4]=new Perro();
       //Siguen los pollos
       animales[5]=new Pollo();
       animales[6]=new Pollo();
       animales[7]=new Pollo();
       animales[8]=new Pollo();
       animales[9]=new Pollo();
       
       animales[10]=new Raton();
       animales[11]=new Raton();
       animales[12]=new Raton();
       //mnagia del polimorfismo    
       ServicioAnimales s = new ServicioAnimales();
       for( Animal a :animales){
           s.servicioHacerRuido((Comportamiento)a);
       }
       
       //
       ArrayList<Animal> animalito = new ArrayList<>();
       animalito.add(new Pollo());
       animalito.add(new Raton());
       animalito.add(new Raton());
       animalito.add(new Raton());
       animalito.add(new Perro());
       animalito.add(new Gato());
            for( Animal a :animales){
           s.servicioHacerRuido((Comportamiento)a);
            }
           animalito.get(0).setEdad(1);
           System.out.println(animalito.get(0).getEdad());
       
       
       
    }
    
}
