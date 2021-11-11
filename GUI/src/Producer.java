import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    Buffer buffer;
    int identifier;
    private volatile boolean stopRequested = false;
    boolean status = true;
    //Variable que nos permite manejar el tiempo de espera
    private int ms = 0;
    //Variables para crear un rango de datos
    private int min = 0;
    private int max = 1;
    Producer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.identifier = id;
    }
    
    public void setms(int ms){
        this.ms = ms;
    }
    //Funciones para cambiar valores de min y max
    public void setmin(int minimo){
        this.min = minimo;
    }
    public void setmax(int maximo){
        this.max = maximo;
    }
    public void setStatus(boolean stat){
        this.status = stat;
    }
    
    public void requestStop() {
        stopRequested = true;
    }
            
    @Override
    public void run() {
        
        System.out.println("Running Producer...");
        /*Variable encargada de ofrecer los tipos de operaciones*/
        String products = "+-*/";
        /*Variables encargadas crear datoa aleatorios*/
        Random r = new Random(System.currentTimeMillis());
        Random random = new Random();
        /*Variable que alojara el tipo de operacion*/
        char operador;
        
        while(stopRequested){
            /*Random para elegir la operacion*/
            operador = products.charAt(r.nextInt(4));
            /*Creacion de los valores dentro del rango elegido*/
            int value1 = (int) (Math.random()*(max-min)) + min;
            int value2 = (int) (Math.random()*(max-min)) + min;
            /*Almacenamiento dentro del buffer en formato scheame ejemplo: (- 1 2)*/
            this.buffer.produce(this.identifier + " " + operador + value2 + value1);
           
            //System.out.print("Producer " + identifier + " produced: " + operador + " " +value2 +" "+ value1);
            
            try {
                System.out.println("Productor #" + identifier + " Durmiendo");
                 Thread.sleep(ms);   
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
