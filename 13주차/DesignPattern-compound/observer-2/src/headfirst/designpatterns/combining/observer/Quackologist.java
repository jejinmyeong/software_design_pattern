package headfirst.designpatterns.combining.observer;

import java.util.Observable;
import java.util.Observer;

public class Quackologist implements Observer {
 

	public String toString() {
		return "Quackologist";
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist: " + o + " just quacked.");
	}
}
