package hansung.designpatterns.decorator.starbuzzalternative;

public class Decaf extends Beverage{
    public Decaf() {
        description = "��ī����";
    }

    public double cost() {
        return 1.05 + super.cost();
    }
}
