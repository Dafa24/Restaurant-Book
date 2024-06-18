package Model;

public class PemilikResto extends Akun {
    private int idAkun;
    private String Username;
    private String password;
    private String nama;
    private String role;
    private String noTelp;
    private Restoran restoran;

    public PemilikResto(int idAkun, String Username, String password, String nama, String role, String noTelp) {
        super(idAkun, Username, password, nama, role, noTelp);
        this.idAkun = idAkun;
        this.Username = Username;
        this.password = password;
        this.nama = nama;
        this.role = role;
        this.noTelp = noTelp;
        this.restoran = restoran;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }
}
