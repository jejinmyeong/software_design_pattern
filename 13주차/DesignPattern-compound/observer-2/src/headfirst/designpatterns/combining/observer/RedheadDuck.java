package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class RedheadDuck extends Observable implements Quackable {
	//Observable observable;

	public RedheadDuck() {
		//observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
		setChanged();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

	public String toString() {
		return "Redhead Duck";
	}
}
