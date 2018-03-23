/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
//segunda forma de crear un thread:implementando la inteface Runnable
public class ProbarThread implements Runnable{
    public static void main(String[] args) {
        //1 crear el thread
        TareaX t1=new TareaX();
         TareaX t2=new TareaX();
         Runnable r=new ProbarThread();
         Thread t3=new Thread(r);
         Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         
         
         
        //inicializar
        t1.setName("Floky");
        t1.start();
        t2.start();
        t3.start();
        //en ejecucion lo de la JVM decide
        
        //pausa no lo vamos a poner aqui , en este caso que haga que dure cierto tiempo
    }

    @Override
    public void run() {

        while(true){
        LocalTime tiempo= LocalTime.now();
        int hora = tiempo.getHour();
        int minuto =tiempo.getMinute();
        int segundo = tiempo.getSecond();
        System.out.println("La hora es"+hora+":"+minuto+":"+segundo);
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarThread.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    }
    
    }
