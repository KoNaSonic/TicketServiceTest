package application.model;

import java.time.LocalDate;

public interface User extends Guest{
	
	public void createUser (String userEmail, String UserPass);
	
	// Registration User account
	
	public void logIn(String userEmail, String UserPass);
	/* Sign In.
	 * Using regular expressions, we check the validity of mail and password (both
	 * lines must be in English, the mail must contain a symbol "@" and a dot in the
	 * expression.)
	 */

	public void restorePassword();
	/*
	 * If you forgot your password. Identification via SMS on the phone or by e-mail. It is
	 * necessary to connect the SMS gateway site
	 */
	
	public void editUserAccount();
	
	// Edit user own personal data: password, phone number
		
	public void logOut();
	/*
	 * Sign out
	 */
		

}




