
package pemrograman_berbasis_desktop.view;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pemrograman_berbasis_desktop.DBConnection;
import pemrograman_berbasis_desktop.entity.Barang;
import pemrograman_berbasis_desktop.model.BarangModel;

public class BarangForm extends javax.swing.JDialog {

    /**
     * Creates new form BarangForm
     */
    
    private Connection connection;
    private Barang barang;
    private BarangModel barangModel;
    //Deklarasi untuk menghubungkan pada barangData
    private BarangData barangData;
    
    public BarangForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        connection = DBConnection.newInstant();
        barang = new Barang();
        barangModel = new BarangModel (connection);
        
        barangData = new BarangData(parent, true);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textSatuan = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textKode = new javax.swing.JTextField();
        textHargaSatuan = new javax.swing.JFormattedTextField();
        buttonBaru = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORMULIR BARANG");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Kode");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Satuan");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Harga_Satuan");

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });

        textKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKodeActionPerformed(evt);
            }
        });

        textHargaSatuan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        textHargaSatuan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textHargaSatuan.setValue(0);
        textHargaSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaSatuanActionPerformed(evt);
            }
        });

        buttonBaru.setText("BARU");
        buttonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaruActionPerformed(evt);
            }
        });

        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("UBAH");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonData.setText("DATA");
        buttonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textKode)
                            .addComponent(textNama)
                            .addComponent(textSatuan)
                            .addComponent(textHargaSatuan, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(buttonBaru)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUbah)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(buttonData)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(textKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBaru)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus))
                .addGap(18, 18, 18)
                .addComponent(buttonData)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaActionPerformed

    private void textHargaSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHargaSatuanActionPerformed

    private void buttonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaruActionPerformed
        textKode.setText(null);
        textNama.setText(null);
        textSatuan.setText(null);
        textHargaSatuan.setValue(0);
        textKode.requestFocus();
    }//GEN-LAST:event_buttonBaruActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        barang.setKode(textKode.getText());
        barang.setNama(textNama.getText());
        barang.setSatuan(textSatuan.getText());
        
        barang.setHarga_satuan(Integer.valueOf(String.valueOf(textHargaSatuan.getValue())));
        
        try
        {
            connection.setAutoCommit(false);
            barangModel.insert(barang);
            connection.commit();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambah", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Data gagal ditambah", "KESALAHAN", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
    barang.setKode(textKode.getText());
    barang.setNama(textNama.getText());
    barang.setSatuan(textSatuan.getText());
    barang.setHarga_satuan(Integer.valueOf(String.valueOf(textHargaSatuan.getValue())));

    try 
    {
        connection.setAutoCommit(false);
        barangModel.update(barang);  // Panggil method update
        connection.commit();
        JOptionPane.showMessageDialog(this, "Data berhasil diubah", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
    } 
    catch (SQLException ex) 
    {
        try 
        {
            connection.rollback();
        } 
        catch (SQLException rollbackEx) 
        {
            rollbackEx.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Data gagal diubah", "KESALAHAN", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }

    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
    barang.setKode(textKode.getText());  // Set kode yang akan dihapus

    try 
    {
        connection.setAutoCommit(false);
        barangModel.delete(barang);  // Panggil method delete
        connection.commit();
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
    } 
    catch (SQLException ex) 
    {
        try 
        {
            connection.rollback();
        } 
        catch (SQLException rollbackEx) 
        {
            rollbackEx.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Data gagal dihapus", "KESALAHAN", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataActionPerformed
        barangData.show();
        barang = barangData.getSelectionRow();
        if (barang != null)
        {
            textKode.setText(barang.getKode());
            textNama.setText(barang.getNama());
            textSatuan.setText(barang.getSatuan());
            textHargaSatuan.setValue(barang.getHarga_satuan());
        }
    }//GEN-LAST:event_buttonDataActionPerformed

    private void textKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKodeActionPerformed

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
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BarangForm dialog = new BarangForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBaru;
    private javax.swing.JButton buttonData;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField textHargaSatuan;
    private javax.swing.JTextField textKode;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textSatuan;
    // End of variables declaration//GEN-END:variables
}
