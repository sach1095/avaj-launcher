package main.java.AjavLuncher.controlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parse {

	public static List<String> readFile(String fileInput) {
		List<String> lines = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(fileInput))) {
			while (scanner.hasNext()) {
				lines.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			throw new Error("Files not found.");
		}
		
		var nbtours = Integer.parseInt(lines.get(0));
		
		if (nbtours <= 0)
			throw new Error("Bad number of tours");
		
		for (int i = 1; i < lines.size(); i++) validateLines(lines.get(i));
		
		return lines;
	}

	public static void printBuffer(List<String> lines) {
		System.out.println("Contenu du fichier: ");
		for (String line : lines) {
			System.out.println(line);
		}
	}
	

	public static void validateLines(String line) {
	 	String[] arguments = line.split(" ");
	 	if (arguments.length != 5)
	 		throw new Error("Line have bad number of Arguments");	 		
	 }
}
