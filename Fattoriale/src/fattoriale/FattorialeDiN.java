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
public class FattorialeDiN extends Thread {
    private int n;
    int ris;
    public FattorialeDiN(int i){
        this.n=i;
            }

    
    public void run(){
        this.ris=this.n;
        for(int y=this.n-1;y>0;y--){
            this.ris=this.ris*y;
        }
        System.out.println(this.n+"="+ris);
    }
    
}
