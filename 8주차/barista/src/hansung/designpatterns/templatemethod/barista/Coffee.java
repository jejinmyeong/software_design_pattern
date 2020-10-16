package hansung.designpatterns.templatemethod.barista;


public class Coffee extends CaffeineBeverage {
	public void boilWater() {
		System.out.println("Boiling water");
	}
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	@Override
	void ripen() {}
}
