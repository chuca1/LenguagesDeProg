
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Buffer {
    

    //Nos permite detener el buffer que es el corazón del proceso
    private boolean ready = false;
    //Nos permite crear un tamaño predeterminado para el buffer
    private int size = 0;
    //Nos permite crear un buffer de tamaño variable 
    private LinkedList<String> buffer = new LinkedList<String>();
    
    
    /*ELEMENTOS OBTENIDOS PARA MANEJAR EL LLENADO DE LAS TABLAS*/
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    
    /**
     * Funcion creada para traer los objetos tipos tabla del GUI
     * @param table1 Tabla dedicada a colocar elementos que los productores crean
     * @param table2 Tabla de almacen para lo consumido
     */
    public void setTables(javax.swing.JTable table1, javax.swing.JTable table2){
          this.jTable1 = table1;
        this.jTable2 = table2;
    }
    /*FIN DE TABLAS*/
    
    /**
     * Setter creado para el tamaño del buffer
     * @param s 
     */
    public void setSize(int s){
        this.size = s;
    }

    Buffer() {
        this.buffer.clear();
    }
    
    /**
     * Funcion encargada del proceso de consumir elementos del buffer
     * @param id elemento unico que distingue a los consumidores
     * @return 
     */
    synchronized String consume(int id) {
        String product ;
        

        if(this.buffer.isEmpty()) {
            try {
                //Hacer esperar al consumidor el mismo tiempo que tarda
                //en crear un  nuevo objeto el productor
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Obtiene y regresa la cabeza del Queue
        product = this.buffer.poll();
        //System.out.print(buffer + " ");
        
        notifyAll();

        return product;
    }
    
    /**
     * Funcion encargada de procesar la creacion de nuevos elementos
     * @param product cadena de caracteres en formato Scheme que hacen una operacion basica
     * @param id identificador unico de cada productor
     */
    synchronized void produce(String product, int id) {
        
        /**
         * Creado para verificar si el buffer se encuentra lleno, se espera cuando es así
         */
        if(this.buffer.size() >= size) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.buffer.add(product);

        /*FALTA HACER QUE LA TABLA SEA DINAMICA Y TOME EL TAMAÑO DE BUFFER*/
        for (int i = 0; i <this.buffer.size(); i++){
            if (i <= this.buffer.size()){
                this.jTable1.setValueAt(id, i, 0);
                this.jTable1.setValueAt(buffer.get(i), i, 1); 
            }
        }
        notifyAll();
    }
    
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
        
    }
    
}

