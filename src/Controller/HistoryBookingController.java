package Controller;

import Helper.Koneksi;
import Model.DriverBookingMeja;
import Model.HistoryBooking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoryBookingController {
    
    public boolean tambahHistory(int idAkun, int idMeja, int idResto, String namaResto, String status, String waktuDatang){
        String sqlHISTORYBOOKING = "INSERT INTO history_booking (id_akun, id_meja, id_restoran, nama_restoran, waktu_datang, status) VALUES (?, ?, ?, ?, ?, ?)";
        String sqlUPDATEMEJA = "UPDATE daftar_meja SET status=? WHERE id_meja=?";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmtHISBOOK = conn.prepareStatement(sqlHISTORYBOOKING);
                PreparedStatement stmtUPMEJA = conn.prepareStatement(sqlUPDATEMEJA)){
            
            stmtHISBOOK.setInt(1, idAkun);
            stmtHISBOOK.setInt(2, idMeja);
            stmtHISBOOK.setInt(3, idResto);
            stmtHISBOOK.setString(4, namaResto);
            stmtHISBOOK.setString(5, waktuDatang);
            stmtHISBOOK.setString(6, status);
            stmtHISBOOK.executeUpdate();
            
            stmtUPMEJA.setString(1, status);
            stmtUPMEJA.setInt(2, idMeja);
            stmtUPMEJA.executeUpdate();
            
            return true;
        } catch (Exception e) {
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public List<HistoryBooking> getHistoryBookByIdUser(int idUser){
        List<HistoryBooking> dataRiwayatBook = new ArrayList<>();
        
        String sql = "SELECT * FROM history_booking WHERE id_akun=?";
        
        try(Connection conn = Koneksi.getconnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idUser);
            
            try (ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    int idHistoryBooking = rs.getInt("id_history_booking");
                    int idAkun = rs.getInt("id_akun");
                    int idMeja = rs.getInt("id_meja");
                    int idResto = rs.getInt("id_restoran");
                    String namaRestoran = rs.getString("nama_restoran");
                    String WaktuDatang = rs.getString("waktu_datang");
                    String status = rs.getString("status");
                    String nama = "";
                    
                    HistoryBooking newHis = new HistoryBooking(idHistoryBooking, idAkun, idMeja, idResto, namaRestoran, WaktuDatang, status, nama);
                    dataRiwayatBook.add(newHis);
                }
            } 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataRiwayatBook;
    }
    
    public boolean batalkanPesananMeja(int idMeja, int idHistoryBook, String statusHISTROY, String statusDAFMEJA){
        String sqlUBAHSTATUSHISTORY = "UPDATE history_booking SET status=? WHERE id_history_booking=?";
        String sqlUBAHSTATUSMEJA = "UPDATE daftar_meja SET status=? WHERE id_meja=?";
        
        try (Connection conn = Koneksi.getconnection();
                PreparedStatement stmtHistory = conn.prepareStatement(sqlUBAHSTATUSHISTORY);
                PreparedStatement stmtDafMeja = conn.prepareStatement(sqlUBAHSTATUSMEJA)){
            
            stmtHistory.setString(1, statusHISTROY);
            stmtHistory.setInt(2, idHistoryBook);
            stmtHistory.executeUpdate();
            
            stmtDafMeja.setString(1, statusDAFMEJA);
            stmtDafMeja.setInt(2, idMeja);
            stmtDafMeja.executeUpdate();
            
            return true;
        } catch (Exception e) {
            Logger.getLogger(DriverBookingMeja.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public List<HistoryBooking> getAllHistoryBooking() {
        List<HistoryBooking> historyBookingList = new ArrayList<>();
        String sql = "SELECT hb.*, a.NAMA AS nama_pemesan " +
                     "FROM history_booking hb " +
                     "JOIN akun a ON hb.ID_AKUN = a.ID_AKUN";

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int idHistoryBooking = rs.getInt("ID_HISTORY_BOOKING");
                int idAkun = rs.getInt("ID_AKUN");
                int idMeja = rs.getInt("ID_MEJA");
                int idRestoran = rs.getInt("ID_RESTORAN");
                String namaRestoran = rs.getString("nama_restoran");
                String waktuDatang = rs.getString("waktu_datang");
                String status = rs.getString("status");
                String namaPemesan = rs.getString("nama_pemesan");

                HistoryBooking historyBooking = new HistoryBooking(idHistoryBooking, idAkun, idMeja, idRestoran, namaRestoran, waktuDatang, status, namaPemesan);
                historyBookingList.add(historyBooking);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historyBookingList;
    }
    
        public int getTotalTransaksi(){
        String sql = "SELECT COUNT(*) AS total FROM history_booking";
        int totalTransaksi = 0;

        try (Connection conn = Koneksi.getconnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                totalTransaksi = rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();  
        }

        return totalTransaksi;
    }

}
