package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;

public class MallardDuck implements Quackable {
	//Observable observable;
	private ArrayList<Observer> observers;
 
	public MallardDuck() {
		//observable = new Observable(this);
		observers = new ArrayList<Observer>();
	}
 
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		observers.add(observer);
	}
 
	public void notifyObservers() {
		//observable.notifyObservers();
		for(Observer observer : observers) {
			observer.update(this);
		}
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
