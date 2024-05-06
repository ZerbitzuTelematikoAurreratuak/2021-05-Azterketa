package dl;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esleipenak database table.
 * 
 */
@Entity
@Table(name="esleipenak")
@NamedQuery(name="EsleipenakE.findAll", query="SELECT e FROM EsleipenakE e")
public class EsleipenakE implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idesleipenak;

	//uni-directional many-to-one association to KategoriakE
	@ManyToOne
	private KategoriakE kategoriak;

	//uni-directional many-to-one association to LekuakE
	@ManyToOne
	private LekuakE lekuak;

	public EsleipenakE() {
	}

	public int getIdesleipenak() {
		return this.idesleipenak;
	}

	public void setIdesleipenak(int idesleipenak) {
		this.idesleipenak = idesleipenak;
	}

	public KategoriakE getKategoriak() {
		return this.kategoriak;
	}

	public void setKategoriak(KategoriakE kategoriak) {
		this.kategoriak = kategoriak;
	}

	public LekuakE getLekuak() {
		return this.lekuak;
	}

	public void setLekuak(LekuakE lekuak) {
		this.lekuak = lekuak;
	}

}