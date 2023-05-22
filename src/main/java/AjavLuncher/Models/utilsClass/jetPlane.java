package main.java.AjavLuncher.Models.utilsClass;

import main.java.AjavLuncher.Models.Aircraft;

public class jetPlane extends Aircraft {
	
	 public jetPlane(long p_id, String p_name, Coordinates p_coordinates) {
	        super(p_id, p_name, p_coordinates);
	        this.setType("jetPlane");
	    }

	    @Override
	    public void updateConditions() {
	    	this.update();
	    }
}