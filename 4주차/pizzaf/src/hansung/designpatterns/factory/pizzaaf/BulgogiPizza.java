package hansung.designpatterns.factory.pizzaaf;

public class BulgogiPizza extends Pizza {
	public BulgogiPizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
