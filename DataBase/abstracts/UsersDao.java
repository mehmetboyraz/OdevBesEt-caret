package odevBes.DataBase.abstracts;

import odevBes.entity.concretes.Users;

public interface UsersDao {
	
	void add(Users user);
	void delete(Users user);
	void update(Users user);
	
	
}
