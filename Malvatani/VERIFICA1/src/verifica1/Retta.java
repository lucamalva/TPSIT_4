/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verifica1;



/**
 *
 * @author Studente
 */
public class Retta {
    public double p1;
    public double p2;
    public double p3;
    public String stampa(){
        
    }

    public String getTipo(){
        if(this.p1==0 && this.p2==0){
            return "obliquo";
        }
        if(this.p2==0){
            return "verticale";
        }
        if(this.p1==0){
            return "orizzontale";
        }
       
        
    }
    public Retta(double x,double y,double c){
        this.p1=x;
        this.p2=y;
        this.p3=c;
        
    
}

   
    }
    

