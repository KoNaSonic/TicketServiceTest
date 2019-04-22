package application.model;

import java.util.List;
import org.springframework.stereotype.Service;
import application.entity.Event;
import application.entity.Seat;
import application.entity.Ticket;

@Service
public class Admin extends Manager implements I_Admin {

	@Override
	public boolean addUser(String userEmail, List<Ticket> tickets, String userPass, String userRole, String userPhone) {
		return false;
	}

	@Override
	public boolean addRole(String role) {
		return false;
	}

	@Override
	public I_User givingRole(String role) {
		return null;
	}

	@Override
	public String editRole(String role) {
		return null;
	}

	@Override
	public boolean deleteRole() {
		return false;
	}

	@Override
	public boolean deleteUser() {
		return false;
	}

	@Override
	public String getPassword(User user) {
		return null;
	}

	@Override
	public String[] getRoles(User user) {
		return null;
	}

	@Override
	public String[] getUser(String role) {
		return null;
	}

	@Override
	public boolean addHole(Long hallId, List<Event> event, List<Seat> seat, String hallName, String hallType,
			Integer seatsTotal, String layout) {
		return false;
	}

	@Override
	public String editHall(String hall) {
		return null;
	}

	@Override
	public String deleteHall(String hall) {
		return null;
	}

}
