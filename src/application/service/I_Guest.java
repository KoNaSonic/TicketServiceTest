package application.service;

import java.time.LocalDate;

public interface I_Guest {

	void identificationIP();
	/*
	 * Determined the IP-address of the user
	 */

	void showDates(LocalDate date);
	/*
	 * Show events by date.
	 */

	void showEvents();
	/*
	 * Method show all events
	 */

	void searchEvents(String eventName);
	/*
	 * Event search method on request
	 */

	void selectionEvent(int eventID);
	/*
	 * Show events by id
	 */

	void getListOfFutureEvent();
	/*
	 * Method show list of all future events (Table in DB - Events). The list must
	 * be sorted by date in ascending order.
	 */

	void getListOfEventsByDate(LocalDate eventDate);
	/*
	 * Method show a list of events by date (Table in DB - Events - eventDate).
	 */

	void getListOfEventsByDateRange(LocalDate startDate, LocalDate endDate);
	/*
	 * Method show list of events in the date range (Table in DB - Events -
	 * eventDate).
	 */

	void getListOfEventByType(/* EventType */String eventType);
	/*
	 * Method show list of events by type (Table in DB - Events - eventType).
	 */

	void getListOfEventByHallAndDate(LocalDate eventDate, String hallName);
	/*
	 * Method show a list of events by date and hall (Tables in DB -
	 * Halls-hallName-hallId - Events eventDate).
	 */

	void getListOfEventsByHall(String hallName);
	/*
	 * Show Events by hall
	 */

	void getListOfEventsByHallAndDateRange(LocalDate startDate, LocalDate endDate, String hallType);
	/*
	 * Method show a scheme by requested hall (Tables in DB : Events-Halls-hallName-hallId).
	 */
}
