/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DaftarMejaController;
import Controller.RestoranController;
import Model.DaftarMeja;
import Model.DriverBookingMeja;
import Model.SesiLogin;
import View.Components.SetDataResto;
import View.Components.UbahStatusMeja;
import View.Components.UbahNamaResto;
import View.Components.UbahNamaUser;
import View.Components.UbahUsername;
import View.Components.UbahPassword;
import View.Components.UbahNoTelpon;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MenuPemilikResto extends javax.swing.JFrame {

    /**
     * Creates new form MenuPemesan
     */
    
    private RestoranController restoCNTRL;
    private DefaultTableModel modelDaftarMeja;
    private DaftarMejaController DafMejaCNTRL;
    private DriverBookingMeja driver;
    
    public MenuPemilikResto() {
        DafMejaCNTRL = new DaftarMejaController();
        driver= new DriverBookingMeja(this);
        
        initComponents();
        namaPemTokoDisplay.setText(SesiLogin.getNama());
        NamaUserProfile.setText(SesiLogin.getNama());
        UsernameUserProfile.setText(SesiLogin.getUsername());
        NoTelpUserProfile.setText(SesiLogin.getNoTelpon());
        
        if (SesiLogin.getNamaResto() != null && SesiLogin.getAlamatResto() != null) {
            AlamatRestoProfile.setText(SesiLogin.getAlamatResto());
            NamaRestoProfile.setText(SesiLogin.getNamaResto());
        } else {
            AlamatRestoProfile.setText("Belum terdaftar");
            NamaRestoProfile.setText("Belum terdaftar");
        }
        
        String[] judulDaftarMeja = {"id meja", "jumlah kursi", "status"};
        modelDaftarMeja = new DefaultTableModel(judulDaftarMeja, 0);
        tableDaftarMeja.setModel(modelDaftarMeja);
        
        loadDaftarMeja();
    }
    
    public void loadDaftarMeja(){
        List<DaftarMeja> dataMeja = DafMejaCNTRL.getAllDaftarMeja(SesiLogin.getIdResto());
        
        for(DaftarMeja daftarmeja : dataMeja){
            Object[] rowDataMeja = {
                daftarmeja.getIdMeja(),
                daftarmeja.getJumlahKursi(),
                daftarmeja.getStatus(),
            };
            modelDaftarMeja.addRow(rowDataMeja);
        }
    }
    
    public void loadDaftarMejaByStatus(String status){
        List<DaftarMeja> dataMeja = DafMejaCNTRL.getDaftarMejaByStatus(SesiLogin.getIdResto(), status);
        
        for(DaftarMeja daftarmeja : dataMeja){
            Object[] rowDataMeja = {
                daftarmeja.getIdMeja(),
                daftarmeja.getJumlahKursi(),
                daftarmeja.getStatus(),
            };
            modelDaftarMeja.addRow(rowDataMeja);
        }
    }
    
    public void clearTable(){
        int rows = modelDaftarMeja.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            modelDaftarMeja.removeRow(i);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        namaPemTokoDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahDaftarMejaBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        banyakKursiInput = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDaftarMeja = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        RefreshDaftarMejaBTN = new javax.swing.JButton();
        DropDown = new javax.swing.JComboBox<>();
        Profile = new javax.swing.JPanel();
        SetAlamatResto = new javax.swing.JButton();
        UbahUsername = new javax.swing.JButton();
        UbahNoTelpon = new javax.swing.JButton();
        UbahPassword = new javax.swing.JButton();
        LogoutBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NamaRestoProfile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UbahNamaResto = new javax.swing.JButton();
        UsernameUserProfile = new javax.swing.JLabel();
        SetNamaResto = new javax.swing.JButton();
        NamaUserProfile = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AlamatRestoProfile = new javax.swing.JLabel();
        NoTelpUserProfile = new javax.swing.JLabel();
        UbahAlamatResto = new javax.swing.JButton();
        UbahNama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namaPemTokoDisplay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namaPemTokoDisplay.setText("nama pemilik resto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Selamat Datang");

        jLabel5.setText("Refresh Daftar Meja");

        tambahDaftarMejaBTN.setText("Tambah meja");
        tambahDaftarMejaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahDaftarMejaBTNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Tambah Daftar Meja");

        jLabel10.setText("masukan banyak kursi");

        tableDaftarMeja.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDaftarMeja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDaftarMejaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDaftarMeja);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Daftar Meja Restoran");

        RefreshDaftarMejaBTN.setText("Refresh");
        RefreshDaftarMejaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshDaftarMejaBTNActionPerformed(evt);
            }
        });

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Booked", "Check in" }));
        DropDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DropDownMouseClicked(evt);
            }
        });
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RefreshDaftarMejaBTN)
                            .addComponent(jLabel5)
                            .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambahDaftarMejaBTN)
                            .addComponent(jLabel9)
                            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(banyakKursiInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(39, 39, 39))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaPemTokoDisplay))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaPemTokoDisplay))
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RefreshDaftarMejaBTN)
                        .addGap(18, 18, 18)
                        .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(banyakKursiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(tambahDaftarMejaBTN)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOME", Home);

        SetAlamatResto.setText("Set Nama resto");
        SetAlamatResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetAlamatRestoActionPerformed(evt);
            }
        });

        UbahUsername.setText("Ubah Username");
        UbahUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahUsernameActionPerformed(evt);
            }
        });

        UbahNoTelpon.setText("Ubah no Telpon");
        UbahNoTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNoTelponActionPerformed(evt);
            }
        });

        UbahPassword.setText("Ubah Password");
        UbahPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahPasswordActionPerformed(evt);
            }
        });

        LogoutBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogoutBTN.setText("Logout");
        LogoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nama resto:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nama:");

        NamaRestoProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NamaRestoProfile.setText("nama resto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        UbahNamaResto.setText("Ubah nama resto");
        UbahNamaResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNamaRestoActionPerformed(evt);
            }
        });

        UsernameUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsernameUserProfile.setText("username user");

        SetNamaResto.setText("Set Nama Resto");
        SetNamaResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetNamaRestoActionPerformed(evt);
            }
        });

        NamaUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NamaUserProfile.setText("nama user");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Alamat resto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("No Telpon:");

        AlamatRestoProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AlamatRestoProfile.setText("Alamat resto");

        NoTelpUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NoTelpUserProfile.setText("no telpon user");

        UbahAlamatResto.setText("Ubah Alamat resto");
        UbahAlamatResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahAlamatRestoActionPerformed(evt);
            }
        });

        UbahNama.setText("Ubah Nama");
        UbahNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addComponent(UbahNama)
                        .addGap(203, 203, 203)
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(UsernameUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addGap(44, 44, 44))
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(UbahUsername)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(NamaUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(LogoutBTN)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UbahPassword)
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ProfileLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(10, 10, 10)
                                        .addComponent(NamaRestoProfile))
                                    .addGroup(ProfileLayout.createSequentialGroup()
                                        .addComponent(UbahNamaResto)
                                        .addGap(22, 22, 22)
                                        .addComponent(SetNamaResto))))
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addComponent(AlamatRestoProfile))
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(NoTelpUserProfile))
                            .addComponent(UbahNoTelpon)
                            .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(UbahAlamatResto)
                                .addGap(18, 18, 18)
                                .addComponent(SetAlamatResto)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamaUserProfile)
                    .addComponent(jLabel3)
                    .addComponent(UsernameUserProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbahNama)
                    .addComponent(UbahUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UbahPassword)
                .addGap(54, 54, 54)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NoTelpUserProfile)
                    .addComponent(jLabel7)
                    .addComponent(NamaRestoProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbahNoTelpon)
                    .addComponent(UbahNamaResto)
                    .addComponent(SetNamaResto))
                .addGap(18, 18, 18)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AlamatRestoProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbahAlamatResto)
                    .addComponent(SetAlamatResto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(LogoutBTN)
                .addGap(121, 121, 121))
        );

        jTabbedPane1.addTab("Profile", Profile);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetAlamatRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetAlamatRestoActionPerformed
        if (SesiLogin.getNamaResto() == null || SesiLogin.getNamaResto().isEmpty()) {
            SetDataResto newDataResto = new SetDataResto();
            newDataResto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Anda sudah mendaftarkan toko anda", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SetAlamatRestoActionPerformed

    private void UbahUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahUsernameActionPerformed
        UbahUsername changeUsername = new UbahUsername();
        changeUsername.setVisible(true);
    }//GEN-LAST:event_UbahUsernameActionPerformed

    private void UbahNoTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNoTelponActionPerformed
        UbahNoTelpon changeNoTelpon = new UbahNoTelpon();
        changeNoTelpon.setVisible(true);
    }//GEN-LAST:event_UbahNoTelponActionPerformed

    private void UbahPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahPasswordActionPerformed
        UbahPassword changePassword = new UbahPassword();
        changePassword.setVisible(true);
    }//GEN-LAST:event_UbahPasswordActionPerformed

    private void LogoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTNActionPerformed
        SesiLogin.clearSesiLogin();

        Login LoginScreen = new Login();
        LoginScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBTNActionPerformed

    private void UbahNamaRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNamaRestoActionPerformed
        if (SesiLogin.getNamaResto() != null && !SesiLogin.getNamaResto().isEmpty()) {
            UbahNamaResto newUbahNamaResto = new UbahNamaResto();
            newUbahNamaResto.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum mendaftarkan toko anda", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_UbahNamaRestoActionPerformed

    private void SetNamaRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetNamaRestoActionPerformed
        if (SesiLogin.getNamaResto() == null || SesiLogin.getNamaResto().isEmpty()) {
            SetDataResto newDataResto = new SetDataResto();
            newDataResto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Anda sudah mendaftarkan toko anda", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SetNamaRestoActionPerformed

    private void UbahAlamatRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahAlamatRestoActionPerformed
        if (SesiLogin.getNamaResto() != null && !SesiLogin.getNamaResto().isEmpty()) {
            SetDataResto newUbahNamaResto = new SetDataResto();
            newUbahNamaResto.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Anda belum mendaftarkan toko anda", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_UbahAlamatRestoActionPerformed

    private void UbahNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNamaActionPerformed
        UbahNamaUser changeName = new UbahNamaUser();
        changeName.setVisible(true);
    }//GEN-LAST:event_UbahNamaActionPerformed

    private void RefreshDaftarMejaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshDaftarMejaBTNActionPerformed
        tableDaftarMeja.removeAll();
        int rows = modelDaftarMeja.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            modelDaftarMeja.removeRow(i);
        }
        
        loadDaftarMeja();
    }//GEN-LAST:event_RefreshDaftarMejaBTNActionPerformed

    private void tambahDaftarMejaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahDaftarMejaBTNActionPerformed
        int banyaKursi = (int) banyakKursiInput.getValue();
        int idResto = SesiLogin.getIdResto();
        String statusMeja = "tersedia";
        
        if (banyaKursi == 0) {
            JOptionPane.showMessageDialog(null, "Masukan jumlah kursi");
        } else {
            boolean status = DafMejaCNTRL.tambahMeja(idResto, banyaKursi, statusMeja);
            driver.tambahMeja(status);
        }
    }//GEN-LAST:event_tambahDaftarMejaBTNActionPerformed

    private void DropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownActionPerformed
        String select = (String) DropDown.getSelectedItem();
        
        if (select.equals("Tersedia") || select.equals("Booked") || select.equals("Check in")) {
            clearTable();
            loadDaftarMejaByStatus(select);
        }
    }//GEN-LAST:event_DropDownActionPerformed

    private void DropDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DropDownMouseClicked
        String select = (String) DropDown.getSelectedItem();
        
        if (select.equals("tersedia") || select.equals("booked") || select.equals("Check in")) {
            clearTable();
            loadDaftarMejaByStatus(select);
        }
    }//GEN-LAST:event_DropDownMouseClicked

    private void tableDaftarMejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDaftarMejaMouseClicked
        int selected = tableDaftarMeja.getSelectedRow();
        
        if (selected != -1) {
            int idMeja = (int) modelDaftarMeja.getValueAt(selected, 0);
            int jumlahKursi = (int) modelDaftarMeja.getValueAt(selected, 1);
            String status = modelDaftarMeja.getValueAt(selected, 2).toString();
            
            UbahStatusMeja ubahdatameja = new UbahStatusMeja();
            ubahdatameja.UbahDataMeja(status, idMeja, jumlahKursi);
            ubahdatameja.setVisible(true);
        }
    }//GEN-LAST:event_tableDaftarMejaMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPemilikResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPemilikResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPemilikResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPemilikResto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPemilikResto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlamatRestoProfile;
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JPanel Home;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JLabel NamaRestoProfile;
    private javax.swing.JLabel NamaUserProfile;
    private javax.swing.JLabel NoTelpUserProfile;
    private javax.swing.JPanel Profile;
    private javax.swing.JButton RefreshDaftarMejaBTN;
    private javax.swing.JButton SetAlamatResto;
    private javax.swing.JButton SetNamaResto;
    private javax.swing.JButton UbahAlamatResto;
    private javax.swing.JButton UbahNama;
    private javax.swing.JButton UbahNamaResto;
    private javax.swing.JButton UbahNoTelpon;
    private javax.swing.JButton UbahPassword;
    private javax.swing.JButton UbahUsername;
    private javax.swing.JLabel UsernameUserProfile;
    private javax.swing.JSpinner banyakKursiInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel namaPemTokoDisplay;
    private javax.swing.JTable tableDaftarMeja;
    private javax.swing.JButton tambahDaftarMejaBTN;
    // End of variables declaration//GEN-END:variables
}