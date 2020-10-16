package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class GooseAdapter extends Observable implements Quackable {
	Goose goose;
	//Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		//observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
		setChanged();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
