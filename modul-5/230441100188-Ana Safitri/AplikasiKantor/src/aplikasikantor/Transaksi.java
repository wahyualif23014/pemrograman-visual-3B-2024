public class Transaksi {
    private int idTransaksi;
    private int idKaryawan;
    private String namaKaryawan;
    private int idProyek;
    private String namaProyek;
    private String peran;

    public Transaksi(int idTransaksi, int idKaryawan, String namaKaryawan, int idProyek, String namaProyek, String peran) {
        this.idTransaksi = idTransaksi;
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.peran = peran;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public int getIdProyek() {
        return idProyek;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public String getPeran() {
        return peran;
    }
    
    
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setIdProyek(int idProyek) {
        this.idProyek = idProyek;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }
}
