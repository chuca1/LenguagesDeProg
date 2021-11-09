


import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    /*Variables necesarias*/
    Buffer buffer;
    int identifier;
    boolean status = true;
    private int ms = 0;
    
    
    Consumer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.identifier = id;
        
    }

    /**
     * Setter para el tiempo de espera
     * @param ms tiempo en milisegundos que tendra que esperar el consumidor 
     *              para volver a consumir.
     */
    public void setms(int ms){
        this.ms = ms;
    }
    /**
     * Setter para terminar o iniciar el proceso de consumidor
     * @param stat boolean que permite indicar el estado del consumidor
     */
    public void setStatus(boolean stat){
        this.status = stat;
    }

    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        while(status){
            product = this.buffer.consume(this.identifier);
            //System.out.println("Consumer consumed: " + product);
            //Buffer.print("Consumer " + identifier + "consumed: " + product);
            
            try {
                System.out.println("Consumidor" + identifier + " Durmiendo");
                 Thread.sleep(ms);   
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
