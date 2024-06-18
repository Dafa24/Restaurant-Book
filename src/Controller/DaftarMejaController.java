package Controller;

import Helper.Koneksi;
import Model.DaftarMeja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaftarMejaController {
    
    public List<DaftarMeja> getAllDaftarMeja(int idResto){
        List<DaftarMeja> dataMeja = new ArrayList<>();
        
        String sql = "SELECT * FROM daftar_meja WHERE id_restoran=?";
        
        try(Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idResto);
            
            
            try (ResultSet rs = stmt.executeQuery()){
                while(rs.next()){   
                    int idMeja = rs.getInt("id_meja");
                    int idRestoran = rs.getInt("id_restoran");
                    int jumlahKursi = rs.getInt("jumlah_kursi");
                    String status = rs.getString("status");
                    
                    DaftarMeja data = new DaftarMeja(idMeja, idResto, jumlahKursi, status);
                    dataMeja.add(data);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMeja;
    }
    
    public List<DaftarMeja> getDaftarMejaByStatus(int idResto, String Status){
        List<DaftarMeja> dataMejabyStatus = new ArrayList<>();
        
        String sql = "SELECT * FROM daftar_meja WHERE id_restoran=? AND status=?";
        
        try(Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idResto);
            stmt.setString(2, Status);
            
            try (ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    int idMeja = rs.getInt("id_meja");
                    int idRestoran = rs.getInt("id_restoran");
                    int jumlahKursi = rs.getInt("jumlah_kursi");
                    String status = rs.getString("status");
                    
                    DaftarMeja data = new DaftarMeja(idMeja, idResto, jumlahKursi, status);
                    dataMejabyStatus.add(data);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMejabyStatus;
    }
    
    public boolean tambahMeja(int idResto, int jumlahKursi, String Status){
        String SQL = "INSERT INTO daftar_meja (id_restoran, jumlah_kursi, status) VALUES (?, ? , ?)";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(SQL)){
            
            stmt.setInt(1, idResto);
            stmt.setInt(2, jumlahKursi);
            stmt.setString(3, Status);
            
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateStatusMeja(int idMeja, int idResto, String status){
        String sql = "UPDATE daftar_meja SET status=? WHERE id_meja=? AND id_Restoran=?";
        
        try(Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, status);
            stmt.setInt(2, idMeja);
            stmt.setInt(3, idResto);
            
            stmt.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
