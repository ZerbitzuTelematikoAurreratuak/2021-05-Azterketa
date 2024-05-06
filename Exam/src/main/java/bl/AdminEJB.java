package bl;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dl.KategoriakE;
import dl.LekuakE;

/**
 * Session Bean implementation class AdminEJB
 */
@Stateless
@LocalBean
public class AdminEJB {

	@PersistenceContext private EntityManager em;
	@Resource private  javax.ejb.EJBContext ejbContext;
	
    /**
     * Default constructor. 
     */
    public AdminEJB() {
        // TODO Auto-generated constructor stub
    }
    
    @SuppressWarnings("unchecked")
	public List<LekuakE> lekuakLortuDB(){
    	System.out.println("EJB - Eskaera!");
    	return(List<LekuakE>)em.createNamedQuery("LekuakE.findAll").getResultList();
    }
    
    public void kategoriaSartuDB(KategoriakE kategoriaE) {
    	em.persist(kategoriaE);
    }
    
    public void lekuaSartuDB(LekuakE lekuaE) {
    	em.persist(lekuaE);
    }

}
