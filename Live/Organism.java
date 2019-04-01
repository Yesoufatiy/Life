
public class Organism {
	private boolean alive = true;
	private int health = 100;
	private int energyGain;
	private int healthGain;
	private int filling;
	private int energyCost; // planting for plants and catching for creatures

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		if (!alive) {
			setHealth(0);
			setEnergyGain(0);
			setHealthGain(0);
			setFilling(0);
		}
		this.alive = alive;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getEnergyGain() {
		return energyGain;
	}

	public void setEnergyGain(int energyGain) {
		this.energyGain = energyGain;
	}

	public int getHealthGain() {
		return healthGain;
	}

	public void setHealthGain(int healthGain) {
		this.healthGain = healthGain;
	}

	public int getFilling() {
		return filling;
	}

	public void setFilling(int filling) {
		this.filling = filling;
	}

	public int getEnergyCost() {
		return energyCost;
	}

	public void setEnergyCost(int energyCost) {
		this.energyCost = energyCost;
	}
}
