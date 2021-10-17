package odevBes;

import odevBes.Busýness.concretes.UsersManager;
import odevBes.DataBase.cocnretes.HibernetUsersDao;
import odevBes.core.cocnretes.JGoogleManagerAdaptor;
import odevBes.entity.concretes.Users;

public class Main {

	public static void main(String[] args) {
		Users user1 = new Users(1, "Mehmet", "Boyraz", "mehmet58", "mehmet_boyraz58@hotmail.com");
		Users user2 = new Users(2, "Berk", "Canbaz", "123456berk", "berkt_boyraz58@hotmail.com");
		UsersManager userManager = new UsersManager(new HibernetUsersDao(),
				new JGoogleManagerAdaptor());
		userManager.mailAdd(user1);
		userManager.mailAdd(user2);
		userManager.googleAdd();
	}

}
