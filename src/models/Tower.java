package models;

import java.util.ArrayList;
import java.util.List;

public class Tower {
	protected List<Flyable> observers;

    public Tower() {
        this.observers = new ArrayList<>();
    }

    public void register(Flyable flyable) {
        if (this.observers.contains(flyable))
            throw new RuntimeException("This aircraft is already registered.");

            observers.add(flyable);
            // flyable.registerTower();

            System.out.println("Tower says: " + aircraft.getType() + "#" + aircraft.getName() + "(" + aircraft.getId() +
                    ") registered to weather tower.");
        }
    }

    public void unregister(Flyable flyable) {
        if (!this.observers.contains(flyable))
            throw new RuntimeException("This aircraft is not registered.");

			observers.remove(flyable);

            System.out.println("Tower says: " + aircraft.getType() + "#" + aircraft.getName() + "(" + aircraft.getId() +
                    ") unregistered from weather tower.");
        }
    }
}
