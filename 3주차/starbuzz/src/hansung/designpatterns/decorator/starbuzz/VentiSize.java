package hansung.designpatterns.decorator.starbuzz;

public class VentiSize extends CondimentDecorator {
	public VentiSize(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", ��Ƽ ������";
	}

	public double cost() {
		return beverage.cost()*3;
	}
}
