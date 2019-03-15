package application.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="seat_type")

public class SeatType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSeatType;
	
	@NotNull
	private String seatType;
	
	@OneToMany(mappedBy="seatType", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Price> prices = new ArrayList<>();
}
