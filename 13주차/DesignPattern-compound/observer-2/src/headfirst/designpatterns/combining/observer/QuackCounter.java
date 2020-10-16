package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class QuackCounter extends Observable implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
   
	public String toString() {
		return duck.toString();
	}

}
