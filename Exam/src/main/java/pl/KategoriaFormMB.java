package pl;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class KategoriaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String izena;
	private String deskribapena;
	
	public KategoriaFormMB() {
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
	
	public void resetForm() {
		izena = null;
		deskribapena = null;
	}

}
