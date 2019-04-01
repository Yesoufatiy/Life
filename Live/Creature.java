
public class Creature extends Organism {
	private int strength = 0;
	private int energy = 100;
	private int hunger = 0;

	public void eat(Plant plant) {
		plant.setAlive(false);
		this.setHealth(this.getHealth() + plant.getHealthGain());
		if (getHealth() > 100)
			setHealth(100);
		this.setEnergy(this.getEnergy() + plant.getEnergyGain());
		if (getEnergy() > 100)
			setEnergy(100);
		this.setHunger(this.getHunger() - plant.getFilling());
		if (getHunger() < 0)
			setHunger(0);
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

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
}
