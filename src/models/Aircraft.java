package models;

public class Aircraft{
	long id;
	String name;
	Coordinates coordinates;

	Aircraft(long id, String name, Coordinates coordinates){
		this.id = id;
		this.name = name;
		this.coordinates = coordinates;
	}

	public String getType() {
		return null;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return null;
	}
}
