package hansung.designpatterns.decorator.starbuzz;

public class Caramel extends CondimentDecorator {


	public Caramel(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", Ä«¶ó¸á";
	}

	public double cost() {
		return .1 + beverage.cost();
	}
}
