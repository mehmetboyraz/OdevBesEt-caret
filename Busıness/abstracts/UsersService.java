package odevBes.Busýness.abstracts;

import java.util.List;

import odevBes.entity.concretes.Users;

public interface UsersService {
	boolean checkMail(Users user);
	boolean checkPassword(Users user);
	boolean checkName(Users user);
	boolean checkLastName(Users user);
	void mailAdd(Users user);
	void delete(Users user);
	void update(Users user);
	void googleAdd();
	List <Users> getAll();
	
}
