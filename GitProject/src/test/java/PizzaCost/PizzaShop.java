package PizzaCost;

import java.util.ArrayList;

public class PizzaShop 

{
	private PizzaBaseTypes pizzaBaseType;
	private ArrayList<PizzaToppingsTypes> pizzaToppingTypesList;

	public PizzaBaseTypes getPizzaBaseType() {
		return pizzaBaseType;
	}

	public void setPizzaBaseType(PizzaBaseTypes pizzaBaseType) {
		this.pizzaBaseType = pizzaBaseType;
	}

	public ArrayList<PizzaToppingsTypes> getPizzaToppingTypesList() {
		return pizzaToppingTypesList;
	}

	public void setPizzaToppingTypesList(
			ArrayList<PizzaToppingsTypes> pizzaToppingTypesList) {
		this.pizzaToppingTypesList = pizzaToppingTypesList;
	}
    
public int getPizzaCost(PizzaBaseTypes pizzaBaseTypes,
			ArrayList<PizzaToppingsTypes> pizzaToppingsTypesList) {
		int pizzaCost = pizzaBaseTypes.getPizzaBaseCost();
		for (PizzaToppingsTypes topping : pizzaToppingsTypesList) {
			pizzaCost = pizzaCost + topping.getPizzaToppingCost();
		}
		return pizzaCost;
	}
	
	
	
	
}
