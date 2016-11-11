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
        int z=0;
        int c=0;
        int y=0;
        do{
        int x=Integer.parseInt( JOptionPane.showInputDialog("numero:"));
        if (x>0)
        z++;
        else 
            if (x<0)
        c++;
            else 
        y++;
        }while ((y+z+c)<10);
        System.out.println("positivos= "+z+" negativos= "+c+" ceros= "+ y);
   }
    
}
