/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Soldo {
    private double soldo;
    private int n=0,x=0,y=0;  
    public void soldo(){
    do{
        do{
        soldo=Double.parseDouble(JOptionPane.showInputDialog("soldo")); 
        }while (soldo<0);
        if (soldo>=1000&&soldo<=1750){
            n++;
            }
        else if (soldo<1000&&soldo>0)
            x++;
        else if (soldo!=0)
            y++;
    }while (soldo!=0);
        int t=x+n+y;
        System.out.println("soldo menos de 1000="+ ((float)x/t*100)+ "%");
        System.out.println("numero de persoas entre 1000 e 1750="+n);
    }
}
