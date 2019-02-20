package application.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	private Event event;
	@ManyToOne
	@JsonBackReference
	private AgeType ageType;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	private User user;
	@OneToOne(fetch=FetchType.LAZY)
	private Seat seat;

}
