package application.service;

import application.entity.Hall;
import application.entity.User;
import application.repository.HallRepo;
import application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Admin extends Manager implements I_Admin {

	@Autowired
	UserRepo userRepo;

	@Autowired
	HallRepo hallRepo;

	@Override
	public boolean addUser(String email,String password,String role,String phone) {// Do we need to add all fields of a new User?
		if(userRepo.existsById(email))return false;
		userRepo.save(new User(email,password,role,phone));
		return true;
	}

	@Override
	public boolean addRole(String role) { //It won't be work because our class of roles is Enum!!!
		return false;
	}

	@Override
	public boolean givingRole(String email, String userRole /* UserRole? */) {
		if(!userRepo.existsById(email))return false;
		User user = userRepo.findById(email).get();
		user.setUserRole(userRole);
		userRepo.save(user);
		return true;
	}

	@Override
	public String editRole(String role) { //It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRole() { //It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String email) {
		if(!userRepo.existsById(email))return false;
		userRepo.deleteById(email);
		return true;
	}

	@Override
	public String getPassword(String email) {
		if(!userRepo.existsById(email))return "Customer with this email does not exist";
		User user = userRepo.findById(email).get();
		String password = user.getUserPass();
		return password;
	}

	@Override
	public String[] getRoles(I_User user) {//It won't be work because our class of roles is Enum!!!
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByRole(String role, String email) {
		ArrayList<User> users = (ArrayList<User>) userRepo.findAll();
		List<User> banda = null;
		for(User user: users){
			if(user.getUserRole()==role){
				banda.add(user);
			}
		}
		return banda;
	}

	@Override
	public boolean addHole(Long hallId,String hallName,String hallType,Integer seatsTotal,
	                       String layout) {//We need to think about what is hall id - String name or Long number.
		if(hallRepo.existsById(hallId))return false;
		hallRepo.save(new Hall(hallId,hallName,hallType,seatsTotal,layout));
		return true;
	}

	@Override
	public boolean editHall(Long hallId, String hallName,String hallType,Integer seatsTotal,
	                       String layout) { //What function will be returned? I think we need to do each edit
		// separately (hallName, seats total, layout);

		return false;
	}

	@Override
	public String deleteHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
