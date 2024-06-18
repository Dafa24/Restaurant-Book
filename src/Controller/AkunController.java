package Controller;

import Helper.Koneksi;
import Model.DriverBookingMeja;
import Model.PemilikResto;
import Model.Restoran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AkunController {
    public boolean daftarAkun(String nama, String Username, String Password, String role, String NoTelp){
        String sql = "INSERT INTO akun (nama, username, password, role, no_telpon) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Koneksi.getconnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nama);
            stmt.setString(2, Username);
            stmt.setString(3, Password);
            stmt.setString(4, role);
            stmt.setString(5, NoTelp);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, "Error inserting data", e);
        }
        return false;
    }
    
    public List<PemilikResto> getAllPemilikResto(){
        List<PemilikResto> dataPemilik = new ArrayList<>();
        
        String sql = "SELECT a.*, t.id_restoran, t.nama_restoran, t.alamat " +
                     "FROM akun a " +
                     "LEFT JOIN restoran t ON a.id_akun = t.id_akun " +
                     "WHERE a.role = 'Pemilik Resto'";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()) {
                int idAkun = rs.getInt("id_akun");
                String nama = rs.getString("nama");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String role = rs.getString("role");
                String noTelp = rs.getString("no_telpon");
                
                int idResto = rs.getInt("id_Restoran");
                String namaRestoran = rs.getString("nama_restoran");
                String alamatResto = rs.getString("alamat");
                
                PemilikResto newPemilik = new PemilikResto(idAkun, username, password, nama, role, noTelp);
                Restoran newRestoran = new Restoran(idResto, idAkun, alamatResto, nama);
                
                newPemilik.setRestoran(newRestoran);
                dataPemilik.add(newPemilik);
            }    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataPemilik;
    }
    
    public boolean updateNama(String newNama, int idAkun){
        String sql = "UPDATE akun SET nama=? WHERE id_akun=?";

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newNama);
            stmt.setInt(2, idAkun);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean updateUsername(String newUsername, int idAkun){
        String sql = "UPDATE akun SET Username=? WHERE id_akun=?";

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newUsername);
            stmt.setInt(2, idAkun);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean updateNoTelp(String newNoTelp, int idAkun){
        String sql = "UPDATE akun SET no_telpon=? WHERE id_akun=?";

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newNoTelp);
            stmt.setInt(2, idAkun);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public boolean updatePass(String oldPass, String newPass,int idAkun){
        String sql = "UPDATE akun SET password=? WHERE id_akun=? AND password=?";

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newPass);
            stmt.setInt(2, idAkun);
            stmt.setString(3, oldPass);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
}
