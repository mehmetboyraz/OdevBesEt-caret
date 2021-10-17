package odevBes.Bus�ness.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odevBes.Bus�ness.abstracts.UsersService;
import odevBes.DataBase.abstracts.UsersDao;
import odevBes.core.abstracts.JGoogleServ�ce;
import odevBes.entity.concretes.Users;

public class UsersManager implements UsersService {
	private JGoogleServ�ce jgoogleService;
	private UsersDao userDao;

	public UsersManager(UsersDao userDao, JGoogleServ�ce jgoogleService) {
		super();
		this.userDao = userDao;
		this.jgoogleService=jgoogleService;
	}

	@Override
	public boolean checkMail(Users user) {
		
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(user.getEmailAdress());
	    
	    	if(matcher.matches()==true ) {
	    	
	    	}else {
	    		
	    		System.out.println("Ge�erli bir  mail adresi giriniz.");
	    	}
	    	return matcher.matches();
	}

	@Override
	public boolean checkPassword(Users user) {
		String regex ="[0-9a-zA-Z]{6,}";;
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(user.getPassword());
		if(matcher.matches()==true) {
				    	}else {
	    		System.out.println("6 haneden olu�an bir �ifre giriniz.");
	    	}
		return matcher.matches();
		
		
	}

	@Override
	public boolean checkName(Users user) {
		String regex ="[0-9a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(user.getName());
		if(matcher.matches()==true) {	
	    	}else {
	    		System.out.println("Ad�n� en az iki karakterden olu�mal�d�r.");
	    	}
		
		return matcher.matches();
		
	}

	@Override
	public boolean checkLastName(Users user) {
		String regex ="[0-9a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(user.getLastName());
		if(matcher.matches()==true) {
	    	}else {
	    		System.out.println("Soy ad�n� en az iki karakterden olu�mal�d�r.");
	    	}
		return matcher.matches();
		
		
	}

	@Override
	public void mailAdd(Users user){
	
	if((checkMail(user)== true) && (checkPassword(user)==true)&& 
			(checkLastName(user)==true) && (checkName(user)==true)) {
		userDao.add(user);
	}else {
		System.out.println("Bilgileriniz eksik veya ge�ersizdir.");
	};
	
	}

	@Override
	public void delete(Users user) {
		if((checkMail(user)== true) && (checkPassword(user)==true)
				&& (checkLastName(user)==true) && (checkName(user)==true)) {
			userDao.delete(user);
		}else {
			System.out.println("Bilgileriniz eksik veya ge�ersizdir.");
		}
		
	}

	@Override
	public void update(Users user) {
		if((checkMail(user)== true) && (checkPassword(user)==true)
				&& (checkLastName(user)==true) && (checkName(user)==true)) {
			userDao.update(user);
		}else {
			System.out.println("Bilgileriniz eksik veya ge�ersizdir.");
		}
		
	}

	@Override
	public List<Users> getAll() {
		
		return null;
	}

	@Override
	public void googleAdd() {
		jgoogleService.add("Google ile �ye olundu");
		
	}


	

}
