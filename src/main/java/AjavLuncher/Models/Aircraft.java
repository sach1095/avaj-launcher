package main.java.AjavLuncher.Models;

import main.java.AjavLuncher.Models.utilsClass.Coordinates;
import main.java.AjavLuncher.Models.utilsClass.WeatherTower;

public class Aircraft extends Flyable{

	private long id;
    private String name;
    private Coordinates coordinates;

    public Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
        id = p_id;
        name = p_name;
        coordinates = p_coordinates;
    }
  
	@Override
	public void updateConditions() {
		// TODO Auto-generated method stub
		System.out.println("in updateCondition: id = " + id + ", name = " + name + ", coordonates = " + coordinates);
		
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		// TODO Auto-generated method stub
		
		System.out.println("in registerTower: id = " + id + ", name = " + name + ", coordonates = " + coordinates);

	}

}
