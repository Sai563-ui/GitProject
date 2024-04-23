package FlowerBoquet;

public class Bouqet {
	Rose rose;
	Jasmine jasmine;
	Lily lily;

	public void setRose(Rose rose) {
		this.rose = rose;
	}

	public void setJasmine(Jasmine jasmine) {
		this.jasmine = jasmine;
	}

	public void setLily(Lily lily) {
		this.lily = lily;
	}

	int getBouqetCost(Rose rose, Jasmine jasmine, Lily lily) {
		int bouqeCost = (rose.getNumberOfFlowers() * rose.getCostOfFlower())
				+ (jasmine.getNumberOfFlowers() * jasmine.getCostOfFlower())
				+ (lily.getNumberOfFlowers() * lily.getCostOfFlower());
		return bouqeCost;

	}

}
