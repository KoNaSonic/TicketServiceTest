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

}
