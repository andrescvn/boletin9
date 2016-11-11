/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Numeros {
   public void Numeros (){
        int num=0;
        do{
        int x=Integer.parseInt( JOptionPane.showInputDialog("numero:"));
        if (x>0)
            System.out.println("positivo");
        else 
            if (x<0)
                System.out.println("negativo");
            else 
                System.out.println("cero");
        num++;
        }while (num<10);
   }
    
}
