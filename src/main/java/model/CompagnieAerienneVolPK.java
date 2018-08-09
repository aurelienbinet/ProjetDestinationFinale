package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompagnieAerienneVolPK implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "compagnieAerienne_id")
	private CompagnieAerienne compagnieAerienne;
	@ManyToOne
	@JoinColumn(name = "vol_id")
	private Vol vol;
	public CompagnieAerienneVolPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompagnieAerienneVolPK(CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}
	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}
	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vol == null) ? 0 : film.hashCode());
		result = prime * result + ((compagnieAerienne == null) ? 0 : compagnieAerienne.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompagnieAerienneVolPK other = (CompagnieAerienneVolPK) obj;
		if (film == null) {
			if (other.film != null)
				return false;
		} else if (!film.equals(other.film))
			return false;
		if (compagnieAerienne == null) {
			if (other.compagnieAerienne != null)
				return false;
		} else if (!compagnieAerienne.equals(other.compagnieAerienne))
			return false;
		return true;
	}
	
}
