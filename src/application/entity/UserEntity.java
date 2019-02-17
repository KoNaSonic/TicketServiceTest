package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="user")

public class UserEntity {
	
	@Id
	@Column(length=100)
	private String userEmail;
	
	@Column(length=100)
	private String userPass;
	
	@Column(length=100)
	private String userRole;
	
	@Column(length=100)
	private String userPhone;

	public UserEntity(String userEmail, String userPass) {
		this.userEmail = userEmail;
		this.userPass = userPass;
	}
	
	

}
