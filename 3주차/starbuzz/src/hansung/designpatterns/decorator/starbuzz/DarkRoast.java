package hansung.designpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "��ũ �ν�Ʈ";
	}
 
	public double cost() {
		return 0.99;
	}
}

