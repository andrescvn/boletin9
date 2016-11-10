/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int e;
        Tabla tabla=new Tabla();
        do{
            do{
        e=Integer.parseInt(JOptionPane.showInputDialog("numero"));
            }while(e<0);
        tabla.multiplicar(e);
        }while (e!=0);

    }
    
}
