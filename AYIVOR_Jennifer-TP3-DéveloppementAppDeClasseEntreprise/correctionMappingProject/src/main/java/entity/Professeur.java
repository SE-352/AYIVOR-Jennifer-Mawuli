package entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="professeurs")
@DiscriminatorValue(value="Professeur")
public class Professeur extends Personne {
	
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Integer Id;
	
	@Column(length=50, nullable=false)
	private String grade;
	
	@OneToMany(mappedBy="cours",fetch=FetchType.LAZY)
	private Set<Cours> cours;
	
	
	public Professeur(String nom, String prenom, String email, String grade) {
		super(nom, prenom, email);
		this.grade = grade;
	}
	
	
	public Professeur(String nom, String prenom, String email) {
		super(nom, prenom, email);
		// TODO Auto-generated constructor stub
	}


	
	


	

}
