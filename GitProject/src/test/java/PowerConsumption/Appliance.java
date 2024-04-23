package PowerConsumption;

public class Appliance implements Comparable<Appliance> {

	String name;
	int powerConusmption;

	public Appliance(String name, int powerConusmption) {
		super();
		this.name = name;
		this.powerConusmption = powerConusmption;
	}

	public String getName() {
		return name;
	}

	public int getPowerConusmption() {
		return powerConusmption;
	}

	@Override
	public int compareTo(Appliance o) {

		return this.powerConusmption - o.powerConusmption;
	}
	
	

}
