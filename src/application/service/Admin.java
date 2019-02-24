package application.model;

import java.time.LocalDate;

public interface Admin extends User{

	void addEvent (int eventID, String eventName, String artist, int hallName, 
			LocalDate eventDate, LocalDate eventTime, String eventType, String desription);
	/*
	 * Method adds new events
	 */
	
	 void editEvent(int eventID);
	 /*
	  * Editing an existing event
	  */
	 
	 void deleteEvent (int eventID);

	 public int setPricesOfSeats(Event event, Seats seats, int price);
	 // Set a prices of seats of a specific Event;


	
	
}
