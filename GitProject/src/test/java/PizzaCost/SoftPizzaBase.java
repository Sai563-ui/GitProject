package PizzaCost;

public class SoftPizzaBase implements PizzaBaseTypes {

	@Override
	public String getPizzaBase() {
		System.out.println("Soft Pizza Base is selected");
		return "SoftBase";
	}

	@Override
	public int getPizzaBaseCost() {
		System.out.println("Cost for Soft Pizza Base is :" + 20);
		return 20;
	}

}
