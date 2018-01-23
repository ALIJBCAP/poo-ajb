/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ajb;

/**
 *
 * @author T-102
 */
public class PooAjb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO");
        
        //Tenemos que generar los objetos de las clases anteriore
        Usuario x=new Usuario();
        x.setAltura(1.70f);
        x.setPeso(70f);
        Imc algo=new Imc ();
        algo.u=x;
        //Calculasmos el Imc atravez del objeto
        System.out.println(algo.calcular());
        
    }
    
}
