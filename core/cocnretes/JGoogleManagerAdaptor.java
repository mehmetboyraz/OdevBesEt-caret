package odevBes.core.cocnretes;

import odevBes.JGoogle.SingÝnGoogle;
import odevBes.core.abstracts.JGoogleServýce;

public class JGoogleManagerAdaptor implements JGoogleServýce {

	@Override
	public void add(String string) {
		SingÝnGoogle googleSingin = new SingÝnGoogle();
		googleSingin.googleAdd(string);
		
	
		
		
	}

}
