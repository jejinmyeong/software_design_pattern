package hansung.designpatterns.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchCoffeeWithHook extends CaffeineBeverageWithHook {
	
	public void boilWater() {
		System.out.println("Extract coffee from cold water for a long time");
	}
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
 
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
 
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
	void ripen() {
		System.out.println("Ripen at low temperature for one to two days.");
	}

}
