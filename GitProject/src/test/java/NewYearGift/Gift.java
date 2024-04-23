package NewYearGift;

import java.util.ArrayList;
import java.util.Comparator;


public class Gift {
	ArrayList<Confectionery> confectioneryList;

	public Gift(ArrayList<Confectionery> confectioneryList) {
		this.confectioneryList = confectioneryList;
	}


	public int calculateGiftWeight() {
		int giftWeight = 0;
		for (Confectionery name : confectioneryList) {
			giftWeight = giftWeight + name.getWeight();
		}
		return giftWeight;
	}


	void sortConfectionaries(final boolean ascending) {
		confectioneryList.sort(new Comparator<Confectionery>() {
			public int compare(Confectionery obj1, Confectionery obj2) {
				return ascending ? obj1.getWeight() - obj2.getWeight() : obj2
						.getWeight() - obj1.getWeight();
			}
		});
	}


	ArrayList<Confectionery> getConfectioneryInRange(int minWeight,
			int maxWeight) {
		ArrayList<Confectionery> confectioneryListInRage = new ArrayList<Confectionery>();
		for (Confectionery name : confectioneryList)
			if (minWeight <= name.getWeight() && name.getWeight() <= maxWeight)
				confectioneryListInRage.add(name);
		return confectioneryListInRage;
	}
}
