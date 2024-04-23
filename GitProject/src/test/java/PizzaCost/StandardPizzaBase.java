package PizzaCost;

public class StandardPizzaBase  implements PizzaBaseTypes {
	@Override
	public String getPizzaBase() {
		System.out.println("Standard Pizza Base is selected");
		return "StandardBase";
	}

	@Override
	public int getPizzaBaseCost() {
		System.out.println("Cost for Standard Pizza Base is :" + 15);
		return 15;
	}

}
