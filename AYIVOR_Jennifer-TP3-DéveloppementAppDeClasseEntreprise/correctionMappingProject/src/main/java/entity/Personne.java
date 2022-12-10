package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
//@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Table(name="Cours")
@DiscriminatorColumn(name="type")
public class Personne extends BaseEntity{
	
	
	@Column(length=50,nullable=false)
	protected String nom;
	
	@Column(length=50, nullable=false)
	protected String prenom;
	
	@Column(length=50)
	protected String email;
	
	public Personne(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	

}
