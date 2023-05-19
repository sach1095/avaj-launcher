package main.java.AjavLuncher.Models;

import main.java.AjavLuncher.Models.utilsClass.WeatherTower;

public abstract class Flyable {
	
	public abstract void updateConditions();
	public abstract void registerTower(WeatherTower weatherTower);
}
