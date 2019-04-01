
public class Hawk extends Bird {
	public Hawk() {
		setEnergyGain(1);
		setHealthGain(2);
		setFilling(0);
		setEnergyCost(25);
		setStrength(20);
		getResources().add("feathers");
		getResources().add("eggs");
		setSpecies("Hawk");
	}
}
