package Controller;

import Helper.Koneksi;
import Model.DriverBookingMeja;
import Model.SesiLogin;
import View.Login;
import View.MenuAdmin;
import View.MenuPemesan;
import View.MenuPemilikResto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginController implements Model.Login {
    private View.Login asLogin;

    public LoginController(Login asLogin) {
        this.asLogin = asLogin;
    }
    
    @Override
    public void login(String username, String password) {
        String sql = "SELECT a.*, t.id_restoran, t.nama_restoran, t.alamat " +
                 "FROM akun a " +
                 "LEFT JOIN restoran t ON a.id_akun = t.id_akun " +
                 "WHERE a.username = ? AND a.password = ?";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            try(ResultSet rs = stmt.executeQuery()){
                if (rs.next()) {
                    int idAkun = rs.getInt("id_akun");
                    int idRestoran = rs.getInt("id_restoran");
                    String nama = rs.getString("nama");
                    String role = rs.getString("role");
                    String no_telp = rs.getString("no_telpon");
                    String namaResto = rs.getString("nama_restoran");
                    String alamatResto = rs.getString("alamat");
                    
                    SesiLogin.setId(idAkun);
                    SesiLogin.setIdResto(idRestoran);
                    SesiLogin.setNama(nama);
                    SesiLogin.setNoTelpon(no_telp);
                    SesiLogin.setUsername(username);
                    SesiLogin.setNamaResto(namaResto);
                    SesiLogin.setAlamatResto(alamatResto);
                    
                    if (role.equals("Pemesan")) {
                        MenuPemesan MPemesan = new MenuPemesan();
                        MPemesan.setVisible(true);
                        this.asLogin.dispose();
                    } else if (role.equals("Pemilik Resto")) {
                        MenuPemilikResto MPemilikResto = new MenuPemilikResto();
                        MPemilikResto.setVisible(true);
                        this.asLogin.dispose();
                        if (namaResto == null || alamatResto == null || namaResto.isEmpty() || alamatResto.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Lengkapi data restoran anda", "Peringatan", JOptionPane.WARNING_MESSAGE);
                        }
                    } else if (role.equals("Admin")){
                        MenuAdmin MAdmin = new MenuAdmin();
                        MAdmin.setVisible(true);
                        this.asLogin.dispose();
                    } else {
                        JOptionPane.showMessageDialog(asLogin, "AKUN TIDAK TERDAFTAR");
                    }
                } else {
                    JOptionPane.showMessageDialog(asLogin, "USERNAME ATAU PASSWORD SALAH");
                }
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Peringantan", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
