package hansung.designpatterns.decorator.starbuzz;

public class Water extends CondimentDecorator {


	public Water(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", ¹°";
	}

	public double cost() {
		return .05 + beverage.cost();
	}
}
