package hansung.designpatterns.factory.pizzafm;

public class KoreanPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("bulgogi")) {
            		return new KoreanStyleBulgogiPizza();
        	} else if (item.equals("kimchi")) {
        	    	return new KoreanStyleKimchiPizza();
        	} else return null;
	}
}