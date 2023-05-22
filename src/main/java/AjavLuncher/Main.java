package main.java.AjavLuncher;

import java.util.List;

import main.java.AjavLuncher.controlers.Parse;
import main.java.AjavLuncher.Models.utilsClass.Coordinates;
import main.java.AjavLuncher.Models.utilsClass.WeatherTower;
import main.java.AjavLuncher.Models.AircraftFactory;

public class Main {
	
	public static WeatherTower tower = new WeatherTower();
	

	public static void main(String[] args) throws Error {
		int nbtours = 0;

		if (args.length == 1) {
			List<String> lines = Parse.readFile(args[0]);
			nbtours = Integer.parseInt(lines.get(0));
			for (int i = 1; i < lines.size(); i++) createAircraft(lines.get(i).split(" "));
		} else
			System.out.println("Veuillez ne fournir qu'un argument.");
		
		for (int i = 0; i < nbtours; i++)
			tower.changeWeather();
	}

	 private static void createAircraft(String[] arguments) {
	 	var i = 0;
	 	String type = "";
	 	String name = "";
	 	int longitude = 0;
	 	int latitude = 0;
	 	int height = 0;
	 	for (String argument : arguments) {
	 		switch (i) {
	 			case 0:
	 				type = argument;
	 				break;
	 			case 1:
	 				name = argument;
	 				break;
	 			case 2:
	 				longitude = Integer.parseInt(argument);
	 				break;
	 			case 3:
	 				latitude = Integer.parseInt(argument);
	 				break;
	 			case 4:
	 				height = Integer.parseInt(argument);
	 				break;
	 			default:
	 				break;
	 		}
	 		i++;
	 	}
	 	var Aircraft = AircraftFactory.newAircraft(type, name, new Coordinates(longitude, latitude, height));
	 	if (Aircraft == null)
	 		throw new Error("Bad Aircraft type (" + type + ").");
	 	tower.register(Aircraft);
	 }
}
