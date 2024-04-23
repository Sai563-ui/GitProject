package PowerConsumption;

import java.util.ArrayList;
import java.util.Collections;

public class HomeMain {
	public static void main(String[] args) {
		ArrayList<Appliance> appliancesList = new ArrayList<Appliance>();
		
		appliancesList.add(new Appliance("TV", 3));
		appliancesList.add(new Appliance("Laptop", 4));
		appliancesList.add(new Appliance("FAN", 1));
		appliancesList.add(new Appliance("Light", 2));
		
		int totalPowerConsumption = getPowerConsumption(appliancesList);
		System.out.println("Total power consumption:" + totalPowerConsumption);
		
		Collections.sort(appliancesList);
		System.out.println("Ascending sorting based on power consumption");
		
		for (Appliance appliance : appliancesList) {
			System.out.println("Appliance Name: " + appliance.getName()
					+ " Power Consumption:" + appliance.getPowerConusmption());
		}
	}

	public static int getPowerConsumption(ArrayList<Appliance> appliancesList) {
		int totalPowerConsumption = 0;
		for (Appliance applianceName : appliancesList) {
			totalPowerConsumption = totalPowerConsumption
					+ applianceName.getPowerConusmption();
		}
		return totalPowerConsumption;
	}
}
