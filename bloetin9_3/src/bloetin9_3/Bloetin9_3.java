/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloetin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Bloetin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Rectangulo rect=new Rectangulo ();
            float ba,al;       
        do{
        ba=Integer.parseInt(JOptionPane.showInputDialog("base"));
        al=Float.parseFloat(JOptionPane.showInputDialog("altura"));
        }while(ba<=0||al<=0);
        rect.area(ba, al);
        }
    
         
    }
    

