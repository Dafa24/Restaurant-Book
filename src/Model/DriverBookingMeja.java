package Model;

import View.Components.BookingMeja;
import View.MenuAdmin;
import View.Components.RegisterPemesan;
import View.Components.RegisterPemilikResto;
import View.Components.SetDataResto;
import View.Components.TambahAdmin;
import View.Components.UbahAlamatResto;
import View.Components.UbahNamaResto;
import View.Components.UbahNamaUser;
import View.Components.UbahNoTelpon;
import View.Components.UbahPassword;
import View.Components.UbahStatusMeja;
import View.Components.UbahUsername;
import View.Components.cancelPemesanan;
import View.MenuPemesan;
import View.MenuPemilikResto;
import javax.swing.JOptionPane;

public class DriverBookingMeja {
    private RegisterPemesan asRegisterPemesan;
    private RegisterPemilikResto asRegisterPemilikResto;
    private MenuAdmin asMenuAdmin;
    private UbahNamaUser asUbahNamaUser;
    private UbahNoTelpon asUbahNamaTelpon;
    private UbahUsername asUbahUsername;
    private UbahPassword asUbahPass;
    private SetDataResto asSetDataResto;
    private UbahNamaResto asUbahNamaResto;
    private UbahAlamatResto asUbahAlamatResto;
    private MenuPemilikResto asMenuPemResto;
    private MenuPemesan asMenuPemesan;
    private BookingMeja asBookMeja;
    private UbahStatusMeja asUbahStatusMeja;
    private cancelPemesanan asCancelPemesanan;
    private TambahAdmin asTmbhAdmin;

    public DriverBookingMeja(RegisterPemesan asRegisterPemesan) {
        this.asRegisterPemesan = asRegisterPemesan;
    }

    public DriverBookingMeja(RegisterPemilikResto asRegisterPemilikResto) {
        this.asRegisterPemilikResto = asRegisterPemilikResto;
    }    

    public DriverBookingMeja(MenuAdmin asMenuAdmin) {
        this.asMenuAdmin = asMenuAdmin;
    }

    public DriverBookingMeja(UbahNamaUser asUbahNamaUser) {
        this.asUbahNamaUser = asUbahNamaUser;
    }

    public DriverBookingMeja(UbahNoTelpon asUbahNamaTelpon) {
        this.asUbahNamaTelpon = asUbahNamaTelpon;
    }

    public DriverBookingMeja(UbahUsername asUbahUsername) {
        this.asUbahUsername = asUbahUsername;
    } 

    public DriverBookingMeja(UbahPassword asUbahPass) {
        this.asUbahPass = asUbahPass;
    }

    public DriverBookingMeja(SetDataResto asSetDataResto) {
        this.asSetDataResto = asSetDataResto;
    }

    public DriverBookingMeja(UbahNamaResto asUbahNamaResto) {
        this.asUbahNamaResto = asUbahNamaResto;
    }

    public DriverBookingMeja(UbahAlamatResto asUbahAlamatResto) {
        this.asUbahAlamatResto = asUbahAlamatResto;
    }

    public DriverBookingMeja(MenuPemilikResto asMenuPemResto) {
        this.asMenuPemResto = asMenuPemResto;
    }

    public DriverBookingMeja(MenuPemesan asMenuPemesan) {
        this.asMenuPemesan = asMenuPemesan;
    }

    public DriverBookingMeja(BookingMeja asBookMeja) {
        this.asBookMeja = asBookMeja;
    }

    public DriverBookingMeja(UbahStatusMeja asUbahStatusMeja) {
        this.asUbahStatusMeja = asUbahStatusMeja;
    }

    public DriverBookingMeja(cancelPemesanan asCancelPemesanan) {
        this.asCancelPemesanan = asCancelPemesanan;
    }

    public DriverBookingMeja(TambahAdmin asTmbhAdmin) {
        this.asTmbhAdmin = asTmbhAdmin;
    }
    
    
    
    public void statusTambahUser(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Berhasil membuat akun");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void statusUbahNama(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Nama berhasil di ubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void statusUbahNoTelp(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "No telpon berhasil di ubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void statusUbahPass(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Password berhasil di ubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void statusUbahUsername(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Username berhasil di ubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void tambahRestoran(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Restoran berhasil ditambahkan");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void ubahNamaRestoran(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Nama Restoran berhasil diubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void ubahAlamatRestoran(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Alamat Restoran berhasil diubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void tambahMeja(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Meja berhasil ditambahkan");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void tambahHistory(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "History berhasil ditambahkan");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void ubahStatusMeja(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "Status Meja Berhasil di Ubah");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
    
    public void batalkanPesanan(boolean status){
        if (status) {
            JOptionPane.showMessageDialog(null, "pesanan berhasil dibatalkan");
        } else {
            JOptionPane.showMessageDialog(null, "EROR");
        }
    }
}
