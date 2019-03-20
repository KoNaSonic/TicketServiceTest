package application.controller;

import org.springframework.beans.factory.annotation.Autowired;

import application.model.Admin;
import application.model.Cashier;
import application.model.Guest;
import application.model.Manager;
import application.model.User;

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
