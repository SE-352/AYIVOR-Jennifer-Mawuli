package entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import lombok.AllArgsConstructor;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@AllArgsConstructor
@Entity
@Table(name="Cours")
public class Cours extends BaseEntity implements Serializable{
	
	
	@Column(length=60, nullable= false,unique=true, name="intitulé")
	private String intitule;
	
	@Column(name="date_creation")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@ManyToOne()
	@JoinColumn(name="professeur_id")
	private Professeur professeur;
	
	@ManyToMany()
	@JoinTable(name="inscriptions",
			joinColumns = @JoinColumn(name="cours_id"),
			inverseJoinColumns=@JoinColumn(name="etudiant_id"))
	private Set<Etudiant> etudiants;
	
	public Cours(String intitule, Date date) {
		super();
		this.intitule = intitule;
		this.dateCreation = date;
	}
	

}
