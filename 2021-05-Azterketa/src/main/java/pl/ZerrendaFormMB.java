package pl;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ZerrendaFormMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private int kategoriaZerren;
	

	
	public ZerrendaFormMB(int kategoriaZerren) {
		super();
		this.kategoriaZerren = kategoriaZerren;
	}

	public ZerrendaFormMB() {
		super();
	}

	public int getKategoriaZerren() {
		return kategoriaZerren;
	}


	public void setKategoriaZerren(int kategoriaZerren) {
		this.kategoriaZerren = kategoriaZerren;
	}


	public void resetForm() {
		kategoriaZerren = 0;
	}

}
