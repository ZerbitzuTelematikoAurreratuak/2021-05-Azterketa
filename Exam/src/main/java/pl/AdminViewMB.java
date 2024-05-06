package pl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import bl.AdminEJB;
import dl.EsleipenakE;
import dl.KategoriakE;
import dl.LekuakE;

@Named
@ViewScoped
public class AdminViewMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB private AdminEJB aEJB;	
	
	private List<LekuakE> lekuakDB;
	private List<KategoriakE> kategoriakDB;
	private List<EsleipenakE> esleipenakDB;
	
	private int test = 4;
	
	
	
	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	public void resetView() {
		lekuakDB = null;
		kategoriakDB = null;
		esleipenakDB = null;
	}
	
	public List<LekuakE> lekuakLortuDB(){
		if(lekuakDB == null) {
			System.out.println("MB - Eskaera!");
			aEJB.lekuakLortuDB();
		}
		return lekuakDB;
	}
	
}
