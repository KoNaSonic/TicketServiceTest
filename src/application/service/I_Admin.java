package application.service;

import application.entity.UserRole;

public interface I_Admin {

	public boolean addUser(String email);
	// Manually add user to the system. For a example account of a new manager or
	// cashier;

	public boolean addRole(String role);
	// Add new role to the system;

	public boolean givingRole(/* Role */ String role,String userRole /* UserRole */);
	// Assignment role to User;

	public /* Role */ String editRole(/* Role */String role);
	// Edit existing role for the specific functionality; It is need to find out how
	// to fix accesses of roles with a help of methods
	// not security.

	public boolean deleteRole();

	public boolean deleteUser(String email);

	public String getPassword(String email);
	// Get password of specific account if user don't success restore an account;

	public String[] getRoles(I_User user);
	// Get array of all roles in a system;

	public User[] getUser(/* Role */String role);

	public boolean addHole(String nameHall);
	// Add new hall to the system;

	public /* Hall */String editHall(/* Hall */String hall);
	// Edit hall, for a example quantity of seats, hall type and etc.;

	public /* Hall */String deleteHall(/* Hall */String hall);

}
