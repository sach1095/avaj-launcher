package main.java.AjavLuncher.Models.utilsClass;

import main.java.AjavLuncher.Models.Aircraft;

public class Helicopter extends Aircraft {
	
	 public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
	        super(p_id, p_name, p_coordinates);
	        this.setType("helicopter");
	    }

	    @Override
	    public void updateConditions() {
	    	this.update();
	    }
}