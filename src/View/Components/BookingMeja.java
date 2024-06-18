/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Components;

import Controller.DaftarMejaController;
import Controller.HistoryBookingController;
import Model.DriverBookingMeja;
import Model.SesiLogin;


public class BookingMeja extends javax.swing.JFrame {

    /**
     * Creates new form BookingMeja
     */
    private String namaResto, status;
    private int JKursi, idResto, idMeja;
    private HistoryBookingController HbookCNTRL;
    private DaftarMejaController dafMejaCNTRL;
    private DriverBookingMeja driver;
    
    public BookingMeja() {
        HbookCNTRL = new HistoryBookingController();
        dafMejaCNTRL = new DaftarMejaController();
        driver = new DriverBookingMeja(this);
        
        initComponents();
    }

    public void BookingMeja(String namaResto, String status, int JKursi, int idMeja, int idResto) {
        this.namaResto = namaResto;
        this.status = status;
        this.JKursi = JKursi;
        this.idResto = idResto;
        this.idMeja = idMeja;
        
        namaRestoDisplay.setText(namaResto);
        jumlahKusriDisplay.setText(String.valueOf(JKursi));
        statusDisplay.setText(status);
        NamaPemesanDisplay.setText(SesiLogin.getNama());
        noTelpDisplay.setText(SesiLogin.getNoTelpon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kembaliBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namaRestoDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jumlahKusriDisplay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statusDisplay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        waktuDatangInput = new javax.swing.JTextField();
        BookNowBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NamaPemesanDisplay = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        noTelpDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kembaliBTN.setText("kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Restoran");

        namaRestoDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaRestoDisplay.setText("jLabel2");

        jLabel2.setText("Jumlah Kursi");

        jumlahKusriDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jumlahKusriDisplay.setText("jLabel2");

        jLabel3.setText("Status");

        statusDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        statusDisplay.setText("jLabel2");

        jLabel4.setText("Masukan Waktu Kedatangan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel5.setText("*12-02-2024");

        BookNowBTN.setText("Booking Sekarang");
        BookNowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNowBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATA RESTORAN");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("DATA PEMESAN");

        jLabel8.setText("Nama Pemesan");

        NamaPemesanDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NamaPemesanDisplay.setText("Nama Pemesan");

        jLabel9.setText("Nomor telpon");

        noTelpDisplay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        noTelpDisplay.setText("Nama Pemesan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kembaliBTN)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaRestoDisplay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlahKusriDisplay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusDisplay))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(waktuDatangInput, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamaPemesanDisplay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noTelpDisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(BookNowBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(namaRestoDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jumlahKusriDisplay)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(NamaPemesanDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(noTelpDisplay))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(statusDisplay))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktuDatangInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addComponent(BookNowBTN)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    private void BookNowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNowBTNActionPerformed
        String waktudatang = waktuDatangInput.getText();
        String status = "Booked";
        
        boolean STATUS = HbookCNTRL.tambahHistory(SesiLogin.getId(), idMeja, idResto, namaResto, status, waktudatang);
        driver.tambahHistory(STATUS);
    }//GEN-LAST:event_BookNowBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BookingMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingMeja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookNowBTN;
    private javax.swing.JLabel NamaPemesanDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jumlahKusriDisplay;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JLabel namaRestoDisplay;
    private javax.swing.JLabel noTelpDisplay;
    private javax.swing.JLabel statusDisplay;
    private javax.swing.JTextField waktuDatangInput;
    // End of variables declaration//GEN-END:variables
}
