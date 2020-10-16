package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;
	private ArrayList<Observer> observers; 

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observers = new ArrayList<>();
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for(Observer observer : observers){
			observer.update(this);
		}
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
