package aplikasikantor;

import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import java.sql.SQLException;

public class Karyawan {
    private int id;
    private String nama, jabatan, departemen;
    
    public Karyawan(int p_id, String p_nama_karyawan, String p_jabatan, String p_departemen){
        this.id = p_id;
        this.nama = p_nama_karyawan;
        this.jabatan = p_jabatan;
        this.departemen = p_departemen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
    
}
