package FlowerBoquet;

public class BouqetMain {

	public static void main(String[] args) {
		
		Rose rose = new Rose(3, 1);
		Jasmine jasmine = new Jasmine(5, 2);
		Lily lily = new Lily(2,3);
		
		Bouqet bouqet = new Bouqet();
		bouqet.setRose(rose);
		bouqet.setJasmine(jasmine);
		bouqet.setLily(lily);
		
		int boqueCost = bouqet.getBouqetCost(rose, jasmine, lily);
		System.out.println("Cost of bouquet which consistts of "
				+ rose.getNumberOfFlowers() + " Roses "
				+ jasmine.getNumberOfFlowers() + " Jasmines "
				+ lily.getNumberOfFlowers() + " Lilys is:" + boqueCost + "$");
	}

}
