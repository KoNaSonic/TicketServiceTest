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

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "halls")

public class Hall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hallId;
	
	@OneToMany(mappedBy = "hall", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Event> event = new ArrayList<>();
	
	@OneToMany(mappedBy = "hall", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Seat> seat = new ArrayList<>();
	
	private String hallName;
	
	private String hallType;
	
	private Integer seatsTotal;
	
	private String layout;

	public Hall (Long hallId, String hallName, String hallType, Integer seatsTotal, String layout) {
		this.hallId = hallId;
		this.hallName = hallName;
		this.hallType = hallType;
		this.seatsTotal = seatsTotal;
		this.layout = layout;
	}

}
