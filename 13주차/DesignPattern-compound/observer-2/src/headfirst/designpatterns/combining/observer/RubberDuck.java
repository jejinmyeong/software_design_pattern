package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class RubberDuck extends Observable implements Quackable {
	//Observable observable;

	public RubberDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		setChanged();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

  
	public String toString() {
		return "Rubber Duck";
	}
}
