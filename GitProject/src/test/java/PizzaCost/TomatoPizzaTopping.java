package PizzaCost;

public class TomatoPizzaTopping implements PizzaToppingsTypes {

	@Override
	public String getPizzaTopping() {
		System.out.println("Tomato Pizza Topping is selected");
		return "Tomato";
	}

	@Override
	public int getPizzaToppingCost() {
		System.out.println("Cost for Tomato Pizza Topping is :" + 50);
		return 50;
	}

}
