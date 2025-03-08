package exprendedoracongui;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;

public class GUIExprendedora extends javax.swing.JFrame {
    private int unidades = 0;
    private double totalCompra = 0;
    private ArrayList<Producto> prod = new ArrayList();
    private HashMap<Integer, Persona> cliente = new HashMap();
    private Persona persona;
    DefaultTableModel  tablaModelo;
    
    
    
    public GUIExprendedora() {
        initComponents();
        
        tablaModelo = (DefaultTableModel)tablaCompra.getModel();
        
        File prods = new File("Producto");
        Producto producto;
        try{
            Scanner leer = new Scanner(prods);
            while(leer.hasNext()){
                producto = new Producto();
                producto.setNombre(leer.next());
                producto.setPrecio(leer.nextDouble());
                producto.setCantidad(leer.nextInt());
                //producto.setCaracteristicas(leer.next());
                
                prod.add(producto);
                productos.addItem(producto.getNombre());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo de Productos no existe");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productos = new javax.swing.JComboBox<>();
        agregarProducto = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        cantidadAlmacen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        caracteristicas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precioTotalCompra = new javax.swing.JTextField();
        consultarComprador = new javax.swing.JButton();
        agregarComprador = new javax.swing.JButton();
        finalizarCompra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        productos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productosItemStateChanged(evt);
            }
        });

        agregarProducto.setText("+");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });

        eliminarProducto.setText("-");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        cantidad.setText("0");
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        precioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioProductoActionPerformed(evt);
            }
        });

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCompra);

        jLabel1.setText("Cantidad");

        caracteristicas.setColumns(20);
        caracteristicas.setRows(5);
        jScrollPane2.setViewportView(caracteristicas);

        jLabel2.setText("Caracteristicas del producto:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Telefono:");

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio Total:");

        consultarComprador.setText("Consultar");
        consultarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCompradorActionPerformed(evt);
            }
        });

        agregarComprador.setText("Agregar");
        agregarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCompradorActionPerformed(evt);
            }
        });

        finalizarCompra.setText("Comprar");

        jLabel7.setText("Precio:");

        jLabel8.setText("Cantidad disponible:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(productos, javax.swing.GroupLayout.Alignment.LEADING, 0, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidad)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadAlmacen))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(cedula)
                            .addComponent(nombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(consultarComprador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(agregarComprador)
                                    .addGap(80, 80, 80))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(precioTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(finalizarCompra)
                                .addGap(116, 116, 116))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarProducto)
                            .addComponent(eliminarProducto)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(precioTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarComprador)
                    .addComponent(agregarComprador))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizarCompra))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void precioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioProductoActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed
    
    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        Object[] provisional = new Object[4];
        try{
            if ((Integer.parseInt(cantidad.getText()) <= Integer.parseInt(cantidadAlmacen.getText())) && (Integer.parseInt(cantidad.getText()) > 0)){
                provisional[0] = productos.getSelectedItem();
                provisional[1] = Double.parseDouble(precioProducto.getText());
                provisional[2] = Integer.parseInt(cantidad.getText());
                provisional[3] = (Double)provisional[1] * (Integer)provisional[2];

                tablaModelo.addRow(provisional);
                totalCompra += (Double)provisional[3];
                precioTotalCompra.setText("" + totalCompra);
                
            }if (Integer.parseInt(cantidad.getText()) == 0){   
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad de productos dentro del rango disponible");
            
            }if (Integer.parseInt(cantidad.getText()) > Integer.parseInt(cantidadAlmacen.getText())) {
                JOptionPane.showMessageDialog(null, "Cantidad solicitada excede cantidad de productos disponibles");
            }
            
            cantidad.setText("" + 0);
            
        } catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Valor ingresado no permitido");
        }
    }//GEN-LAST:event_agregarProductoActionPerformed

    private void productosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productosItemStateChanged
        cantidad.setText("" + 0);
        int productoSeleccionado;
        if (evt.getStateChange() == ItemEvent.SELECTED){
            productoSeleccionado = productos.getSelectedIndex();
            precioProducto.setText("" + prod.get(productoSeleccionado).getPrecio());
            cantidadAlmacen.setText("" + prod.get(productoSeleccionado).getCantidad());
        }
    }//GEN-LAST:event_productosItemStateChanged

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        int fila = tablaCompra.getSelectedRow();
        if (fila >= 0){
            int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar el producto " + tablaCompra.getValueAt(fila, 0) + "?");
            if (confirmar == JOptionPane.YES_OPTION){
                double provisional = (double)tablaModelo.getValueAt(fila, 3);
                tablaModelo.removeRow(fila);
                totalCompra -= provisional;
                precioTotalCompra.setText("" + totalCompra);
            }
        }
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void agregarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCompradorActionPerformed
        persona = new Persona();
        try{
            if ((cedula != null) && (nombre != null) && (telefono != null)){
                if (cliente.get(Integer.parseInt(cedula.getText())) == null){
                    persona.setCedula(Integer.parseInt(cedula.getText()));
                    persona.setNombre(nombre.getText());
                    persona.setNumero(Integer.parseInt(telefono.getText()));

                    cliente.put(persona.getCedula(), persona);

                    cedula.setText("");
                    nombre.setText("");
                    telefono.setText("");
                } else {
                    int ver = Integer.parseInt(cedula.getText());
                    JOptionPane.showMessageDialog(null, "El cliente ya esta registrado en el sistema bajo el nombre de: " + cliente.get(ver).getNombre()
                                                        + ". Su numero de telefono es: " + cliente.get(ver).getNumero());
                }
            }
        } catch (NumberFormatException error){
            
        }
    }//GEN-LAST:event_agregarCompradorActionPerformed

    private void consultarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCompradorActionPerformed
        try{
            if(cliente.get(Integer.parseInt(cedula.getText())) != null){
                int ver = Integer.parseInt(cedula.getText());
                nombre.setText("" + cliente.get(ver).getNombre());
                telefono.setText("" + cliente.get(ver).getNumero());
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado, agreguelo a la base de datos");
            }
        } catch (NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese los numeros de la cedula, no se aceptan caracteres especiales");
        }
    }//GEN-LAST:event_consultarCompradorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIExprendedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarComprador;
    private javax.swing.JButton agregarProducto;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidadAlmacen;
    private javax.swing.JTextArea caracteristicas;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton consultarComprador;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JButton finalizarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField precioTotalCompra;
    private javax.swing.JComboBox<String> productos;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
