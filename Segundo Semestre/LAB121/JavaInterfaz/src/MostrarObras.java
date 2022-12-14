
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class MostrarObras extends javax.swing.JFrame {

    /**
     * Creates new form MostrarObras
     */
    private MenuObras meno;
    private EspacioMunicipalCultural e1;
    private EspacioMunicipalCultural e2;
    private DefaultTableModel tabla;
    public MostrarObras() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public MostrarObras(EspacioMunicipalCultural e1, EspacioMunicipalCultural e2, int n) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.e1 = e1;
        this.e2 = e2;
        tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Año Publicacion");
        tabla.addColumn("Popularidad");
        tabla.addColumn("Aceptacion");
        if (n == 1) {
            String V[] = new String[4];
            V[0] = e1.getEvento0().getObras0().getNombredelaObra();
            V[1] = e1.getEvento0().getObras0().getAñodePublicacion() + "";
            V[2] = e1.getEvento0().getObras0().getPopularidad();
            V[3] = e1.getEvento0().getObras0().getAceptacion();
            tabla.addRow(V);
            V[0] = e1.getEvento0().getObras1().getNombredelaObra();
            V[1] = e1.getEvento0().getObras1().getAñodePublicacion() + "";
            V[2] = e1.getEvento0().getObras1().getPopularidad();
            V[3] = e1.getEvento0().getObras1().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
        if (n == 2) {
            String V[] = new String[4];
            V[0] = e1.getEvento0().getObras2().getNombredelaObra();
            V[1] = e1.getEvento0().getObras2().getAñodePublicacion() + "";
            V[2] = e1.getEvento0().getObras2().getPopularidad();
            V[3] = e1.getEvento0().getObras2().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
        if (n == 3) {
            String V[] = new String[4];
            V[0] = e1.getEvento1().getObras0().getNombredelaObra();
            V[1] = e1.getEvento1().getObras0().getAñodePublicacion() + "";
            V[2] = e1.getEvento1().getObras0().getPopularidad();
            V[3] = e1.getEvento1().getObras0().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
        if (n == 4) {
            String V[] = new String[4];
            V[0] = e1.getEvento1().getObras1().getNombredelaObra();
            V[1] = e1.getEvento1().getObras1().getAñodePublicacion() + "";
            V[2] = e1.getEvento1().getObras1().getPopularidad();
            V[3] = e1.getEvento1().getObras1().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
        if (n == 5) {
            String V[] = new String[4];
            V[0] = e2.getEvento0().getObras0().getNombredelaObra();
            V[1] = e2.getEvento0().getObras0().getAñodePublicacion() + "";
            V[2] = e2.getEvento0().getObras0().getPopularidad();
            V[3] = e2.getEvento0().getObras0().getAceptacion();
            tabla.addRow(V);
            V[0] = e2.getEvento0().getObras1().getNombredelaObra();
            V[1] = e2.getEvento0().getObras1().getAñodePublicacion() + "";
            V[2] = e2.getEvento0().getObras1().getPopularidad();
            V[3] = e2.getEvento0().getObras1().getAceptacion();
            tabla.addRow(V);
            V[0] = e2.getEvento0().getObras2().getNombredelaObra();
            V[1] = e2.getEvento0().getObras2().getAñodePublicacion() + "";
            V[2] = e2.getEvento0().getObras2().getPopularidad();
            V[3] = e2.getEvento0().getObras2().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
        if (n == 6) {
            String V[] = new String[4];
            V[0] = e2.getEvento1().getObras0().getNombredelaObra();
            V[1] = e2.getEvento1().getObras0().getAñodePublicacion() + "";
            V[2] = e2.getEvento1().getObras0().getPopularidad();
            V[3] = e2.getEvento1().getObras0().getAceptacion();
            tabla.addRow(V);
            jTable1.setModel(tabla);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setText("Obras:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        meno = new MenuObras(e1, e2);
        meno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarObras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarObras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
