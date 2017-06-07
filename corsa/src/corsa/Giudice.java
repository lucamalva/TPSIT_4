
package corsa;

/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    
    private Pista pista;
    private String vincitore = "";
    
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        Atleta a1 = new Atleta("levriero italiano",this.pista.icoAtleta1,this);                                       
        Atleta a2 = new Atleta("levriero africano",this.pista.icoAtleta2,this);
        Atleta a3 = new Atleta("levriero afgano",this.pista.icoAtleta3,this);

        a1.start();
        a2.start();
        a3.start();
        this.pista.statoGara.setText("Gara iniziata");
        try{
            a1.join();
            a2.join();
            a3.join();
        }
        catch(Exception e){
            
        }
        this.pista.statoGara.setText("Gara conclusa, ha vinto "+this.getVincitore());
    }
    
    synchronized public void hoFinito(String nomeAtleta){
        if(this.vincitore==""){
            this.vincitore = nomeAtleta;
        }
    }
    
    public String getVincitore(){
        return this.vincitore;
    }
}
