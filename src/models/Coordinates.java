package models;

public class Coordinates{
	int longitude;
	int latitude;
	int height;

	Coordinates(int longitude, int latitude, int height){
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

    public int getLongitude() {
        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public int getHeight() {
        return this.height;
    }
}
