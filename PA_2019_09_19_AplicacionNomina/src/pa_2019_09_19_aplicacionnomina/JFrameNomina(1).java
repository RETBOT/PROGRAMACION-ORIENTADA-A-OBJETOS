/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_09_19_aplicacionnomina;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class JFrameNomina extends javax.swing.JFrame {

    /**
     * Creates new form JFrameNomina
     */
    Empleado [] nomina = new Empleado[10];
    
    public JFrameNomina() {
        initComponents();
        
        
        DefaultTableModel modelo = (DefaultTableModel)jTableEmpleados.getModel();
        modelo.setRowCount(nomina.length);
        
        jTableEmpleados.setShowGrid(true);
        
        for(int i=0;i<nomina.length;i++)
            nomina[i] = new Empleado();
        
        jSpinPosicion.setValue(1);
        
        mostrar();
    }

    public void mostrar(){
        
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        double sueldoTotal=0;
        for(int r=0; r<nomina.length;r++){
        jTableEmpleados.setValueAt(nomina[r].getNombre(), r, 0);
        jTableEmpleados.setValueAt(nomina[r].getDiasTrabajados(), r, 1);
        jTableEmpleados.setValueAt(nomina[r].getSueldoDiario(), r, 2);
        jTableEmpleados.setValueAt(nomina[r].getHorasExtras(), r, 3);
        jTableEmpleados.setValueAt(nomina[r].getPorcentajeImpuesto(), r, 4);
        
        jTableEmpleados.setValueAt(df.format(nomina[r].sueldoBruto()), r, 5);
        jTableEmpleados.setValueAt(df.format(nomina[r].importeHorasExtras()), r, 6);
        jTableEmpleados.setValueAt(df.format(nomina[r].ImporteImpuesto()), r, 7);
        jTableEmpleados.setValueAt(df.format(nomina[r].sueldo()), r, 8);
        
        sueldoTotal += nomina[r].sueldo();
        }
        jLabTotal.setText(df.format(sueldoTotal));
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextDias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextSueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextHoras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextImpuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButGrabar = new javax.swing.JButton();
        jButAleatorios = new javax.swing.JButton();
        jSpinPosicion = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jCheckIncremento = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabMayor = new javax.swing.JLabel();
        jLabMenor = new javax.swing.JLabel();
        jButMayor = new javax.swing.JButton();
        jButSueldo = new javax.swing.JButton();
        jButAAlfabetico = new javax.swing.JButton();
        jButEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dias Trab", "Sueldo Diario", "Horas Ext", "%Impuesto", "Sueldo Bruto", "$Hor Ext", "$Impuesto", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableEmpleados.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableEmpleados.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableEmpleados.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel1.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiasActionPerformed(evt);
            }
        });

        jLabel2.setText("Dias Trab");

        jTextSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSueldoActionPerformed(evt);
            }
        });

        jLabel3.setText("Sueldo diario");

        jTextHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHorasActionPerformed(evt);
            }
        });

        jLabel4.setText("Horas Ext");

        jTextImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextImpuestoActionPerformed(evt);
            }
        });

        jLabel5.setText("%Imp");

        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jLabel6.setText("Posición");

        jCheckIncremento.setText("Incrementar");
        jCheckIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckIncrementoActionPerformed(evt);
            }
        });

        jLabel7.setText("Total");

        jLabTotal.setBackground(new java.awt.Color(204, 255, 102));
        jLabTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabTotal.setOpaque(true);

        jLabel8.setText("Empleado con mayor sueldo ");

        jLabel9.setText("Empleado con menor sueldo ");

        jLabMayor.setBackground(new java.awt.Color(0, 255, 0));
        jLabMayor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabMayor.setOpaque(true);

        jLabMenor.setBackground(new java.awt.Color(255, 0, 0));
        jLabMenor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabMenor.setOpaque(true);

        jButMayor.setText("Meyor y menor");
        jButMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMayorActionPerformed(evt);
            }
        });

        jButSueldo.setText("Por Sueldo");
        jButSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSueldoActionPerformed(evt);
            }
        });

        jButAAlfabetico.setText("Por Nombre");
        jButAAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAAlfabeticoActionPerformed(evt);
            }
        });

        jButEditar.setText("Editar");
        jButEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEditarActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButGrabar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButAleatorios))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckIncremento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButMayor)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButSueldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButAAlfabetico)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckIncremento)
                                    .addComponent(jButEditar))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButGrabar)
                                .addComponent(jButAleatorios)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButSueldo)
                                    .addComponent(jButAAlfabetico))
                                .addContainerGap(34, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButMayor)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiasActionPerformed

    private void jTextSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSueldoActionPerformed

    private void jTextHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHorasActionPerformed

    private void jTextImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextImpuestoActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        // TODO add your handling code here:
        Empleado emp = new Empleado();
        
        emp.setNombre(jTextNombre.getText());
        emp.setDiasTrabajados(Integer.parseInt(jTextDias.getText()));
        emp.setSueldoDiario(Double.parseDouble(jTextSueldo.getText()));
        emp.setHorasExtrass(Integer.parseInt(jTextHoras.getText()));
        emp.setPorcentajeImpuesto(Double.parseDouble(jTextImpuesto.getText()));
        
        int posicion = (int) jSpinPosicion.getValue()-1;
        nomina[posicion] = emp;
        
        mostrar(); 
        
        if(jCheckIncremento.isSelected())
            
        if(posicion==nomina.length-1)
           jSpinPosicion.setValue(1);
        else  
           jSpinPosicion.setValue(posicion+2);
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        jTextNombre.setText(Nombres.nextNombreCompleto());
        jTextDias.setText(5+azar.nextInt(26)+"");
        jTextSueldo.setText(102+azar.nextInt(500)+"");
        jTextHoras.setText(azar.nextInt(10)+"");
        jTextImpuesto.setText(4+azar.nextInt(17)+"");
        
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jCheckIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckIncrementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckIncrementoActionPerformed

    private void jButMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMayorActionPerformed
        // TODO add your handling code here:
        
        Empleado mayor = nomina[0];
        Empleado menor = nomina[0]; 
        
        for(int i=1; i<nomina.length;i++)
        {
        if (nomina[i].sueldo()> mayor.sueldo())
       mayor = nomina[i];
        
        if(nomina[i].sueldo()<menor.sueldo())
           menor = nomina[i];
            
        }
       jLabMayor.setText(mayor.getNombre());
       jLabMenor.setText(menor.getNombre());
    }//GEN-LAST:event_jButMayorActionPerformed

    private void jButSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSueldoActionPerformed
        // TODO add your handling code here:
                       for(int i=0; i<nomina.length-1;i++)
                    for(int j = i+1;j<nomina.length;j++)
                   if(nomina[i].sueldo() > nomina[j].sueldo())
                   {
                          Empleado aux = nomina[i];
                           nomina[i]= nomina[j];
                           nomina[j] = aux;
                   }
                    mostrar();
 
    }//GEN-LAST:event_jButSueldoActionPerformed

    private void jButAAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAAlfabeticoActionPerformed
        // TODO add your handling code here:
               for(int i=0; i<nomina.length-1;i++)
               for(int j = i+1;j<nomina.length;j++)
                   if(nomina[i].getNombre().compareTo(nomina[j].getNombre())>0)
                   {
                          Empleado aux = nomina[i];
                           nomina[i]= nomina[j];
                           nomina[j] = aux;
                   }
               mostrar(); 
    }//GEN-LAST:event_jButAAlfabeticoActionPerformed

    private void jButEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEditarActionPerformed
        // TODO add your handling code here:
        int posicion = (int)jSpinPosicion.getValue();
        
        Empleado emp = nomina[posicion];
        
        jTextNombre.setText(emp.getNombre());
        jTextDias.setText(emp.getDiasTrabajados()+"");
        jTextSueldo.setText(emp.getSueldoDiario()+""); 
        jTextHoras.setText(emp.getHorasExtras()+"");
        jTextImpuesto.setText(emp.getPorcentajeImpuesto()+"");
        
               
    }//GEN-LAST:event_jButEditarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameNomina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAAlfabetico;
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButEditar;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButMayor;
    private javax.swing.JButton jButSueldo;
    private javax.swing.JCheckBox jCheckIncremento;
    private javax.swing.JLabel jLabMayor;
    private javax.swing.JLabel jLabMenor;
    private javax.swing.JLabel jLabTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinPosicion;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextDias;
    private javax.swing.JTextField jTextHoras;
    private javax.swing.JTextField jTextImpuesto;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextSueldo;
    // End of variables declaration//GEN-END:variables
}
