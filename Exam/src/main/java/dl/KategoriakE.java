package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the kategoriak database table.
 * 
 */
@Entity
@Table(name="kategoriak")
@NamedQuery(name="KategoriakE.findAll", query="SELECT k FROM KategoriakE k")
public class KategoriakE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String mota;

	private String deskribapena;

	public KategoriakE() {
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getDeskribapena() {
		return this.deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	public KategoriakE(String mota, String deskribapena) {
		super();
		this.mota = mota;
		this.deskribapena = deskribapena;
	}
	
	

}