package entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Departement extends BaseEntity{
	
	@Column(length=50,nullable=false)
	private String nom;
	
	@Column(length=50,nullable=false)
	private String adressWeb;
	
	@OneToMany(mappedBy="departement",fetch=FetchType.LAZY)
	private Set<Etudiant> etudiants;

	public Departement(String nom, String adressWeb) {
		super();
		this.nom = nom;
		this.adressWeb = adressWeb;
	}
	
}
