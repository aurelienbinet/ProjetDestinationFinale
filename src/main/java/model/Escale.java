package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "escale")
public class Escale {
	@EmbeddedId
	private EscalePK key;
	@Version
	private int version;
	@Column(name="heure_depart")
	@Temporal(TemporalType.TIME)
	private Date heureDepart;
	@Column(name="heure_arrivee")
	@Temporal(TemporalType.TIME)
	private Date heureArrivee;
	public Escale() {
	}
	
	
}
