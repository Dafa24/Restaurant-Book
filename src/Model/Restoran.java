package Model;

public class Restoran {
    private int idRestoran;
    private int idAkun;
    private String namaResto;
    private String alamat;

    public Restoran(int idRestoran, int idAkun, String namaResto, String alamat) {
        this.idRestoran = idRestoran;
        this.idAkun = idAkun;
        this.namaResto = namaResto;
        this.alamat = alamat;
    }

    public int getIdRestoran() {
        return idRestoran;
    }

    public void setIdRestoran(int idRestoran) {
        this.idRestoran = idRestoran;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public String getNamaResto() {
        return namaResto;
    }

    public void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
