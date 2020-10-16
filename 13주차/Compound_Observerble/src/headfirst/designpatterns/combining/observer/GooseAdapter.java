package headfirst.designpatterns.combining.observer;

public class GooseAdapter extends java.util.Observable implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
