package pl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import bl.AdminEJB;
import dl.KategoriakE;
import dl.LekuakE;

@Named
@SessionScoped
public class AdminAtazakMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<KategoriakE> kategoriak = new ArrayList<KategoriakE>();
	private List<KategoriakE> kategoriakDB = new ArrayList<KategoriakE>();
	
	@EJB private AdminEJB aEJB;
	
	public void kategoriaSartuDB(KategoriaFormMB kFMB, AdminViewMB aViewMB) {
		KategoriakE kategoriaE = new KategoriakE(kFMB.getIzena(), kFMB.getDeskribapena());
		
		aEJB.kategoriaSartuDB(kategoriaE);
		
		kFMB.resetForm();
		aViewMB.resetView();
	}
	
	public void lekuaSartuDB(LekuaFormMB lFMB, AdminViewMB aViewMB) {
		LekuakE lekuaE = new LekuakE(0, lFMB.getDeskribapena(), lFMB.getIzena(), lFMB.getLatitudea(), lFMB.getLongitudea());
		
		if(!lekuaE.getIzena().isEmpty() && (lekuaE.getIzena().length()>1)) {
			aEJB.lekuaSartuDB(lekuaE);
			System.out.println("IZENA: '" + lekuaE.getIzena() + "' LUZEERA:" +lekuaE.getIzena().length());
		}
		else {
			System.out.println("Izena hutsik duen lerro bat ez dugu onartuko!");
		}
		
		lFMB.resetForm();
		aViewMB.resetView();
		kategoriak = new ArrayList<KategoriakE>();
		kategoriakDB = new ArrayList<KategoriakE>();
	}
	
	public AdminAtazakMB() {
		// TODO Auto-generated constructor stub
	}
	
	public void kategoriaZerrendaratu(ZerrendaFormMB zFMB, AdminViewMB aViewMB) {
		kategoriakDB = aViewMB.kategoriakLortu();
		if(kategoriak==null || !kategoriak.contains(kategoriakDB.get(zFMB.getKategoriaZerren()))) {
			kategoriak.add(kategoriakDB.get(zFMB.getKategoriaZerren()));
		}
		
		zFMB.resetForm();
		aViewMB.resetView();
	}

	public List<KategoriakE> getKategoriak() {
		return kategoriak;
	}

	public void setKategoriak(List<KategoriakE> kategoriak) {
		this.kategoriak = kategoriak;
	}
	
	

}
