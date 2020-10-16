package hansung.designpatterns.templatemethod.barista;

public class DutchCoffee extends CaffeineBeverage {

	public void boilWater() {
		System.out.println("Extract coffee from cold water for a long time");
	}
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	void ripen() {
		System.out.println("Ripen at low temperature for one to two days.");
	}
}
