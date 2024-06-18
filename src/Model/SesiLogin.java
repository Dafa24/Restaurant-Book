
package Model;

public class SesiLogin {
    private static int id;
    private static int idResto;
    private static String username;
    private static String password;
    private static String nama;
    private static String role;
    private static String noTelpon;
    private static String namaResto;
    private static String alamatResto;   

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SesiLogin.id = id;
    }

    public static int getIdResto() {
        return idResto;
    }

    public static void setIdResto(int idResto) {
        SesiLogin.idResto = idResto;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        SesiLogin.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        SesiLogin.password = password;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        SesiLogin.nama = nama;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        SesiLogin.role = role;
    }

    public static String getNoTelpon() {
        return noTelpon;
    }

    public static void setNoTelpon(String noTelpon) {
        SesiLogin.noTelpon = noTelpon;
    }

    public static String getNamaResto() {
        return namaResto;
    }

    public static void setNamaResto(String namaResto) {
        SesiLogin.namaResto = namaResto;
    }

    public static String getAlamatResto() {
        return alamatResto;
    }

    public static void setAlamatResto(String alamatResto) {
        SesiLogin.alamatResto = alamatResto;
    }

        public static void clearSesiLogin() {
        id = 0;
        username = null;
        password = null;
        nama = null;
        role = null;
        noTelpon = null;
        namaResto = null;
        alamatResto = null;
    }
}
