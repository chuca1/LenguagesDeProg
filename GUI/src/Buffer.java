
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;


public class Buffer {
    


    //Nos permite crear un tamaño predeterminado para el buffer
    private int size = 0;
    //Nos permite crear un buffer de tamaño variable 
    private LinkedList<String> buffer = new LinkedList<String>();
  
    /*ELEMENTOS OBTENIDOS PARA MANEJAR EL LLENADO DE LAS TABLAS, SPINNER Y PROGRESS BAR*/
    private DefaultTableModel jTable2 = new DefaultTableModel();
    private DefaultTableModel jTable1 = new DefaultTableModel();
    private javax.swing.JTable jTable1Model;
    private javax.swing.JTable jTable2Model;
    private javax.swing.JSpinner spinner;
    private javax.swing.JProgressBar progress;        
    
    /*SETTERS NECESARIOS PARA TRAER ELEMENTOS DEL GUI Y PODER MODIFICARLOS*/
    
     /* Funcion creada para traer los objetos tipos tabla del GUI
     * @param table1 Tabla dedicada a colocar elementos que los productores crean
     * @param table2 Tabla de almacen para lo consumido
     */
    public void setTables(javax.swing.JTable table1, javax.swing.JTable table2){
        this.jTable1Model = table1;
        this.jTable2Model = table2;
        this.setModelo2();
        this.setModelo1();
    }
    public void setSpinner(javax.swing.JSpinner spin){
        this.spinner = spin;
    }
    public void setProgress( javax.swing.JProgressBar bar){
        this.progress = bar;
    }
    
    /**
     * Setter creado para el tamaño del buffer
     * @param s 
     */
    public void setSize(int s){
        this.size = s;
    }
    
    /*FIN DE LOS SETTERS*/
    
    private void refreshProgress(){
        double sizeDouble = this.size * 1.0; //Dividendo 
        double taskToBeDone = this.buffer.size() * 1.0;
        this.progress.setValue((int) ((((sizeDouble - taskToBeDone)/sizeDouble))*100));
    }
    
    private static void clearTable(final DefaultTableModel table) {
        for (int i = 0; i < table.getRowCount(); i++)
            for(int j = 0; j < table.getColumnCount(); j++) {
            table.setValueAt("", i, j);
            }
    }
    /*CODIFICACION PARA MODIFICAR TABLAS Y PROGRESS BAR*/
        /*ELEMENTOS PARA TABLA 1 Y PROGRESS BAR*/
    
    private void refreshTable1(){
         /*FALTA HACER QUE LA TABLA SEA DINAMICA Y TOME EL TAMAÑO DE BUFFER*/
        this.clearTable(jTable1);
        int i;
        for (i = 0; i <this.buffer.size(); i++){
            if (i < size){
                
                char id = buffer.get(i).charAt(0);
                String datos = buffer.get(i);
                String[] parts = datos.split(" ");
                char[] parts2 = new char[parts[1].length()];
                for (int k = 0; k < parts[1].length(); k++){
                    parts2[k] = parts[1].charAt(k);
                }
                
                this.jTable1.setValueAt(id, i, 0);
                this.jTable1.setValueAt(parts2[0] + " " + parts2[1] + " " + parts2[2], i, 1); 
                
            }
        }
    }
    
     private void setTable1(){
        Object[] datos = new Object[jTable1.getColumnCount()];
        this.jTable1.setRowCount(0);
        for(int i = 0; i < this.size; i++){
            this.jTable1.insertRow(0, datos);
        }
        this.jTable1Model.setModel(jTable1);
    }  
    private void setModelo1(){
       String[] header = {"ID", "Tarea"};
       this.jTable1.setColumnIdentifiers(header);
       jTable1Model.setModel(jTable1);
       setTable1();
    }
    
        /*FIN DE LOS ELEMENTOS DE TABLA 1 Y PROGRESS BAR*/
    
        /*ELEMENTOS PARA TABLA 2*/
    /**
     * Nos permite iniciar la creacion de la tabla de resultados cada vez
     * que iniciamos el programa
     */
    private void setModelo2(){
       String[] header = {"ID", "Tarea", "Resultado"};
       this.jTable2.setColumnIdentifiers(header);
       jTable2Model.setModel(jTable2);
    }
        /**
     * Funcion que es llamada cada vez que un elemento es consumido y que nos 
     * permite actualizar la tabla de resultados
     * @param id identificador del consumidor que resolvio el problema
     * @param data operacion a realizar
     */
    private void setTable2(int id, String data){
        Object[] datos = new Object[jTable2.getColumnCount()];
        
        datos[0] = String.valueOf(id);
        String[] parts;
        /*Creado para evitar errores en donde los datos eran NULL por una extraña
            razón*/
        if (data != null){
            parts = data.split(" ");
            char[] parts2 = new char[parts[1].length()];
                for (int k = 0; k < parts[1].length(); k++){
                    parts2[k] = parts[1].charAt(k);
            }
            datos[1] = parts2[0] + " " + parts2[1] + " " + parts[2];
            datos[2] = resultado(parts[1]);   
            this.jTable2.insertRow(0, datos);
            this.jTable2Model.setModel(jTable2);
            this.spinner.setValue(this.jTable2.getRowCount());  
        }

    }
    
    /**
     * Funcion que realiza la operacion necesaria con los datos del consumidor
     * @param operacion Contiene tipo de operacion y los datos a operar
     * @return 
     */
    private String resultado(String operacion){
        char tipo = operacion.charAt(0);
        double value1 = Double.parseDouble(Character.toString(operacion.charAt(1)));
        double value2 = Double.parseDouble(Character.toString(operacion.charAt(2)));
        
        if(tipo == '/'){
            if(value1 == 0.0 && value2 == 0.0){
                return "Error";
            }
            return String.valueOf(value1 / value2);

        }else if (tipo == '*'){
            return String.valueOf(value1 * value2);
        }else if (tipo == '+'){
            return String.valueOf(value1 + value2);
        }else{
            return String.valueOf(value1 - value2);

        }   
    }

    /*FIN DE TABLAS*/
    
    


    /*INICIALIZACION DEL BUFFER*/
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
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //Obtiene y regresa la cabeza del Queue
        product = this.buffer.poll();

        refreshProgress();
        setTable2(id, product);
        refreshTable1();
        refreshProgress();
        notifyAll();

        return product;
    }
    
    /**
     * Funcion encargada de procesar la creacion de nuevos elementos
     * @param product cadena de caracteres en formato Scheme que hacen una operacion basica
     * @param id identificador unico de cada productor
     */
    synchronized void produce(String product) {
        
        /**
         * Creado para verificar si el buffer se encuentra lleno, se espera cuando es así
         */
        if(this.buffer.size() >= size) {
            try {
                System.out.println("Buffer Lleno, Durmiendo");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(product != null){
            refreshProgress();
            this.buffer.add(product);
            refreshTable1();
            refreshProgress();
            notifyAll();  
        }
        
    }
    
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
        
    }
    
}

