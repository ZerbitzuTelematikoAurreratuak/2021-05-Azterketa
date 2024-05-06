package dl;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the lekuak database table.
 * 
 */
@Entity
@Table(name="lekuak")
@NamedQuery(name="LekuakE.findAll", query="SELECT l FROM LekuakE l")
public class LekuakE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idlekua;

	private String deskribapena;

	private String izena;

	private float latitudea;

	private float longitudea;

	public LekuakE() {
	}

	public int getIdlekua() {
		return this.idlekua;
	}

	public void setIdlekua(int idlekua) {
		this.idlekua = idlekua;
	}

	public String getDeskribapena() {
		return this.deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	public String getIzena() {
		return this.izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public float getLatitudea() {
		return this.latitudea;
	}

	public void setLatitudea(float latitudea) {
		this.latitudea = latitudea;
	}

	public float getLongitudea() {
		return this.longitudea;
	}

	public void setLongitudea(float longitudea) {
		this.longitudea = longitudea;
	}

	public LekuakE(int idlekua, String deskribapena, String izena, float latitudea, float longitudea) {
		super();
		this.idlekua = idlekua;
		this.deskribapena = deskribapena;
		this.izena = izena;
		this.latitudea = latitudea;
		this.longitudea = longitudea;
	}
	
	

}