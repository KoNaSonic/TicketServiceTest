package application.controller;

import org.springframework.beans.factory.annotation.Autowired;

import application.model.Admin;
import application.model.Cashier;
import application.model.Guest;
import application.model.Manager;
import application.model.User;
import application.repository.EventRepo;
import application.repository.HallRepo;
import application.repository.PriceRepo;
import application.repository.TicketRepo;
import application.repository.UserRepo;

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

}
