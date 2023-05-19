package main.java.AjavLuncher.Models.utilsClass;

import main.java.AjavLuncher.Models.Aircraft;

public class Baloon extends Aircraft {
	
	 public Baloon(long p_id, String p_name, Coordinates p_coordinates) {
	        super(p_id, p_name, p_coordinates);
	    }

	    @Override
	    public void updateConditions() {
	        // Implémentation spécifique de la mise à jour des conditions pour un ballon
	    	System.out.println("coucou from updateConditions in baloon");
	    }

}
