package application.model;

import java.time.LocalDate;

public interface Manager extends User{

	public void addEvent(int eventID, String eventName, String artist, int hallName, LocalDate eventDate, LocalDate eventTime,
			String eventType, String desription);
	/*
	 * Method add new event
	 */

	public void editEvent(String eventName);
	/*
	 * Editing an existing event
	 */

	public void changeEventStatus (String eventName);
	
	// Change of event status - visible, not visible, deleted.
	
	
	void deleteEvent(String eventName);
	
	
	public boolean addHall(String hallName);
	// Add new hall to the system;

	public String editHall(String hallName);
	// Edit hall, for a example quantity of seats, hall type and etc.;

	public String deleteHall(String hallName);
	
	

	public int setPricesOfSeats(String event, String seats, int price);
	
	// Set a prices of seats of a specific event;

}
