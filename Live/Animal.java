import java.util.HashSet;

public class Animal extends Creature {
	private HashSet resources = new HashSet();

	public HashSet getResources() {
		return resources;
	}

	public void setResources(HashSet resources) {
		this.resources = resources;
	}

	public boolean eat(Creature prey) {
		if (this.getStrength() < prey.getStrength())
			return false;
		this.setEnergy(this.getEnergy() + prey.getEnergyGain());
		return true;
	}
}
