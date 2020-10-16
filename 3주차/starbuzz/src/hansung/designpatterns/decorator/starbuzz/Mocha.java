package hansung.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", ¸ğÄ«";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
