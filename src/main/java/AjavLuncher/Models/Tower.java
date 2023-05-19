package main.java.AjavLuncher.Models;

import java.util.List;
import java.util.ArrayList;

public class Tower {
	private List<Flyable> observers;

    public Tower() {
        observers = new ArrayList<>();
    }

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    private void conditionChanged() {
        // Logique de traitement lorsque les conditions changent
    }

}
