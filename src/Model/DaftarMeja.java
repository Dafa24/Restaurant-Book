
package Model;

public class DaftarMeja {
    private int idMeja;
    private int idResto;
    private int jumlahKursi;
    private String status;

    public DaftarMeja(int idMeja, int idResto, int jumlahKursi, String status) {
        this.idMeja = idMeja;
        this.idResto = idResto;
        this.jumlahKursi = jumlahKursi;
        this.status = status;
    }

    public int getIdMeja() {
        return idMeja;
    }

    public void setIdMeja(int idMeja) {
        this.idMeja = idMeja;
    }

    public int getIdResto() {
        return idResto;
    }

    public void setIdResto(int idResto) {
        this.idResto = idResto;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
