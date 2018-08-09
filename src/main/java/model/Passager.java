package model;


import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "?????")
@NamedQueries({ @NamedQuery(name = "Passager.findAll", query = "select p from Passager p"),
	@NamedQuery(name = "Passager.findByVille", query = "select p from Passager p where lower(p.adresse.ville) like :ville") })
@Embeddable
public class Passager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPassager")
	@SequenceGenerator(name = "seqPassager", sequenceName = "seq_passager", initialValue = 100, allocationSize = 1)
	@Column(name = "nom_passager", length = 50, nullable = false)
	private String nom;
	@Column(name = "prenom_passager", length = 50)
	private String prenom;
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Embedded
		
	private Adresse adresse;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
