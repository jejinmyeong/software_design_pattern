package hansung.designpatterns.factory.pizzafm;

public class KoreanStyleKimchiPizza extends Pizza {

	public KoreanStyleKimchiPizza() { 
		name = "Koeran Style Kimchi Pizza";
		dough = "Normal Crust Dough";
		sauce = "Spicy Sauce";
 
		toppings.add("Onion");
		toppings.add("minced meat");
	}
}

