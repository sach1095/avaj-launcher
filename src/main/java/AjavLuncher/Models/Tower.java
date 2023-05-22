package main.java.AjavLuncher.Models;

import java.util.List;

import main.java.AjavLuncher.Models.utilsClass.WeatherTower;

import java.util.ArrayList;

public class Tower {
	private List<Flyable> observers;

    public Tower() {
        observers = new ArrayList<>();
    }

    public void register(Flyable flyable) {
    	if (this.observers.contains(flyable))
            throw new RuntimeException("This aircraft is already registered.");
        observers.add(flyable);
        flyable.registerTower((WeatherTower) this);
        
        if (flyable instanceof Aircraft aircraft)
        	System.out.println("Tower says: " + aircraft.getType() + "#" + aircraft.getName() + "(" + aircraft.getId() +
                    ") registered to weather tower.");
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
        
        if (flyable instanceof Aircraft aircraft)
        	System.out.println("Tower says: " + aircraft.getType() + "#" + aircraft.getName() + "(" + aircraft.getId() +
                ") unregistered from weather tower.");
    }

    protected void conditionChanged() {
    	 for (int i = 0; i < this.observers.size(); i++) {
             this.observers.get(i).updateConditions();
         }
    }
}
