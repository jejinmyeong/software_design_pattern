package hansung.designpatterns.decorator.starbuzz;

public class GrandeSize extends CondimentDecorator {
	
	public GrandeSize(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", �׶��� ������";
	}

	public double cost() {
		return beverage.cost()*2;
	}
}
