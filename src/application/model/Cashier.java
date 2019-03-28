package application.model;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class Cashier extends User implements I_Cashier {

	@Override
	public String[] getActiveEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getActiveEventsByCat(int idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getActiveEventsByHall(int idHall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getActiveEventsByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEventById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTicketById(int idTicket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTicketByNumber(int ticketNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeTicketState(int state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printTicket(int userId) {
		// TODO Auto-generated method stub

	}

}
