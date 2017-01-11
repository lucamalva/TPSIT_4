/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrorettangolo;

import java.util.Scanner;


/**
 *
 * @author studente
 */
public class AreaPerimetroRettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int h;
     int b;
     int a;
     int p;
     
     Scanner input=new Scanner(System.in);

     
     System.out.println("Inserire base rettangolo");
     b=input.nextInt();
     System.out.println("Inserire altezza rettangolo");
     h=input.nextInt();
     
     p=(b+h)*2;
     a=b*h;
 
     
     System.out.println("Perimetro= "+p);
     System.out.println("Area= "+a);


     
    }
    
}
