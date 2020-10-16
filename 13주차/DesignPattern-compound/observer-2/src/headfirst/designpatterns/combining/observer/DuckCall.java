package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class DuckCall extends Observable implements Quackable {
	//Observable observable;

	public DuckCall() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Kwak");
		setChanged();
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

 
	public String toString() {
		return "Duck Call";
	}
}
