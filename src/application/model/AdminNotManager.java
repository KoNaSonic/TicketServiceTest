package application.model;

import application.entity.EventEntity;
import application.entity.HallEntity;
import application.entity.TicketEntity;

import java.util.Date;
import java.util.List;

public interface AdminNotManager {

    public boolean addUser(String email, String password);
    // Manually add user to the system. For a example account of a new manager or cashier;

    public User addRole(String userEmail, Enum role); // userEmail it's a primary key, list of a roles contained in a class Enum;
    // Add role to the User;

    public Enum editRole(Enum role);
    // Edit existing role for the specific functionality; It is need to find out how to fix accesses of roles with a help of methods
    // not security.

    public boolean deleteRole();
    public boolean deleteUser();

    public String getPassword(String userEmail);
    //Get password of specific account if user don't success restore an account;

    public String [] getUser (Enum role);

    public boolean addHole(String hallName, String hallType, int seatsTotal, String layout);
    //Add new hall to the system;

    public HallEntity editHall(int hallId, int seatId);
    // Edit hall, for a example quantity of seats, hall type and etc.;

    public HallEntity deleteHall(int hallId);

    public TicketEntity soldTicketsByDate(Date date);
    // Show sold tickets by specific day;

    public TicketEntity soldTicketsByHall(int hallId);
    // Show sold tickets by specific day;

    public Integer sumOfPaymentsByHall(int hallId);
    // Show sum of sold tickets by Hall;

    public Integer sumOfPaymentsByDate(Date date);
    // Show sum of sold tickets by Date;

    public Integer sumOfPaymentsByUser(String iserEmail);
    // Show sum of sold tickets by User;

    public List<EventEntity> eventsByMonth(Date date);
    // Show all of events by month;

    public String addNews(String news);
    // Add news to the site;

}


