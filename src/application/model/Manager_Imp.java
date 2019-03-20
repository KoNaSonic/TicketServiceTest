package application.model;

import java.time.LocalDate;

public class Manager_Imp {

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

	void logOut();
	/*
	 * Sign out in system
	 */

	void getListOfEventsByHall(String hallName);
	/*
	 * Method show a list of events with a filter on the hall (Tables in DB :
	 * Halls-hallName-hallId - Events).
	 */

	void getHallScheme(String hallName);
	/*
	 * view of the hall map
	 */

	void getListOfEventsInDateRangeByPriceInAsceptingOrder(LocalDate startDate, LocalDate endDate);
	/*
	 * Method show list of events in the date range by price of events in ascending
	 * order. (Tables in DB - Events - eventDate - eventId - Price).
	 */

	void getListOfEventsInDateRangeByPriceInDescendingOrder(LocalDate endDate, LocalDate startDate);
	/*
	 * Method show list of events in the date range by price of events in descending
	 * order. (Tables in DB - Events - eventDate - eventId - Price).
	 */

	void getListOfEventsByPriceRangeInAsceptingOrder(double priceFrom, double priceTo);
	/*
	 * Method show list of events in the price in ascending order. (Tables in DB -
	 * Price - price - eventId - Events ).
	 */

	void getListOfEventsByHallAndDateRange(LocalDate startDate, LocalDate endDate, String hallType);
	/*
	 * Method show a list of events by in the date range and hall type Tables in DB
	 * - Halls-hallName-hallId - Events eventDate).
	 */
}
