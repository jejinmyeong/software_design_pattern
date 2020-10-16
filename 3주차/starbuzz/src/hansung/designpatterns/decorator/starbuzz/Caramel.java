package hansung.designpatterns.decorator.starbuzz;

public class Caramel extends CondimentDecorator {


	public Caramel(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", ī���";
	}

	public double cost() {
		return .1 + beverage.cost();
	}
}
