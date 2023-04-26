package models;

public class AircreftFactory {
	Flyable flyable;

	AircreftFactory(String flyable, String p_name, Coordinates p_coordinates) {
		this.flyable = new Flyable();
	}
}
