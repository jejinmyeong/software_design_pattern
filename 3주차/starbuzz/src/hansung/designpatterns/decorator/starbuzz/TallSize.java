package hansung.designpatterns.decorator.starbuzz;

public class TallSize extends CondimentDecorator {
	public TallSize(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", �� ������";
	}

	public double cost() {
		return beverage.cost();
	}
}
