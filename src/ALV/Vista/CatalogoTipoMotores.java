/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALV.Vista;

import conn.ConectionDB;
import control.ControlCatalogoTipoMotor;
import control.TipoMotor;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SergioCardoza
 */
public class CatalogoTipoMotores extends javax.swing.JFrame {

    /**
     * Creacion del Formulario CatalogoTipoMotores
     */
    public CatalogoTipoMotores() {
        initComponents();
    }
    
    public void llenarDatos(){
        String consulta="select * from cat_motor";
        try {
            Statement sentencia=ConectionDB.getConn().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("tipo_motor") );
                jComboBox1.addItem(resultado.getString("tipo_motor"));
            }
        } catch (Exception e) {
        }
    }
    
    public void llenarActu(){
        String var = jComboBox1.getSelectedItem().toString();
        jTextLLe.setText(var);
        /*String consulta="select * from cat_motor where tipo_motor";
        try {
            Statement sentencia=ConexionBase.obtener().createStatement();
            ResultSet resultado=sentencia.executeQuery(consulta);
            while (resultado.next())
            {
                System.out.println (resultado.getObject("tipo_motor") );
                jComboBox1.addItem(resultado.getString("tipo_motor"));
            }
        } catch (Exception e) {
        }*/
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
        jLabel2 = new javax.swing.JLabel();
        jTextLLe = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tipo motor de vehiculo:");

        jTextLLe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextLLeFocusGained(evt);
            }
        });
        jTextLLe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextLLeMouseEntered(evt);
            }
        });
        jTextLLe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLLeActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ALV/Vista/Captura-removebg-preview.png"))); // NOI18N
        jLabel3.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextLLe)
                                    .addComponent(jComboBox1, 0, 187, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextLLe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButton1)
                    .addComponent(jButtonAgregar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLLeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLLeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLLeActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        ControlCatalogoTipoMotor ctm = new ControlCatalogoTipoMotor();
        try {
            if (ctm.process(jTextLLe.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Agregado con exito");
                String consulta = "select * from cat_motor";
                Statement sentencia =ConectionDB.getConn().createStatement();
                ResultSet resultado = sentencia.executeQuery(consulta);
                while (resultado.next()) {
                    System.out.println(resultado.getObject("tipo_motor"));
                    jComboBox1.addItem(resultado.getString("tipo_motor"));
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se puse ingresar dato");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTextLLeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextLLeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLLeFocusGained

    private void jTextLLeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextLLeMouseEntered
       String var = jComboBox1.getSelectedItem().toString();
       jTextLLe.setText(var);
    }//GEN-LAST:event_jTextLLeMouseEntered

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
       TipoMotor motorID = new TipoMotor();
        ControlCatalogoTipoMotor dat = new ControlCatalogoTipoMotor();
        try {
            if(dat.delete(jTextLLe.getText())){
           JOptionPane.showMessageDialog(null, "Eliminado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No se actualizoo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas con el sistema");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Buscar b = new Buscar();
            b.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextLLe;
    // End of variables declaration//GEN-END:variables
}
