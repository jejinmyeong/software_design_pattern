package hansung.designpatterns.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {

 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", ����ũ��";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
