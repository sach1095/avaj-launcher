package main.java.AjavLuncher;

import java.util.List;

import main.java.AjavLuncher.controlers.Parse;

public class Main {

	public static void main(String[] args) throws Error {
		if (args.length == 1) {
			int nbtours = 0;
			List<String> lines = Parse.readFile(args[0]);
			nbtours = Integer.parseInt(lines.get(0));
			if (nbtours <= 0)
				throw new Error("Bad number of tours");
			for (int i = 1; i < lines.size(); i++) Parse.validateLines(lines.get(i));
			Parse.printBuffer(lines);
		} else {
			System.out.println("Veuillez ne fournir qu'un argument.");
		}
		System.out.println("return on main");
	}
}
