package hansung.designpatterns.decorator.starbuzz;

public class Vanilla extends CondimentDecorator {


	public Vanilla(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", �ٴҶ�";
	}

	public double cost() {
		return .1 + beverage.cost();
	}
}
