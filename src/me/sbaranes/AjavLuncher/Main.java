package me.sbaranes.AjavLuncher;
import me.sbaranes.AjavLuncher.controlers.Parse;

public class Main {

	public static void main(String[] args) {
		if (args.length == 1) {
			Parse parse = new Parse(args[0]);
			parse.printBuffer();
		} else {
			System.out.println("Veuillez ne fournir qu'un argument.");
		}
		System.out.println("return on main");
	}
}
