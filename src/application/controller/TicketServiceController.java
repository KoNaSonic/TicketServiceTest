package application.controller;

import application.service.*;
import org.springframework.beans.factory.annotation.Autowired;



public class TicketServiceController {

	@Autowired
	Admin modelAdmin;

	@Autowired
	Cashier modelCashier;

	@Autowired
	Guest modelGuest;

	@Autowired
	Manager modelManager;

	@Autowired
	User modelUser;

}
