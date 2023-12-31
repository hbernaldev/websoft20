/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.DepartamentosService;
/**
 *
 * @author hectoralexisbernalsuarez
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemDepartamentos = new javax.swing.JMenuItem();
        jMenuItemEmpresa = new javax.swing.JMenuItem();
        jMenuItemRoles = new javax.swing.JMenuItem();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemProyectos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Websoft 2.0");
        setPreferredSize(null);
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Images/background_project.png"))); // NOI18N

        jMenu1.setText("GestionEmpresa");

        jMenuItemDepartamentos.setText("Departamentos");
        jMenuItemDepartamentos.setName("JMenuItemDepartamentos"); // NOI18N
        jMenuItemDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDepartamentosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDepartamentos);

        jMenuItemEmpresa.setText("Empresa");
        jMenuItemEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEmpresa);

        jMenuItemRoles.setText("Roles");
        jMenuItemRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRolesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRoles);

        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEmpleados);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("GestionProyectos");

        jMenuItemProyectos.setText("Proyectos");
        jMenuItemProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProyectosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemProyectos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpresaActionPerformed
        // TODO add your handling code here:
        JDialogEmpresa dialog = new JDialogEmpresa(this,false);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemEmpresaActionPerformed

    private void jMenuItemRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRolesActionPerformed
        // TODO add your handling code here:
        JDialogRoles dialog = new JDialogRoles(this,false);
        dialog.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItemRolesActionPerformed

    private void jMenuItemDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDepartamentosActionPerformed
        // TODO add your handling code here:
        DepartamentosService service = new DepartamentosService();
        JDialogDepartamento dialog = new JDialogDepartamento(this,false, service);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemDepartamentosActionPerformed

    private void jMenuItemProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProyectosActionPerformed
        // TODO add your handling code here:
        JDialogProyecto dialog = new JDialogProyecto(this,false);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemProyectosActionPerformed

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        // TODO add your handling code here:
        JDialogTrabajador dialog = new JDialogTrabajador(this,false);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDepartamentos;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemEmpresa;
    private javax.swing.JMenuItem jMenuItemProyectos;
    private javax.swing.JMenuItem jMenuItemRoles;
    // End of variables declaration//GEN-END:variables
}
