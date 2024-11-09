/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.proyek;

/**
 *
 * @author Amira Alissiya
 */
public class Proyek {
    private int id_proyek;
    private String nama_proyek, durasi_pengerjaan;

    public Proyek (int p_id, String p_namaP, String p_durasi){
        this.id_proyek = p_id;
        this.nama_proyek = p_namaP;
        this.durasi_pengerjaan = p_durasi;
    }
    
    public int getId() {
        return id_proyek;
    }

    public void setId(int id) {
        this.id_proyek = id;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public String getDurasi_pengerjaan() {
        return durasi_pengerjaan;
    }

    public void setDurasi_pengerjaan(String durasi_pengerjaan) {
        this.durasi_pengerjaan = durasi_pengerjaan;
    }
    
}
