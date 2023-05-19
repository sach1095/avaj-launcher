package main.java.AjavLuncher.Models.utilsClass;

import main.java.AjavLuncher.Models.Aircraft;

public class Helicopter extends Aircraft {
	
	 public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
	        super(p_id, p_name, p_coordinates);
	    }

	    @Override
	    public void updateConditions() {
	        // Implémentation spécifique de la mise à jour des conditions pour un Helicopter
	    	System.out.println("coucou from updateConditions in Helicopter");
	    }
}