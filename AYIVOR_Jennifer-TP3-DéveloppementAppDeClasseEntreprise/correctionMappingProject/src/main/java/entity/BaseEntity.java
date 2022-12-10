package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class BaseEntity {
	
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Integer Id;

}
