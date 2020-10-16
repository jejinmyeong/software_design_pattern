package hansung.designpatterns.templatemethod.barista;


public class Tea extends CaffeineBeverage {
	void boilWater() {
		System.out.println("Boiling water");
	}
	public void brew() {
		System.out.println("Steeping the tea");
	}
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	void ripen() {}
}
