package odevBes.DataBase.cocnretes;

import odevBes.DataBase.abstracts.UsersDao;
import odevBes.entity.concretes.Users;

public class HibernetUsersDao implements UsersDao {

	@Override
	public void add(Users user) {
		System.out.println("Kullan�c� bilgileriniz dataya kaydedildi:" + user.getName() );
		
	}

	@Override
	public void delete(Users user) {
		System.out.println("Kullan�c� bilgileriniz datadan silindi" + user.getName());
		
	}

	@Override
	public void update(Users user) {
		System.out.println("Kullan�c� bilgileriniz datada g�ncellendi"+ user.getName());
		
	}

		
	}



