package application.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(length=128)
	@Email
	private String userEmail;
	
	@OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Ticket> tickets = new ArrayList<>();
	
	@NotNull
	private String userPass;
	private String userRole;
	private String userPhone;

}
