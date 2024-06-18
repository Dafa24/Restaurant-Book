package Controller;

import Helper.Koneksi;
import Model.Restoran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestoranController {
    
    public boolean insertResto(int idAkun, String namaResto, String alamatResto){
        String sql = "INSERT INTO restoran (id_akun, nama_restoran, alamat) values (?,?,?)";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, idAkun);
            stmt.setString(2, namaResto);
            stmt.setString(3, alamatResto);
           
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
    
    public boolean updateNamaResto(int idResto, String newNamaresto){
        String sql = "UPDATE restoran SET nama_restoran=? WHERE id_restoran=?";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, newNamaresto);
            stmt.setInt(2, idResto);
            
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
    
    public boolean updateAlamatResto(int idResto, String newAlamatresto){
        String sql = "UPDATE restoran SET alamat=? WHERE id_restoran=?";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, newAlamatresto);
            stmt.setInt(2, idResto);
            
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
    
    public Restoran getRestoByNama(String namaResto) {
        String sql = "SELECT * FROM restoran WHERE nama_restoran=?";
        
        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, namaResto);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int idRetso = rs.getInt("id_restoran");
                    int idAkun = rs.getInt("id_akun");
                    String namaresto = rs.getString("nama_restoran");
                    String alamat = rs.getString("alamat");
                    
                    Restoran newResto = new Restoran(idRetso, idAkun, namaresto, alamat);
                    return newResto;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
