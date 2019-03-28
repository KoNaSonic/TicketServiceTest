package application.service;

import application.entity.User;
import application.entity.UserRole;
import application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Admin extends Manager implements I_Admin {

	@Autowired
	UserRepo userRepo;

	@Override
	public boolean addUser(String email) {
		if(userRepo.existsById(email))return false;
		userRepo.save(new User(email));
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
	public User[] getUser(String role) {

		return User[];
	}

	@Override
	public boolean addHole(String nameHall) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String editHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteHall(String hall) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
