package headfirst.designpatterns.combining.observer;

public class RubberDuck extends java.util.Observable implements Quackable {
	
	public RubberDuck() {
		
	}
 
	public void quack() {
		System.out.println("Squeak");
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
		return "Rubber Duck";
	}
}
