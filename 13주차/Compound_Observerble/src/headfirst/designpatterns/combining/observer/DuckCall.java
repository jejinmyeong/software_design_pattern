package headfirst.designpatterns.combining.observer;

public class DuckCall extends java.util.Observable implements Quackable {

	public DuckCall() {
	}
 
	public void quack() {
		System.out.println("Kwak");
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
		return "Duck Call";
	}
}
