package RechnikAngMK;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
	    Map<String, String> rechnik = new HashMap<String, String>();

	    public void vnesiMapa() {
	        rechnik.put("Mother", "Majka");
	        rechnik.put("Father", "Tatko");
	        rechnik.put("Brother", "Brat");
	        rechnik.put("Sister", "Sestra");
	    }

	    public void translate (String s) {
	        if (rechnik.containsKey(s))
	        {
	            System.out.println(rechnik.get(s));
	        }
	        else
	            System.out.println("Ne postoi takov zbor vo rechnikot.");
	    }
	}
	
