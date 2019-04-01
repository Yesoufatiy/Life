import java.util.HashSet;

public class Animal extends Creature {
	private HashSet resources = new HashSet();

	public HashSet getResources() {
		return resources;
	}

	public void setResources(HashSet resources) {
		this.resources = resources;
	}

	public boolean eat(Animal prey) {
		if (this.getStrength() < prey.getStrength() || this.getEnergy() < prey.getEnergyCost()) {
			this.setEnergy(this.getEnergy() - prey.getEnergyCost());
			if (this.getEnergy() < 0)
				this.setEnergy(0);
			prey.setEnergy(prey.getEnergy() - this.getEnergyCost());
			if (prey.getEnergy() < 0)
				prey.setEnergy(0);
			prey.eat(this);
			return false;
		}
		prey.setAlive(false);
		this.setHealth(this.getHealth() + prey.getHealthGain());
		if (getHealth() > 100)
			setHealth(100);
		this.setEnergy(this.getEnergy() + prey.getEnergyGain());
		if (getEnergy() > 100)
			setEnergy(100);
		this.setHunger(this.getHunger() - prey.getFilling());
		if (getHunger() < 0)
			setHunger(0);
		return true;
	}
	
	public boolean attack(Person prey) {
		if (this.getStrength() < prey.getStrength() || this.getEnergy() < prey.getEnergyCost()) {
			this.setEnergy(this.getEnergy() - prey.getEnergyCost());
			if (this.getEnergy() < 0)
				this.setEnergy(0);
			prey.setEnergy(prey.getEnergy() - this.getEnergyCost());
			if (prey.getEnergy() < 0)
				prey.setEnergy(0);
			prey.hunt(this);
			return false;
		}
		prey.setAlive(false);
		this.setHealth(this.getHealth() + prey.getHealthGain());
		if (getHealth() > 100)
			setHealth(100);
		this.setEnergy(this.getEnergy() + prey.getEnergyGain());
		if (getEnergy() > 100)
			setEnergy(100);
		this.setHunger(this.getHunger() - prey.getFilling());
		if (getHunger() < 0)
			setHunger(0);
		return true;
	}
}
