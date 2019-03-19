package application.model;

import java.time.LocalDate;

public class Guest implements I_Guest {

	@Override
	public void identificationIP() {
		// TODO Auto-generated method stub
	}

	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
	}

	@Override
	public void searchEvents(String eventName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectionEvent(int eventID) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfFutureEvent() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByHall(String hallName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByDate(LocalDate eventDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByDateRange(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventByType(String eventType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventByHallAndDate(LocalDate eventDate, String hallName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByHallAndDateRange(LocalDate startDate, LocalDate endDate, String hallType) {
		// TODO Auto-generated method stub
	}

	@Override
	public void showDates(LocalDate date) {
		// TODO Auto-generated method stub
	}
}
