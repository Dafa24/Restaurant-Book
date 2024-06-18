package Model;

public class HistoryBooking {
    private int idHistoryBooking;
    private int idAkun;
    private int idMeja;
    private int idResto;
    private String namaRestoran;
    private String WaktuDatang;
    private String status;
    private String nama_pemesan;

    public HistoryBooking(int idHistoryBooking, int idAkun, int idMeja, int idResto, String namaRestoran, String WaktuDatang, String status, String nama_pemesan) {
        this.idHistoryBooking = idHistoryBooking;
        this.idAkun = idAkun;
        this.idMeja = idMeja;
        this.idResto = idResto;
        this.namaRestoran = namaRestoran;
        this.WaktuDatang = WaktuDatang;
        this.status = status;
        this.nama_pemesan = nama_pemesan;
    }

    public int getIdHistoryBooking() {
        return idHistoryBooking;
    }

    public void setIdHistoryBooking(int idHistoryBooking) {
        this.idHistoryBooking = idHistoryBooking;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
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

    public String getNamaRestoran() {
        return namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public String getWaktuDatang() {
        return WaktuDatang;
    }

    public void setWaktuDatang(String WaktuDatang) {
        this.WaktuDatang = WaktuDatang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }
}
