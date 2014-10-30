
package Tubagus.Fajar.model;

/**
 *
 * @author Fajar
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    private Integer id, npm;
    private String nama, tmplahir, jk, alamat;
    private Date tgllahir;
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNpm() {
		return npm;
	}
	public void setNpm(Integer npm) {
		this.npm = npm;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getTempatLahir() {
		return tmplahir;
	}
	public void setTempatLahir(String tmplahir) {
		this.tmplahir = tmplahir;
	}
	public String getJenisKelamin() {
		return jk;
	}
	public void setJenisKelamin(String jk) {
		this.jk = jk;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public Date getTglLahir() {
		return tgllahir;
	}
	public void setTglLahir(Date tgllahir) {
		this.tgllahir = tgllahir;
	}
        public String getTempatTanggalLahir(){
        DateFormat df = new SimpleDateFormat("dd MMMMM yyyy");
        String gooddate = df.format(tgllahir);
        return tmplahir + ", " + gooddate;
    }
}
