package hansung.designpatterns.decorator.starbuzzalternative;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "��ũ �ν�Ʈ";
    }

    public double cost() {
        return .99+super.cost();
    }
}
