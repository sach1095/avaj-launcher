package main.java.AjavLuncher.Models.utilsClass;

public class WeatherProvider {

	private static WeatherProvider WProvider;

	public static String[] weather = {"It's raining. Better watch out for lightings.", "My rotor is going to freeze!", "This is hot.", " It's snowing. We're gonna crash."};
	public static String[] weatherType = { "RAIN", "FOG", "SUN", "SNOW"};
	
	private WeatherProvider() {}

	public static WeatherProvider getProvider() {
		if (WProvider == null)
			WProvider = new WeatherProvider();
        return WProvider;
    }

	public String getCurrentWaether(Coordinates p_coordinates){
		int randomIndex = (int) (Math.random() * (p_coordinates.getLongitude() + p_coordinates.getLatitude() + p_coordinates.getHeigt()));
		randomIndex %=  weatherType.length;
		String result = WeatherProvider.weatherType[randomIndex];
		return result;
	}
	
	public String getCurrentWaetherEffectByType(String weatherType) {
		int index = getIndex(weatherType);
		
		if (index == -1) 
			throw new Error("L'index de l'élément \"" + weatherType + "\" est : " + index);
		else
		return weather[index];
	}
	
	public static int getIndex(String toFind) {
        for (int i = 0; i < weatherType.length; i++) {
            if (weatherType[i].equals(toFind)) {
                return i;
            }
        }
        return -1;
    }
}
