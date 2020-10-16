package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class DecoyDuck extends Observable implements Quackable {
	//Observable observable;
	//private ArrayList<Observer> observers;

	public DecoyDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		setChanged();
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		addObserver(observer);
	}

 
	public String toString() {
		return "Decoy Duck";
	}

}
