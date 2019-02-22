package application.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "price")
public class Price {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long priceId;
	@OneToMany(mappedBy = "price",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Seat> seats = new ArrayList<>();
	@Digits(integer=10,fraction=3)
	private Double pricePrice;
	@ManyToOne
	@JsonBackReference
	private SeatType  seatType;
	@ManyToOne
	@JsonBackReference
	private Event event;
	

}
