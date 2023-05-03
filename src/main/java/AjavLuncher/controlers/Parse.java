package main.java.AjavLuncher.controlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parse {

	 public static void validateLines(String line) {
	 	String[] arguments = line.split(" ");
	 	if (arguments.length == 5)
	 		parseAircraft(arguments);
	 	else
	 		throw new Error("Line have bad number of Arguments");
	 }

	 private static void parseAircraft(String[] arguments) {
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
	 	createObject(type, name, longitude, latitude, height);
	 }

	 private static void createObject(String type, String name, int longitude, int latitude, int height) {
	 	if (type == "" || name == "" || longitude <= 0 || latitude <= 0 || height <= 0)
	 		throw new Error("Bad value arguments.");
	 	System.out.println(" type : " + type + " | name = " + name + " | longitude = " + longitude + " | latitude = "
	 			+ latitude + " | height = " + height);
	 }

	
	public static List<String> readFile(String fileInput) {
		List<String> lines = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(fileInput))) {
			while (scanner.hasNext()) {
				lines.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			throw new Error("Files not found.");
		}
		return lines;
	}

	public static void printBuffer(List<String> lines) {
		System.out.println("Contenu du fichier: ");
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
