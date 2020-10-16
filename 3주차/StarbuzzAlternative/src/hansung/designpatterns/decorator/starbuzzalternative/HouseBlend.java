package hansung.designpatterns.decorator.starbuzzalternative;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스블랜드";
    }

    public double cost() {
        return super.cost()+0.89;
    }
}
