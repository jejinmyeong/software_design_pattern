package hansung.designpatterns.factory.pizzaaf;


public class KoreanPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new NormalCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Onion(),
		                      new Garlic() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new Bulgogi();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
	
	public Kimchi createKimchi() {
		return new CuttingKimchi();
	}
}
