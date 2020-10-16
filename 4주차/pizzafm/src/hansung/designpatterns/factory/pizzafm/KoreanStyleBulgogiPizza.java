package hansung.designpatterns.factory.pizzafm;

public class KoreanStyleBulgogiPizza extends Pizza {

	public KoreanStyleBulgogiPizza() { 
		name = "Korean Style Bulgogi Pizza";
		dough = "Normal Crust Dough";
		sauce = "Bulgogi Sauce";
 
		toppings.add("Onion");
	}
}

