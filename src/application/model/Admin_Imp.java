package application.model;

public class Admin_Imp extends Manager implements Admin {

	@Override
	public boolean addUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRole(I_User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public I_User givingRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRole() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPassword(I_User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getRoles(I_User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getUser(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addHole(String nameHall) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String editHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

