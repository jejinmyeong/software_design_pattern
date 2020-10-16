package hansung.designpatterns.decorator.starbuzz;

public class VentiSize extends CondimentDecorator {
	public VentiSize(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", 벤티 사이즈";
	}

	public double cost() {
		return beverage.cost()*3;
	}
}
