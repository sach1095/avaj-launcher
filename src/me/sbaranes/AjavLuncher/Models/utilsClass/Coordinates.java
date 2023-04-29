package me.sbaranes.AjavLuncher.Models.utilsClass;

public class Coordinates {
	int longitude;
	int latitude;
	int height;

	Coordinates(int longitude, int latitude, int height){
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}

	int getLongitude() { return this.longitude; }
	int getLatitude() { return this.latitude; }
	int getheigt() { return this.height; }
}
