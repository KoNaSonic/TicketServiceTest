package application.service;

import java.time.LocalDate;

import application.entity.User;
import org.springframework.stereotype.Service;

@Service
public class Manager extends User implements application.model.I_Manager {

	@Override
	public void addEvent(int eventID, String eventName, String artist, int hallName, LocalDate eventDate,
			LocalDate eventTime, String eventType, String desription) {
		// TODO Auto-generated method stub
	}

	@Override
	public void editEvent(int eventID) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteEvent(int eventID) {
		// TODO Auto-generated method stub
	}

	@Override
	public int setPricesOfSeats(String event, String seats, int price) {
		// TODO Auto-generated method stub
		return 0;
	}
}
