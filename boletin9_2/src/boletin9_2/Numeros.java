/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author acomesanavila
 */
public class Numeros {
    public void suma (){
       float x = 10;
       float suma=0;
         do{
         suma=suma+x;
         x++;
         }while (10<x&&x<90);
         System.out.println("suma= "+suma);   
    }
    public void producto (){
    float x=10;
    double producto=1;
         do{
         producto=producto*x;
         x++;
         }while (10<x&&x<90);
         System.out.println("producto= "+producto); 
}
}
