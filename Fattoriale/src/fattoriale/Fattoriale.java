/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattoriale;

/**
 *
 * @author Studente
 */
public class Fattoriale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
          FattorialeDiN f= new FattorialeDiN(i); 
          f.start();   
        }
       
        
        
        // TODO code application logic here
    }
    
    
}
