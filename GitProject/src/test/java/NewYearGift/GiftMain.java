package NewYearGift;

import java.util.ArrayList;


public class GiftMain {

	public static void main(String[] args) {
		
		ArrayList<Confectionery> confectioneryList = new ArrayList<Confectionery>();
		confectioneryList.add(new Chocolate("DairyMilk", 20));
		confectioneryList.add(new Chocolate("FiveStar", 10));
		confectioneryList.add(new Chocolate("Snicker", 15));
		confectioneryList.add(new Sweet("KajuSweet", 100));
		confectioneryList.add(new Sweet("PistaSweet", 200));
		confectioneryList.add(new Sweet("MixSweet", 50));
		
		Gift gift = new Gift(confectioneryList);
		
		System.out.println("Gift Total  Weight:" + gift.calculateGiftWeight());
		
		gift.sortConfectionaries(true);
		
		System.out.println("Gift after sorting chocolates in ascending order of their weight:");
		for (Confectionery item : gift.confectioneryList)
			if (item instanceof Chocolate)
				System.out.println(item.getName() + " " + item.getWeight());
		
		System.out.println("Candy in range 20 to 250 weight:");
		for (Confectionery item : gift.getConfectioneryInRange(20, 250))
			System.out.println(item.getName() + " " + item.getWeight());
	}
}
