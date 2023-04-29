package me.sbaranes.AjavLuncher.controlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parse {

	int nbtours;
	private List<String> lines;

	public Parse(String fileInput) {
		readFile(fileInput);
		this.nbtours = 0;
		parsefile();
	}

	private void parsefile() {
		int countline = 0;
		for (String line : lines) {
			String[] arguments = line.split(" ");
			for (String argument : arguments) {
				if (countline == 0 && arguments.length == 1){
				this.nbtours = Integer.parseInt(argument);
				if (this.nbtours <= 0) throw new Error( "Bad number of tours" );
				} else if (
					countline != 0 && arguments.length == 5
				) parseAircraft(arguments); else throw new Error(
					"Bad number of Arguments"
				);
				break;
			}
			countline++;
		}
	}

	private void parseAircraft(String[] arguments) {
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

	private void createObject( String type, String name, int longitude, int latitude, int height ) {
		if ( type == "" || name == "" || longitude <= 0 || latitude <= 0 || height <= 0 ) throw new Error("Bad value arguments.");
		System.out.println( " type : " + type + " | name = " + name + " | longitude = " + longitude + " | latitude = " + latitude + " | height = " + height );
	}

	private void readFile(String fileInput) {
		try {
			File file = new File(fileInput);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			this.lines = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Error reading");
			e.printStackTrace();
		}
	}

	public void printBuffer() {
		System.out.println("Contenu du fichier: ");
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
