package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Flock extends Observable implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
  
	public String toString() {
		return "Flock of Ducks";
	}

	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

}
