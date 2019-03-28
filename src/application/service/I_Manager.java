package application.model;

import java.time.LocalDate;

public interface I_Manager {

	void addEvent(int eventID, String eventName, String artist, int hallName, LocalDate eventDate, LocalDate eventTime,
			String eventType, String desription);
	/*
	 * Method adds new events
	 */

	void editEvent(int eventID);
	/*
	 * Editing an existing event
	 */

	void deleteEvent(int eventID);

	public int setPricesOfSeats(/* Event */ String event, /* Seats */String seats, int price);
	// Set a prices of seats of a specific Event;

}
