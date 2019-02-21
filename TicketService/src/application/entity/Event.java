package application.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="events")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long eventId;
	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Ticket> tickets = new ArrayList<Ticket>();
	@OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Price> prices = new ArrayList<>();
	@NotNull
	private String eventName; 
	@NotNull
	private LocalDate eventDate;
	@NotNull
	private LocalTime eventTime;
	@ManyToOne
	@JsonBackReference
	private Hall hall;
	@Enumerated(EnumType.STRING)
	private EventType eventType;
	
	private String description;
	@Lob
	private String image;
	private Boolean del;
	
	

}
