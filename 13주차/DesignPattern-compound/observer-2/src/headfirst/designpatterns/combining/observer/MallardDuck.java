package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class MallardDuck extends Observable implements Quackable {
	//Observable observable;
 
	public MallardDuck() {
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
		return "Mallard Duck";
	}
}
