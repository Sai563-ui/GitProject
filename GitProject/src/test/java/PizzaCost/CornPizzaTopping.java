package PizzaCost;

public class CornPizzaTopping implements PizzaToppingsTypes 
{
	@Override
	public String getPizzaTopping() {
		System.out.println("Corn Pizza Topping is selected");
		return "Corn";

	}

	@Override
	public int getPizzaToppingCost() {
		System.out.println("Cost for Corn Pizza Topping is :" + 60);
		return 60;
	}
}
