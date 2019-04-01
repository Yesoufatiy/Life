
public class Creature extends Organism {
	private int strength;
	private int energy = 100;
	private int energyGain;

	public void eat(Plant plant) {
		this.setEnergy(getEnergy() + plant.getEnergyGain());
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getEnergyGain() {
		return energyGain;
	}

	public void setEnergyGain(int energyGain) {
		this.energyGain = energyGain;
	}
}
