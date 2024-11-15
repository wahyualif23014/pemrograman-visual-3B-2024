/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaksi;

/**
 *
 * @author Amira Alissiya
 */
public class Transaksi {
    private int id_karyawan, id_proyek
//            , durasi
            ;
    private String peran;
    
        public Transaksi (int p_idK, int p_idP, String p_peran
//                , int p_durasi
        ){
        this.id_karyawan = p_idK;
        this.id_proyek = p_idP;
        this.peran = p_peran;
//        this.durasi = p_durasi;
    }


    public int getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public int getId_proyek() {
        return id_proyek;
    }

    public void setId_proyek(int id_proyek) {
        this.id_proyek = id_proyek;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

//    public int getDurasi() {
//        return durasi;
//    }
//
//    public void setDurasi(int durasi) {
//        this.durasi = durasi;
//    }

}
