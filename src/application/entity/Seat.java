package application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "seats")
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seatId;
	private int rowNumb;
	private int seatNumb;
	
	  @ManyToOne(fetch = FetchType.LAZY)
	  
	  @JsonBackReference private Price price;
	  
	  @ManyToOne
	  
	 @JsonBackReference private Hall hall;
	 
	 @OneToOne(fetch = FetchType.LAZY, mappedBy = "seat", cascade =
	 CascadeType.ALL) private Ticket ticket;
	 
}
