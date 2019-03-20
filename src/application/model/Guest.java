package application.model;

import java.time.LocalDate;

public interface Guest {

	void identificationIP();
	/*
	 * Determined the IP-address of the user
	 */

//	void showEvents();
//	/*
//	 * Method show all events
//	 */

	void searchEvents(String eventName);
	/*
	 * Event search method on request
	 */

	void getHallScheme(String hallName);
	/*
	      Method show  a scheme by requested hall
	      (Tables in DB : Events-Halls-hallName-hallId).
	 */
	
	void getListOfFutureEvent();
	/*
	 * Method show list of all future events (Table in DB - Events). 
	 * The list must be sorted by date in ascending order.
	 */

	void getListOfEventsByType(String eventType);
	/*
	 * Method show list of events by type (Table in DB - Events - eventType).
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

	
	void getListOfEventsByHall(String hallName);
	/*
		Method show a list of events with a filter on the hall
		(Tables in DB : Halls-hallName-hallId - Events).
	 */

	void getListOfEventsByHallAndDate(LocalDate eventDate, String hallName);
	/*
	 * Method show a list of events by date and hall (Tables in DB -
	 * Halls-hallName-hallId - Events eventDate).
	 */
	
	void getListOfEventsByHallAndDateRange(LocalDate startDate, LocalDate endDate, String hallType);
	/*
	 * Method show a scheme by requested hall (Tables in DB : Events-Halls-hallName-hallId).
	 */
	
	
	void getListOfEventsByPriceRangeInAsceptingOrder(double priceFrom, double priceTo);
	/*
		 Method show list of events in the price in ascending order.
		 (Tables in DB - Price - price - eventId - Events ).
	 */
	
	void getListOfEventsByPriceRangeInDescendingOrder(double priceFrom, double priceTo);
	/*
		 Method show list of events in the price in ascending order.
		 (Tables in DB - Price - price - eventId - Events ).
	 */
	
	void getListOfEventsInDateRangeByPriceInAsceptingOrder(LocalDate startDate,LocalDate endDate);
	/*
		 Method show list of events in the date range by price of events in ascending order.
		(Tables in DB - Events - eventDate - eventId - Price).
	 */
	
	void getListOfEventsInDateRangeByPriceInDescendingOrder(LocalDate startDate, LocalDate endDate);
	/*
	     Method show list of events in the date range by price of events in descending  order.
		(Tables in DB - Events - eventDate -  eventId - Price).
		*/
	
	
	
	
}
