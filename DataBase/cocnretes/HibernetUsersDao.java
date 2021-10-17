package odevBes.DataBase.cocnretes;

import odevBes.DataBase.abstracts.UsersDao;
import odevBes.entity.concretes.Users;

public class HibernetUsersDao implements UsersDao {

	@Override
	public void add(Users user) {
		System.out.println("Kullanıcı bilgileriniz dataya kaydedildi:" + user.getName() );
		
	}

	@Override
	public void delete(Users user) {
		System.out.println("Kullanıcı bilgileriniz datadan silindi" + user.getName());
		
	}

	@Override
	public void update(Users user) {
		System.out.println("Kullanıcı bilgileriniz datada güncellendi"+ user.getName());
		
	}

		
	}



