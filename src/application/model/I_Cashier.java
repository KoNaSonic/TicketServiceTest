package application.model;

import java.time.LocalDate;

public interface I_Cashier {

	public String[] getActiveEvents();
	// getting all active events, no sorting, JSON[]

	public String[] getActiveEventsByCat(int idCat);
	// select active events in selected category, JSON[]

	public String[] getActiveEventsByHall(int idHall);
	// select active events in selected hall, JSON[]

	public String[] getActiveEventsByDate(LocalDate date);
	// select active events by date, JSON[]

	public String getEventById(int id);
	// get single event by id, JSON[]

	public String getTicketById(int idTicket);
	// getting ticket by id, JSON

	public String getTicketByNumber(int ticketNumber);
	// getting ticket by number, JSON

	public boolean changeTicketState(int state);
	// returns boolean: successful / error

	public void printTicket(int userId); 
	// print ticket owned by the user

}
