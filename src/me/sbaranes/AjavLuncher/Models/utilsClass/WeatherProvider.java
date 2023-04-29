package me.sbaranes.AjavLuncher.Models.utilsClass;

public class WeatherProvider {
	String[] weather = {"It's raining. Better watch out for lightings.", "My rotor is going to freeze!", "This is hot.", " It's snowing. We're gonna crash."};

	WeatherProvider(){}

	String getCurrentWaether(Coordinates p_coordinates){
		int randomIndex = (int) (Math.random() * this.weather.length);
		String result = this.weather[randomIndex];
		return result;
	}
}
