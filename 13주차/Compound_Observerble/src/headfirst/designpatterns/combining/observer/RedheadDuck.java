package headfirst.designpatterns.combining.observer;

public class RedheadDuck extends java.util.Observable implements Quackable {

	public RedheadDuck() {
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
		return "Redhead Duck";
	}
}
