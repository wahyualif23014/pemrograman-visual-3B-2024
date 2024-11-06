/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5.karyawan;

/**
 *
 * @author Amira Alissiya
 */
public class Karyawan {
    private int id_karyawan;
    private String nama, jabatan, departemen;
    
    public Karyawan (int p_id, String p_namaK, String p_jab, String p_dep){
        this.id_karyawan = p_id;
        this.nama = p_namaK;
        this.jabatan = p_jab;
        this.departemen = p_dep;
    }
    
    public void setId(int p_id){
        this.id_karyawan = p_id;
    }
    
    public int getId (){
        return id_karyawan;
    }
    
    public void setNamaK(String p_namaK){
        this.nama = p_namaK;
    }
    
    public String getNamaK(){
        return nama;
    }
    
    public void setJab (String p_jab){
        this.jabatan = p_jab;
    }
    
    public String getJab(){
        return jabatan;
    }
    
    public void setDep (String p_dep){
        this.departemen = p_dep;
    }
    
    public String getDep(){
        return departemen;
    }
    
}
