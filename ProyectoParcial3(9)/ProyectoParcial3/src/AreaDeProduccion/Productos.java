/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaDeProduccion;

import AdministracionTotal.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osvaldo
 */
public class Productos extends javax.swing.JFrame{

    private Conexion conexion= new Conexion();
    private FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivo de imagen","jpg");
    String rutaimagen;
    public Productos() {
      initComponents();
      
      enablingReset();
      
        rutaimagen="";
        generarTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idpro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        stock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        costoE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        añadir = new javax.swing.JButton();
        buscaimagen = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        icn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        busqueda = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ordenpor = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        formapor = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        productosTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Codigo del producto:");

        idpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idproKeyTyped(evt);
            }
        });

        jLabel2.setText("Descripcion del producto:");

        des.setColumns(20);
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        jLabel3.setText("Stock:");

        jLabel4.setText("Costo de elaboracion:");

        costoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoEKeyTyped(evt);
            }
        });

        jLabel5.setText("Precio:");

        pre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preKeyTyped(evt);
            }
        });

        añadir.setText("Añadir producto");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        buscaimagen.setText("Busca Imagen");
        buscaimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaimagenActionPerformed(evt);
            }
        });

        jLabel12.setText("URL DE IMAGEN :");

        ruta.setText("ruta");

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icn, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setText("Foto de Producto");

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        busqueda.setBorderPainted(false);
        busqueda.setContentAreaFilled(false);
        busqueda.setFocusable(false);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock)
                                    .addComponent(pre))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(costoE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añadir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editar))
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ruta))
                                    .addComponent(buscaimagen))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busqueda)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(busqueda))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(añadir))
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ruta))
                        .addGap(18, 18, 18)
                        .addComponent(buscaimagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(editar)
                    .addComponent(eliminar)
                    .addComponent(cancelar))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Ordenar Por..");

        ordenpor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "códigoProducto ", "descripción", "stock", "costo_elaboración", "precio" }));
        ordenpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenporActionPerformed(evt);
            }
        });

        jLabel7.setText("De Forma..");

        formapor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        formapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaporActionPerformed(evt);
            }
        });

        productosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(productosTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordenpor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formapor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ordenpor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(formapor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaimagenActionPerformed
        //Crear un object de JFIle Chosser
        JFileChooser dig= new JFileChooser();
        //Del objecto creado vamos a llamar al metodo setFileChooser
        dig.setFileFilter(filter);
        //abrimemos la ventana de dialogo parta escojer la imagen
        int opc= dig.showOpenDialog(this);
        //si hacemos click el bton de abrir
        if(opc==JFileChooser.APPROVE_OPTION){
            //obtener el nombre del archivo
            String fil=dig.getSelectedFile().getPath();
            //obtener la direccion dnde se guarda la imagen
            String file=dig.getSelectedFile().toString();
            icn.setIcon(new ImageIcon(fil));
            //Modificamos la imagen
            ImageIcon icon = new ImageIcon(fil);
            //extraer la imagen de icono
            Image img = icon.getImage();
            //cambiando tamaño a nuestra imagen
            Image newIcon= img.getScaledInstance(266, 233, java.awt.Image.SCALE_SMOOTH);
            //se genera la imagen de icono con la new
            ImageIcon neWIcon= new ImageIcon(newIcon);
            icn.setIcon(neWIcon);
            imagen.setSize(266,235);
            ruta.setText(fil);
            rutaimagen="";

        }
    }//GEN-LAST:event_buscaimagenActionPerformed

    private void idproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_idproKeyTyped

    private void preKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_preKeyTyped

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        if(c!='.'){
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        }
    }//GEN-LAST:event_stockKeyTyped

    private void costoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoEKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        if(c!='.'){
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        }
    }//GEN-LAST:event_costoEKeyTyped

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        try{
        conexion.setCodProduc(Integer.parseInt(idpro.getText()));
        conexion.setdescProduc(des.getText());
        conexion.setPrecioProduc(Float.parseFloat(pre.getText()));
        conexion.setStockProduc(Integer.parseInt(stock.getText()));
        conexion.setCostElbProduc(Float.parseFloat(costoE.getText()));
        conexion.getProductos();
        generarTable();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Verifica bien los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        enablingReset();
    }//GEN-LAST:event_añadirActionPerformed

    private void ordenporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenporActionPerformed
        generarTable();
    }//GEN-LAST:event_ordenporActionPerformed

    private void formaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaporActionPerformed
        generarTable();
    }//GEN-LAST:event_formaporActionPerformed

    private void activarCampos(boolean t){
        idpro.setEnabled(t);
        des.setEnabled(t);
        pre.setEnabled(t);
        stock.setEnabled(t);
        costoE.setEnabled(t);
        buscaimagen.setEnabled(t);
    }
    
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        activarCampos(true);
        añadir.setEnabled(true);
        busqueda.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        cancelar.setEnabled(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        try{
            int cod= Integer.parseInt(idpro.getText());
            ResultSet rs=conexion.setBusqueda("inventarioProductos", "códigoProducto", cod);
            if(rs.next()){
                this.des.setText(rs.getString(2));
                this.stock.setText(rs.getString(3));
                this.costoE.setText(rs.getString(4));
                this.pre.setText(rs.getString(5));
                this.nuevo.setEnabled(false);
                this.añadir.setEnabled(false);
                this.editar.setEnabled(true);
                this.eliminar.setEnabled(true);
                cancelar.setEnabled(true);
                this.activarCampos(true);
                idpro.setEnabled(false);
            }else{
                idpro.setText("");
                JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Producto" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el Código del Producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(Exception d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_busquedaActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try{
            conexion.setCodProduc(Integer.parseInt(idpro.getText()));
            conexion.setdescProduc(des.getText());
            conexion.setPrecioProduc(Float.parseFloat(pre.getText()));
            conexion.setStockProduc(Integer.parseInt(stock.getText()));
            conexion.setCostElbProduc(Float.parseFloat(costoE.getText()));
            conexion.getUpdateProductos(Integer.parseInt(this.idpro.getText()));
            generarTable();
        }catch (Exception a){
            JOptionPane.showMessageDialog(null, "Error BD: " + a.getMessage());
        }
        limpiarCampos(); 
        enablingReset();
    }//GEN-LAST:event_editarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        enablingReset();
    }//GEN-LAST:event_cancelarActionPerformed

    
    private void enablingReset(){
        activarCampos(false);
        idpro.setEnabled(true);
        nuevo.setEnabled(true);
        añadir.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        busqueda.setEnabled(true);
    }
    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        conexion.setEliminarRegistro("inventarioProductos", "códigoProducto", Integer.parseInt(this.idpro.getText()),"ventas","códigoProducto");
        generarTable();
        enablingReset();
    }//GEN-LAST:event_eliminarActionPerformed

    private void limpiarCampos(){
        idpro.setText("");
        des.setText("");
        pre.setText("");
        stock.setText("");
        costoE.setText("");
    }
    
    private void generarTable(){
        DefaultTableModel modelo = new DefaultTableModel(){
            //TE PERMITE MODIFICAR LA ESTRUCTURA DE LA TABLA
            //NO SE PUEDE EDITAR LA TABLA
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("ID Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock");
        modelo.addColumn("Capital invertido");
        modelo.addColumn("Precio Unitario");
        String por= ordenpor.getSelectedItem().toString();
        String order;
        if(formapor.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try{
            ResultSet rs=conexion.getProductos(por, order);
             while(rs.next()){
                 Object []ob=new Object[5];
                 ob[0]=(rs.getInt(1));
                 ob[1]=(rs.getString(2));
                 ob[2]=(rs.getInt(3));
                 ob[3]=(rs.getFloat(4));
                 ob[4]=(rs.getFloat(5));
                 modelo.addRow(ob);
                 ob=null;
                    
             }
             rs.close();
             
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA O SALIDA DE DATOS  ", null, JOptionPane.ERROR_MESSAGE);
            
        }
        productosTable.setModel(modelo);
    }
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton buscaimagen;
    private javax.swing.JToggleButton busqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField costoE;
    private javax.swing.JTextArea des;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox formapor;
    private javax.swing.JLabel icn;
    private javax.swing.JTextField idpro;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nuevo;
    private javax.swing.JComboBox ordenpor;
    private javax.swing.JTextField pre;
    private javax.swing.JTable productosTable;
    private javax.swing.JLabel ruta;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
