package application.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="age_type")
public class AgeType {
	@Id
	private Integer idAgeType;
	
	@OneToMany(mappedBy="ageType",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Ticket> tickets = new ArrayList<>();
	private Integer coefficient;

}
