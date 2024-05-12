package pl;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class LekuaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String izena;
	private String deskribapena;
	private float latitudea;
	private float longitudea;
	private int idlekua;
	
	public LekuaFormMB() {
		// TODO Auto-generated constructor stub
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}
	
	public float getLatitudea() {
		return latitudea;
	}

	public void setLatitudea(float latitudea) {
		this.latitudea = latitudea;
	}

	public float getLongitudea() {
		return longitudea;
	}

	public void setLongitudea(float longitudea) {
		this.longitudea = longitudea;
	}

	public int getIdlekua() {
		return idlekua;
	}

	public void setIdlekua(int idlekua) {
		this.idlekua = idlekua;
	}

	public void resetForm() {
		//ID-a automatikoki sortuko da!
		idlekua = 0;
		latitudea = 0.0F;
		longitudea = 0.0F;
		izena = null;
		deskribapena = null;
	}

}
