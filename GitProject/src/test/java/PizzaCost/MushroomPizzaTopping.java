package PizzaCost;

public class MushroomPizzaTopping implements PizzaToppingsTypes

{

	@Override
	public String getPizzaTopping() {
		System.out.println("Mushroom Pizza Topping is selected");
		return "Mushroom";
	}

	@Override
	public int getPizzaToppingCost() {
		System.out.println("Cost for Mushroom Pizza Topping is :" + 70);
		return 70;
	}

}
