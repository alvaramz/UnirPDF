package com.alvaramz.unirpdf;

import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ing. Adrián Alvarado Ramírez.
 */
public class UnirPDFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form UnirPDFPrincipal
     */
    public UnirPDFPrincipal() {
        initComponents();
        txtRutaOrigen.requestFocus();
        agregarIcono();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoDirectorio = new javax.swing.JFileChooser();
        btnUnirArchivos = new javax.swing.JButton();
        lblRutaOrigen = new javax.swing.JLabel();
        txtRutaOrigen = new javax.swing.JTextField();
        lblRutaDestino = new javax.swing.JLabel();
        txtRutaDestino = new javax.swing.JTextField();
        lblNombreArchivoDestino = new javax.swing.JLabel();
        txtNombreArchivo = new javax.swing.JTextField();
        btnEscogerRutaOrigen = new javax.swing.JButton();
        btnEscogerRutaDestino = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        dialogoDirectorio.setCurrentDirectory(new java.io.File("/home/alvaradora/System.getProperty(\"user.home\")"));
        dialogoDirectorio.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unir PDF");

        btnUnirArchivos.setMnemonic('U');
        btnUnirArchivos.setText("Unir archivos");
        btnUnirArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirArchivosActionPerformed(evt);
            }
        });

        lblRutaOrigen.setText("Ruta Origen:");
        lblRutaOrigen.setName("lblRutaOrigen"); // NOI18N

        lblRutaDestino.setText("Ruta Destino:");
        lblRutaDestino.setName(""); // NOI18N

        lblNombreArchivoDestino.setText("Nombre archivo destino:");

        btnEscogerRutaOrigen.setText("...");
        btnEscogerRutaOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerRutaOrigenActionPerformed(evt);
            }
        });

        btnEscogerRutaDestino.setText("...");
        btnEscogerRutaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerRutaDestinoActionPerformed(evt);
            }
        });

        menuPrincipal.setText("Programa");

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuPrincipal.add(menuItemSalir);

        jMenuBar1.add(menuPrincipal);

        menuAyuda.setText("Ayuda");

        menuItemAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAcercaDe.setText("Acerca de");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreArchivoDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArchivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRutaOrigen)
                            .addComponent(lblRutaDestino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRutaOrigen)
                            .addComponent(txtRutaDestino))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEscogerRutaOrigen)
                    .addComponent(btnEscogerRutaDestino, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(btnUnirArchivos)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutaOrigen)
                    .addComponent(txtRutaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscogerRutaOrigen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutaDestino)
                    .addComponent(txtRutaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscogerRutaDestino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreArchivoDestino)
                    .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnUnirArchivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarIcono() {
        URL iconURL = getClass().getClassLoader().getResource("logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
    }

    private void btnUnirArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirArchivosActionPerformed
        btnUnirArchivos.setEnabled(false);
        unirArchivo();
        btnUnirArchivos.setEnabled(true);
    }//GEN-LAST:event_btnUnirArchivosActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        AcercaDe acercaDe = new AcercaDe();
        acercaDe.setVisible(true);
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

    private void btnEscogerRutaOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerRutaOrigenActionPerformed
       cargarRutaOrigen();
    }//GEN-LAST:event_btnEscogerRutaOrigenActionPerformed

    private void btnEscogerRutaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerRutaDestinoActionPerformed
       cargarRutaDestino();
    }//GEN-LAST:event_btnEscogerRutaDestinoActionPerformed

    /**
     * Inicia un dialogo de JFileChooser para cargar la ruta de origen.
     */
    private void cargarRutaOrigen(){    
      int resultado = dialogoDirectorio.showOpenDialog(this);
        if(resultado == javax.swing.JFileChooser.APPROVE_OPTION){
            txtRutaOrigen.setText(dialogoDirectorio.getSelectedFile().getAbsolutePath());
        }
    }
    
    /**
     * Inicia un dialogo de JFileChooser para cargar la ruta de destino.
     */
    private void cargarRutaDestino(){    
      int resultado = dialogoDirectorio.showOpenDialog(this);
        if(resultado == javax.swing.JFileChooser.APPROVE_OPTION){
            txtRutaDestino.setText(dialogoDirectorio.getSelectedFile().getAbsolutePath());
        }
    }
    
    
    /**
     * Ejecuta la funcionalidad de unir el archivo a partir de los parámetros
     * ingresados por el usuario.
     */
    private void unirArchivo() {
        String rutaBase, rutaSalida, nombreArchivoSalida;
        PDFUtil pdfUtil;
        DirectorioUtil dirUtil;
   
        rutaBase = txtRutaOrigen.getText();
        rutaSalida = txtRutaDestino.getText();
        nombreArchivoSalida = txtNombreArchivo.getText();

        if(!rutaBase.trim().equals("") && !rutaSalida.trim().equals("") && !nombreArchivoSalida.trim().equals("")){
        
        dirUtil = new DirectorioUtil();
        pdfUtil = new PDFUtil();

        List<String> listaArchivos = dirUtil.obtenerListaArchivos(rutaBase);

        if (listaArchivos != null) {
           Respuesta res = pdfUtil.unirArchivos(rutaBase, listaArchivos, rutaSalida, nombreArchivoSalida);
           if(res.isResultado()){
               JOptionPane.showMessageDialog(this, "Archivo unido con éxito", "¡Éxito al unir los archivos!", JOptionPane.INFORMATION_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(this, String.format("<html><h1>Error al crear el archivo</h1><h2>Detalle del error:</h2><p>%s</p></html>", res.getMensaje()), "¡Error!",JOptionPane.ERROR_MESSAGE);
           }
        }
        }else{
            JOptionPane.showMessageDialog(this, "<html><h1>Debe ingresar todos los datos</h1><p>Puede utilizar los botones <strong>\"...\"</strong> de la derecha de cada campo para<br> ingresar la ruta de las carpetas origen y destino.</p></html>", "¡Error!",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(UnirPDFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnirPDFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnirPDFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnirPDFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnirPDFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscogerRutaDestino;
    private javax.swing.JButton btnEscogerRutaOrigen;
    private javax.swing.JButton btnUnirArchivos;
    private javax.swing.JFileChooser dialogoDirectorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblNombreArchivoDestino;
    private javax.swing.JLabel lblRutaDestino;
    private javax.swing.JLabel lblRutaOrigen;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JTextField txtNombreArchivo;
    private javax.swing.JTextField txtRutaDestino;
    private javax.swing.JTextField txtRutaOrigen;
    // End of variables declaration//GEN-END:variables
}
