package main.java.AjavLuncher.Models;

import main.java.AjavLuncher.Models.utilsClass.Baloon;
import main.java.AjavLuncher.Models.utilsClass.Coordinates;
import main.java.AjavLuncher.Models.utilsClass.Helicopter;
import main.java.AjavLuncher.Models.utilsClass.jetPlane;

public class AircraftFactory {
	
	protected static int id = 0;
	
	private static AircraftFactory instance;

    private AircraftFactory() { }

    public static AircraftFactory getInstance() {
        if (instance == null) {
            instance = new AircraftFactory();
        }
        return instance;
    }
	
	public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates){
		id++;
		if (p_type.toLowerCase().equals("helicopter")) {
			System.out.println(p_type + " " + p_name + " has been created.");
			return new Helicopter(id, p_name, p_coordinates);
		}
		else if (p_type.toLowerCase().equals("jetplane")) {
			System.out.println(p_type + " " + p_name + "  has been created.");
			return new jetPlane(id, p_name, p_coordinates);
		}
		else if (p_type.toLowerCase().equals("baloon") ) {
			System.out.println(p_type + " " + p_name + "  has been created.");
			return new Baloon(id,p_name, p_coordinates);
		}
		return null;
	}
}
