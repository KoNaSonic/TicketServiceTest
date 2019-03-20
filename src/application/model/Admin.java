package application.model;

public interface Admin extends Manager{

	public boolean addUser(String email, String password);
	// Manually add user to the system. 
	// For a example account of a new manager or cashier;

	public boolean deleteUser();
	
	
	public String[] getRoles(User user);
	// Get array of all roles in a system;
	
	public String[] getUsersbyRole(String role);
	
	public User assaignRole(String role);
	// Assignment role to User;
	
	public boolean addRole(User user);
	// Add new role to the system;
		
	public String editRole(/* Role */String role);
	// Edit existing role for the specific functionality.
	// It is need to find out how to fix accesses of roles with a help of methods.
	// Not security.
	
	public boolean deleteRole();

	
	public String getPassword(User user);
	// Get password of specific account if user don't success restore an account;

	
	

	

}
