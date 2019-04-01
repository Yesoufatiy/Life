
public class Lion extends Animal {
	public Lion() {
		setEnergyGain(1);
		setHealthGain(1);
		setFilling(1);
		setEnergyCost(40);
		setStrength(80);
		getResources().add("fur");
		getResources().add("meat");
		setSpecies("Lion");
	}
}
