package hansung.designpatterns.factory.pizzaaf;

public class KoreanPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new KoreanPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Korean Style Cheese Pizza");

		} else if (item.equals("Bulgogi")) {

			pizza = new BulgogiPizza(ingredientFactory);
			pizza.setName("Korean Style Bulgogi Pizza");

		} else if (item.equals("Kimchi")) {

			pizza = new KimchiPizza(ingredientFactory);
			pizza.setName("Korean Style Kimchi Pizza");

		}
		return pizza;
	}
}