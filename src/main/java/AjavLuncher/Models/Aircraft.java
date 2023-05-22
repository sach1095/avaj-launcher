package main.java.AjavLuncher.Models;

import main.java.AjavLuncher.Models.utilsClass.Coordinates;
import main.java.AjavLuncher.Models.utilsClass.WeatherProvider;
import main.java.AjavLuncher.Models.utilsClass.WeatherTower;

public class Aircraft extends Flyable{

	private long id;
    private String name;
	private Coordinates coordinates;
	private String type;
	protected WeatherTower tower;

	public Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
        id = p_id;
        name = p_name;
        coordinates = p_coordinates;
    }
  
	@Override
	public void updateConditions() { }

	@Override
	public void registerTower(WeatherTower weatherTower) { this.tower = weatherTower; }
	
	protected void update() {
        String weatherType = WeatherProvider.getProvider().getCurrentWaether(this.coordinates);
        
        UpdateCoordinatesByWeather(weatherType);
    }
	
	private void UpdateCoordinatesByWeather(String weatherType) {
		int longitude = 0;
		int latitude = 0;
		int height = 0;
		
		System.out.println(type + "#" + name + "(" + id + "): " +
				WeatherProvider.getProvider().getCurrentWaetherEffectByType(weatherType) + 
				" [" + weatherType + "]");
		switch (weatherType) {
			case "SUN":
				switch (type) {
				case "jetPlane":
					latitude = 10;
					height = 2;
					break ;
				case "helicopter":
					longitude = 10;
					height = 2;
					break ;
				case "baloon": 
					longitude = 2;
					height = 4;
					break ;
				}
				break ;
			case "RAIN": 
				switch (type) {
				case "jetPlane":
					latitude = 5;
					break ;
				case "helicopter":
					longitude = 5;
					break ;
				case "baloon": 
					height = -5;
					break ;
				}
				break ;
			case "FOG": 
				switch (type) {
				case "jetPlane":
					latitude = 1;
					break ;
				case "helicopter":
					longitude = 1;
					break ;
				case "baloon": 
					height = -3;
					break ;
				}
				break ;
			case "SNOW":
				switch (type) {
				case "jetPlane":
					height = -7;
					break ;
				case "helicopter":
					height = -12;
					break ;
				case "baloon": 
					height = -15;
					break ;
				}
				break ;
		}
		this.coordinates = coordinates.updateCoordinates(longitude, latitude, height);
        if (this.coordinates.getHeigt() > 100)
            coordinates.setHeigt(100);
        else if (this.coordinates.getHeigt() <= 0) {
            System.out.println(type + "#" + this.getName() + "(" + this.getId() + "): landing.");

            tower.unregister((Flyable) this);
        }
	}
	
	public long getId() { return id; }

	public void setId(long id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	public String getType() { return type; }

	public void setType(String type) { this.type = type; }
}
