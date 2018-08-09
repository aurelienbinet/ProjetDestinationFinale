package model;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class EscalePK implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id_aeroport")
	private Aeroport aeroport;
	@ManyToOne
	@JoinColumn(name = "id_vol")
	private Vol vol;
	public EscalePK() {
	}
	
	

}
