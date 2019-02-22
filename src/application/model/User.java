package application.model;

import java.time.LocalDate;

public interface User{
	
	void checkingPassword(String userEmail, String UserPass);
	/*
	 * Using regular expressions, we check the validity of mail and password (both
	 * lines must be in English, the mail must contain a symbol "@" and a dot in the
	 * expression.)
	 */

	void forgenPassword();
	/*
	 * If you forgot your password. Identification via SMS on the phone. It is
	 * necessary to connect the SMS gateway site
	 */

	void showEvents();
	/*
	 * Method show all events
	 */

	void searchEvents(String eventName);
	/*
	 * Event search method on request
	 */

	void showDates(LocalDate date);
	/*
	 * Show events by date.
	 */
	
	void selectionEvent(int eventID);
	/*
	 * Show events by id
	 */
	
	void logOut();
	/*
	 * Sign out
	 */
	
	
	void getListOfFutureEvent();
	/*
	Method show list of all future events (Table in DB - Events).
	The list must be sorted by date in ascending order.
	*/

	void getListOfEventsByHall(String hallName);
	/*
	Method show a list of events with a filter on the hall
	(Tables in DB : Halls-hallName-hallId - Events).
	 */
	
	void getListOfEventsByDate(LocalDate eventDate);
	/*
	 Method show a list of events by date (Table in DB - Events - eventDate).
	 */
			
	void getListOfEventByType(EventType eventType);
	/*
	    Method show list of events by type (Table in DB - Events - eventType).
	 */
	
	void  getListOfEventsByDateRange(LocalDate startDate, LocalDate endDate);
	/*
	  Method show list of events in the date range (Table in DB - Events - eventDate).
	 */
	
	void getListOfEventByHallAndDate(LocalDate eventDate, String hallName);
	/*
		Method show a list of events by date and hall
		(Tables in DB - Halls-hallName-hallId - Events eventDate).
	 */
	
	void getListOfEventsByHallAndDateRange(LocalDate startDate, LocalDate endDate,
										   String hallType);
	/*
		Method show a list of events by in the date range and hall type
		Tables in DB - Halls-hallName-hallId - Events eventDate).
	 */
	
	void getHallScheme(String hallName);
	/*
	      Method show  a scheme by requested hall
	      (Tables in DB : Events-Halls-hallName-hallId).
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
	
	void getListOfEventsByPriceRangeInAsceptingOrder(double priceFrom, double priceTo);
	/*
		 Method show list of events in the price in ascending order.
		 (Tables in DB - Price - price - eventId - Events ).
	 */

}
