package hansung.designpatterns.decorator.starbuzzalternative;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "�Ͽ콺����";
    }

    public double cost() {
        return super.cost()+0.89;
    }
}
