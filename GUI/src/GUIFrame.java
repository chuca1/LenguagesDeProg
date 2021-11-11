import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdegante
 */
public class GUIFrame extends javax.swing.JFrame {
    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
        initComponents();
        //setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSpinner4 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("Tiempo de Espera (ms)");

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setText("0");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel6.setText("Rango de Valores (n, m)");

        jTextField4.setText("0");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jLabel1.setText("Productores");

        jLabel2.setText("Consumidores");

        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSpinner1KeyPressed(evt);
            }
        });

        jLabel3.setText("Tamaño del Buffer");

        jLabel4.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner2)
                    .addComponent(jTextField3)
                    .addComponent(jSpinner1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuración", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Tarea"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tarea", "Resultado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Tareas por hacer");

        jLabel8.setText("Tareas realizadas");

        jProgressBar1.setValue(50);

        jSpinner4.setEnabled(false);

        jButton3.setText("Export To Excel");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(jSpinner4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesos", jPanel3);

        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean ready = false;
    ArrayList<Consumer> consumerList;
    ArrayList<Producer> producerList;
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Valores para creación de multitudes de elementos
        if(this.jTextField1.getText().isEmpty() || this.jTextField2.getText().isEmpty() || this.jTextField3.getText().isEmpty() || this.jTextField4.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos!","Error",JOptionPane.ERROR_MESSAGE,null);
            System.out.println("Todos los campos deben estar llenos!");
        }
        else{
        int producers = (Integer)this.jSpinner1.getValue();
        if (producers > 10 || producers < 1) {
            System.out.println("Los valores para Productor deben ser 1-10 ");
            JOptionPane.showMessageDialog(null, "El valor de productores debe de ser entre 1 y 10","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int consumers = (Integer)this.jSpinner2.getValue();
        if (consumers > 10 || consumers < 1) {
            System.out.println("Los valores para Consumidor deben ser 1-10 ");
            JOptionPane.showMessageDialog(null, "El valor de consumidores debe de ser entre 1 y 10","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int producersms = Integer.parseInt(this.jTextField1.getText());
        if (producersms > 10000 || producersms < 0) {
            System.out.println("Los valores en ms deben ser 0-10,000");
            JOptionPane.showMessageDialog(null, "El tiempo de espera del productor debe de ser entre 0 y 10000","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int consumersms = Integer.parseInt(this.jTextField2.getText());
        if (consumersms > 10000 || consumersms < 0) {
            System.out.println("Los valores en ms deben ser 0-10,000");
            JOptionPane.showMessageDialog(null, "El tiempo de espera del consumidor debe de ser entre 0 y 10000","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int min = Integer.parseInt(this.jTextField4.getText());
        if (min > 9 || min < 0) {
            JOptionPane.showMessageDialog(null, "El valor minimio del rango debe de ser entre 0 y 9","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int max = (Integer)this.jSpinner3.getValue();
        if (max > 9 || max < 0) {
            System.out.println("Rango de valores para las operaciones en scheme: [0, 9]");  
            JOptionPane.showMessageDialog(null, "El valor maximo del rango debe de ser entre 0 y 9","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        if (min >= max){
            System.out.println("Min debe ser diferente y menor a Max");  
            JOptionPane.showMessageDialog(null, "El valor minimo del rango debe de ser diferente y menor al maximo","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        int buffervalue = Integer.parseInt(this.jTextField3.getText());
        if (buffervalue > 100 || buffervalue < 1) {
            System.out.println("Rango de valores para el Buffer deben ser 1-100");
            JOptionPane.showMessageDialog(null, "El valor del buffer debe de ser entre 1 y 100","Error",JOptionPane.ERROR_MESSAGE,null);
            return;
        }
        /*Filtro para datos */
        /*FALTA CREAR CASOS ESPECIFICOS DONDE EL ESPACIO SEA VACIO*/
        if (!ready){
            ready = true; 
            consumerList = new ArrayList<Consumer>(producers);
            producerList = new ArrayList<Producer>(consumers);

            Buffer buffer = new Buffer();
            buffer.setSpinner(jSpinner4);
            buffer.setProgress(jProgressBar1);
            buffer.setSize(Integer.parseInt(this.jTextField3.getText()));
            buffer.setTables(jTable1, jTable2);
                                
            for (int i = 0; i < producers; i++){
                Producer producer = new Producer(buffer, i+1);
                producer.setms(producersms);
                producer.setmin(min);
                producer.setmax(max);
                producer.start();
                producerList.add(producer);
            }
            for (int i = 0; i < consumers; i++){
                Consumer consumer = new Consumer(buffer, i+1);
                consumer.setms(consumersms);
                consumer.start();
                consumerList.add(consumer);
            }
            this.jButton1.setText("Detener");
        } 
        else{
            System.out.print(producerList.size());
            System.out.print(consumerList.size());

            /*SE ENCUENTRA UN ERROR AL INTERRUMPIR ELEMENTOS QUE SE ENCUENTREN 
              DORMIDOS*/
            for (int i = 0; i < producers; i++){
                producerList.get(i).requestStop();
                //producerList.get(i).interrupt();
            }
            for (int i = 0; i < consumers; i++){
                consumerList.get(i).requestStop();
                //consumerList.get(i).interrupt();
            }
            this.jButton1.setText("Iniciar");
            JOptionPane.showMessageDialog(null, "Calculos Termiandos ve tabla en Procesos","Tarea detenida",JOptionPane.INFORMATION_MESSAGE,null);
            ready = false;
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            if(c != KeyEvent.VK_BACK_SPACE) {
                this.jTextField1.setEditable(false);
            } else {
                this.jTextField1.setEditable(true);
            }
        }else{
            this.jTextField1.setEditable(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            if(c != KeyEvent.VK_BACK_SPACE) {    
                this.jTextField2.setEditable(false);
            } else {
                this.jTextField2.setEditable(true);
            }
        }else{
            this.jTextField2.setEditable(true);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jSpinner1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            this.jSpinner1.setValue(0);
        } 
    }//GEN-LAST:event_jSpinner1KeyPressed
 
    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            if(c != KeyEvent.VK_BACK_SPACE) {    
                this.jTextField3.setEditable(false);
            } else {
                this.jTextField3.setEditable(true);
            }
        }else{
            this.jTextField3.setEditable(true);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            if(c != KeyEvent.VK_BACK_SPACE) {    
                this.jTextField4.setEditable(false);
            } else {
                this.jTextField4.setEditable(true);
            }
        }else{
            this.jTextField4.setEditable(true);
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void clearFields() {
        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextField3.setText(null);
        this.jTextField4.setText(null);
        this.jSpinner1.setValue(0);
        this.jSpinner2.setValue(0);
        this.jSpinner3.setValue(0);
        this.jSpinner4.setValue(0);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            JFileChooser jFileChooser = new JFileChooser();  
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                CreationHelper createHelper = wb.getCreationHelper();
                Sheet sheet = wb.createSheet("valoresGenerados");
                Row rowCol = sheet.createRow(0);
                for(int i=0; i< jTable2.getColumnCount();i++){
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(jTable2.getColumnName(i));
                }
                for (int j=0;j<jTable2.getRowCount();j++){
                    Row row = sheet.createRow(j);
                    for(int k=0; k < jTable2.getColumnCount(); k++){
                        Cell cell = row.createCell(k);
                        if (jTable2.getValueAt(j,k) != null) {
                            cell.setCellValue(jTable2.getValueAt(j,k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File (saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Error al generar archivo");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al generar archivo");
            System.out.println(e);
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "Error al generar archivo");
            System.out.println(io);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
