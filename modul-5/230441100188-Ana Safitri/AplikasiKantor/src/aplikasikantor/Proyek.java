package aplikasikantor;

public class Proyek {
    private int id2;
    private String nama_proyek;
    private int durasi_pengerjaan;

    public Proyek(int p_id2, String p_nama_proyek, int p_durasi_pengerjaan) {
        this.id2 = p_id2;
        this.nama_proyek = p_nama_proyek;
        this.durasi_pengerjaan = p_durasi_pengerjaan;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public int getDurasi_pengerjaan() {
        return durasi_pengerjaan;
    }

    public void setDurasi_pengerjaan(int durasi_pengerjaan) {
        this.durasi_pengerjaan = durasi_pengerjaan;
    }
}
