/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author T-102
 */
public class TareaX extends Thread{
    public void run (){
        System.out.println("soy un thred muy sensillo"+"y me llamo"+Thread.currentThread().getName());
    }
}
