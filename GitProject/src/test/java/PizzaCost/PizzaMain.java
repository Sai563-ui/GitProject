package PizzaCost;

import java.util.ArrayList;


public class PizzaMain 
{
	public static void main(String[] args) {
	
			PizzaBaseTypes pizzaBaseTypes = new SoftPizzaBase();
			ArrayList<PizzaToppingsTypes> pizzaToppingsTypesList = new ArrayList<PizzaToppingsTypes>();

			pizzaToppingsTypesList.add(new TomatoPizzaTopping());
			pizzaToppingsTypesList.add(new CornPizzaTopping());
			pizzaToppingsTypesList.add(new MushroomPizzaTopping());
			
            PizzaShop pizzaShop = new PizzaShop();
			pizzaShop.setPizzaBaseType(pizzaBaseTypes);
			pizzaShop.setPizzaToppingTypesList(pizzaToppingsTypesList);
			

			
			int pizzaCost = pizzaShop.getPizzaCost(pizzaBaseTypes,pizzaToppingsTypesList);

			
			ArrayList<String> ToppingNameList = new ArrayList<String>();
			for (PizzaToppingsTypes topping : pizzaToppingsTypesList)
				ToppingNameList.add(topping.getPizzaTopping());

			System.out.println("Pizza Cost with " + pizzaBaseTypes.getPizzaBase()
					+ " and topping " + ToppingNameList + ":" + pizzaCost);
		}

	
	
}
