
public class Elephant extends Animal {
	public Elephant() {
		setEnergyGain(5);
		setHealthGain(5);
		setFilling(15);
		setEnergyCost(15);
		setStrength(60);
		getResources().add("leather");
		getResources().add("bone tusks");
		getResources().add("meat");
		setSpecies("Elephant");
	}
}
