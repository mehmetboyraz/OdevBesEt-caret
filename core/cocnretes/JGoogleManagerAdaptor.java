package odevBes.core.cocnretes;

import odevBes.JGoogle.Sing�nGoogle;
import odevBes.core.abstracts.JGoogleServ�ce;

public class JGoogleManagerAdaptor implements JGoogleServ�ce {

	@Override
	public void add(String string) {
		Sing�nGoogle googleSingin = new Sing�nGoogle();
		googleSingin.googleAdd(string);
		
	
		
		
	}

}
