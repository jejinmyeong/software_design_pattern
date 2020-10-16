package hansung.designpatterns.decorator.starbuzz;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", ����";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
