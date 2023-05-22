package main.java.AjavLuncher.Models.utilsClass;

public class Coordinates {
	int longitude;
	int latitude;
	int height;

	public Coordinates(int longitude, int latitude, int height){
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}
	
	public Coordinates updateCoordinates(int longitude, int latitude, int height) {
        this.longitude += longitude;
        this.latitude += latitude;
        this.height += height;

        return this;
    }

	public int getLongitude() { return this.longitude; }
	public int getLatitude() { return this.latitude; }
	public int getHeigt() { return this.height; }
	public void setHeigt(int value) { this.height = value; }
}
