package headfirst.designpatterns.combining.observer;

public class MallardDuck extends java.util.Observable implements Quackable {
 
	public MallardDuck() {
	}
 
	public void quack() {
		System.out.println("Quack");
		setChanged();
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		addObserver(observer);
	}
 
	public void notifyObservers() {
		super.notifyObservers();
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
