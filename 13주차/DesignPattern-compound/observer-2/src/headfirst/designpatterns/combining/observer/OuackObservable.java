package headfirst.designpatterns.combining.observer;

import java.util.Observer;

public interface OuackObservable{
	
	public void registerObserver(Observer observer);
	public void notifyObserver();

}
