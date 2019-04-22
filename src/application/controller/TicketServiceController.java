package application.controller;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import application.entity.Event;
import application.entity.Hall;
import application.entity.Seat;
import application.entity.Ticket;
import application.entity.User;
import application.repository.EventRepo;
import application.repository.HallRepo;
import application.repository.PriceRepo;
import application.repository.TicketRepo;
import application.repository.UserRepo;

@Service
public class TicketServiceController {

	@Autowired
	EventRepo repoEvent;

	@Autowired
	HallRepo repoHall;

	@Autowired
	PriceRepo repoPrice;

	@Autowired
	TicketRepo repoTicket;

	@Autowired
	UserRepo repoUser;

	// *********************************************************************************************************************
	/* Realization interface ADMIN */
	/* BEGIN */
	// *********************************************************************************************************************

	public boolean addUser(String userEmail, List<Ticket> tickets, String userPass, String userRole, String userPhone) {
		if (repoUser.existsById(userEmail))
			return false;
		repoUser.save(new User(userEmail, tickets, userPass, userRole, userPhone));
		return true;
	}

	public boolean addRole(String role) { // It won't be work because our class of roles is Enum!!!
		return false;
	}

	public boolean givingRole(String email, String userRole /* UserRole? */) {
		if (!repoUser.existsById(email))
			return false;
		User user = repoUser.findById(email).get();
		user.setUserRole(userRole);
		repoUser.save(user);
		return true;
	}

	public String editRole(String role) { // It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteRole() { // It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(String email) {
		if (!repoUser.existsById(email))
			return false;
		repoUser.deleteById(email);
		return true;
	}

	public String getPassword(String email) {
		if (!repoUser.existsById(email))
			return "Customer with this email does not exist";
		User user = repoUser.findById(email).get();
		String password = user.getUserPass();
		return password;
	}

	public String[] getRoles(User user) {// It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersByRole(String role, String email) {
		ArrayList<User> users = (ArrayList<User>) repoUser.findAll();
		List<User> banda = null;
		for (User user : users) {
			if (user.getUserRole() == role) {
				banda.add(user);
			}
		}
		return banda;
	}

	public boolean addHole(Long hallId, List<Event> event, List<Seat> seat, String hallName, String hallType,
			Integer seatsTotal, String layout) {

		/*
		 * We need to think about what is hall id String name or Long number.
		 */

		if (repoHall.existsById(hallId))
			return false;
		repoHall.save(new Hall(hallId, event, seat, hallName, hallType, seatsTotal, layout));
		return true;
	}

	public boolean editHall(Long hallId, String hallName, String hallType, Integer seatsTotal, String layout) {

		/*
		 * What function will be returned. I think we need to do each edit separately
		 * (hallName, seats total, layout);
		 */
		return false;
	}

	public String deleteHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}

	// *********************************************************************************************************************
	/* Realization interface ADMIN */
	/* END */
	// *********************************************************************************************************************

}
