/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_12_05_archivobinario;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    DefaultTableModel modelo;
    MiRandom azar = new MiRandom();
    JFileChooser jfch = new JFileChooser();
    public JFrameMenu() {
        initComponents();
        
        modelo = (DefaultTableModel)jTableAlumnos.getModel();
        
        jTableAlumnos.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jSpinAlumnos = new javax.swing.JSpinner();
        jButAleatorios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuNuevo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenuOrdenar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de alumnos");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Grupo", "Edad", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);
        if (jTableAlumnos.getColumnModel().getColumnCount() > 0) {
            jTableAlumnos.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        jSpinAlumnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinAlumnosStateChanged(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Archivo Binario ");
        jLabel2.setOpaque(true);

        jMenu2.setText("Archivo");

        jMenuNuevo.setText("Nuevo");
        jMenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNuevo);

        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAbrir);

        jMenuGuardar.setText("Guardar");
        jMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuGuardar);

        jMenuOrdenar.setText("Guardar Ordenado");
        jMenuOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOrdenarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuOrdenar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuSalir);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Acerca de..");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButAleatorios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButAleatorios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinAlumnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinAlumnosStateChanged
        // TODO add your handling code here:
        modelo.setRowCount((int)jSpinAlumnos.getValue());
    }//GEN-LAST:event_jSpinAlumnosStateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        char [] grupo = {'A','B','C','D','E','F','G'};
        
        for(int r=0; r<modelo.getRowCount();r++){
        modelo.setValueAt(azar.nextNombreCompleto(), r, 0);
        
        modelo.setValueAt(grupo[azar.nextInt(grupo.length)], r, 1);
        
        modelo.setValueAt(azar.nextInt(17, 30), r, 2);
        
        modelo.setValueAt(azar.nextInt(40, 100), r, 3);
        
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoActionPerformed
        // TODO add your handling code here:
        jSpinAlumnos.setValue(0);
    }//GEN-LAST:event_jMenuNuevoActionPerformed

    private void jMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarActionPerformed
        // TODO add your handling code here:
        
        if(jfch.showSaveDialog(jMenu1)!=0)
           return;
        
        FileOutputStream fos=null;
        DataOutputStream dos=null;
         
        try {
             //lo que se grabe va a hacer una cadena 
             //clase Escritura
             fos = new FileOutputStream(jfch.getSelectedFile());
             dos = new DataOutputStream(fos);
            //grabar
            dos.writeInt(modelo.getRowCount());
            
            //recorrer el jTable 
            for(int r = 0; r<modelo.getRowCount();r++){
            dos.writeUTF(modelo.getValueAt(r, 0)+""); // nombre
            dos.writeChar((modelo.getValueAt(r, 1)+"").charAt(0));   // grupo 
            dos.writeInt(Integer.parseInt(modelo.getValueAt(r, 2)+"")); //edad
            dos.writeDouble(Double.parseDouble(modelo.getValueAt(r, 3)+"")); //promedio 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            
            //cerrar los archivos, se pueden dañar y no se graben
            try {
            if(dos!=null)
            dos.close();
                if(fos!=null)
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jMenuGuardarActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        // TODO add your handling code here:
        if(jfch.showOpenDialog(jMenu1)!=0)
           return;
        
        FileInputStream fis = null;
        DataInputStream dis = null;   
        try {
            // TODO add your handling code here:
            fis = new FileInputStream(jfch.getSelectedFile());
            dis = new DataInputStream(fis);
            
            int n = dis.readInt();
            
            jSpinAlumnos.setValue(n);           
            
            for(int r=0;r<n;r++){
               jTableAlumnos.setValueAt(dis.readUTF(),r,0);
               jTableAlumnos.setValueAt(dis.readChar(),r,1);
               jTableAlumnos.setValueAt(dis.readInt(),r,2);
               jTableAlumnos.setValueAt(dis.readDouble(),r,3);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(dis!=null)
                    dis.close();
                if(fis!=null)
                    fis.close();
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOrdenarActionPerformed
        // TODO add your handling code here:
        if(jfch.showSaveDialog(jMenu1)!=0)
           return;
        
        Alumno [] grupo = new Alumno[modelo.getRowCount()];
        
        for(int r =0;r<grupo.length; r++){
        grupo[r] = new Alumno(modelo.getValueAt(r, 0)+"",
                             (modelo.getValueAt(r, 1)+"").charAt(0),
             Integer.parseInt(modelo.getValueAt(r, 2)+""),
           Double.parseDouble(modelo.getValueAt(r, 3)+""));
           
        }
        Arrays.sort(grupo);
        FileOutputStream fos=null;
        DataOutputStream dos=null;
         
        try {
             //lo que se grabe va a hacer una cadena 
             //clase Escritura
             fos = new FileOutputStream(jfch.getSelectedFile());
             dos = new DataOutputStream(fos);
            //grabar
            dos.writeInt(grupo.length);
            
            //recorrer el jTable 
            for(int r = 0; r<grupo.length;r++){
            dos.writeUTF(grupo[r].getNombre()); // nombre
            dos.writeChar(grupo[r].getGrupo());   // grupo 
            dos.writeInt(grupo[r].getEdad()); //edad
            dos.writeDouble(grupo[r].getCalificacion()); //promedio 
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
            
            //cerrar los archivos, se pueden dañar y no se graben
            try {
            if(dos!=null)
            dos.close();
                if(fos!=null)
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jMenuOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JMenuItem jMenuOrdenar;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinAlumnos;
    private javax.swing.JTable jTableAlumnos;
    // End of variables declaration//GEN-END:variables
}
