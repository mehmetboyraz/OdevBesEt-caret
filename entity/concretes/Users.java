package odevBes.entity.concretes;

public class Users {
	int Id;
	String Name;
	String LastName;
	String Password;
	String EmailAdress;
	
	public Users(int id, String name, String lastName, String password, String emailAdress) {
		super();
		Id = id;
		Name = name;
		LastName = lastName;
		Password = password;
		EmailAdress = emailAdress;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmailAdress() {
		return EmailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		EmailAdress = emailAdress;
	}
	
	

}
