/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Series {
    public void serie1 () {
      int e=0;
      int x=1;
      int num=Integer.parseInt(JOptionPane.showInputDialog("numero de veces"));
        do{
            System.out.print("+"+e);
            e+=2;
            x++;
        }while(x<=num);
  }
    public void serie2(){
        int e=1;
        int x=Integer.parseInt(JOptionPane.showInputDialog("numero de veces"));
                do{
                    System.out.print("-"+e);
                    e++;
                    if (e<x)
                    System.out.print("+"+e);
                    e++;
                }while (e<=x);
    }
    public void serie3(){
        int e=0;
        int x=1;
        int y=1;
        int num=Integer.parseInt(JOptionPane.showInputDialog("numero de veces"));
        do{
            System.out.print(e);
            y++;
            if (y<=num)
            System.out.print(x);
            y++;
            e=x+e;
            x=x+e;
        }while(y<=num);
    }
}

