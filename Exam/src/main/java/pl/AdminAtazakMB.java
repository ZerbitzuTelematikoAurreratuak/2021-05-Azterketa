package pl;

import java.io.Serializable;

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

	@EJB private AdminEJB aEJB;	
	
	public void kategoriaSartuDB(KategoriaFormMB kFMB, AdminViewMB aViewMB) {
		KategoriakE kategoriaE = new KategoriakE(kFMB.getIzena(), kFMB.getDeskribapena());
		
		aEJB.kategoriaSartuDB(kategoriaE);
		
		kFMB.resetForm();
		aViewMB.resetView();
	}
	
	public void lekuaSartuDB(LekuaFormMB lFMB, AdminViewMB aViewMB) {
		LekuakE lekuaE = new LekuakE(lFMB.getIdlekua(), lFMB.getDeskribapena(), lFMB.getIzena(), lFMB.getLatitudea(), lFMB.getLongitudea());
		
		aEJB.lekuaSartuDB(lekuaE);
		
		lFMB.resetForm();
		aViewMB.resetView();
	}
	
	public AdminAtazakMB() {
		// TODO Auto-generated constructor stub
	}

}
