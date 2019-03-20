package application.model;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class User extends Guest implements I_User {

	@Override
	public void checkingPassword(String userEmail, String UserPass) {
		// TODO Auto-generated method stub
	}

	@Override
	public void forgenPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showDates(LocalDate date) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsInDateRangeByPriceInAsceptingOrder(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsInDateRangeByPriceInDescendingOrder(LocalDate endDate, LocalDate startDate) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getListOfEventsByPriceRangeInAsceptingOrder(double priceFrom, double priceTo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getHallScheme(String hallName) {
		// TODO Auto-generated method stub
	}

}
