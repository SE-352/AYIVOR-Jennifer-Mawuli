package entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="etudiants")
@DiscriminatorValue(value="ETUDIANT")
public class Etudiant extends Personne{
	
	@Column(length=50,nullable=false)
	private String adresse;
	
	@Column(length=50)
	private String telephone;
	
	@ManyToOne
	@JoinColumn(name="departement_id")
	private Departement departement;
	
	@ManyToMany(mappedBy="etudiants")
	@JoinTable(name="departement_id")
	private Set<Etudiant> etudiants;
	
	

	
	public Etudiant(String nom, String prenom, String email) {
		super(nom, prenom, email);
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, String prenom, String email, String adresse, String telephone) {
		super(nom, prenom, email);
		this.adresse = adresse;
		this.telephone = telephone;
	}
	
	

}
