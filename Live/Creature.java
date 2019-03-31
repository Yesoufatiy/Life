
public class Creature extends Organism {
	private int Strength;

	public boolean eat(Creature prey) {
		return (this.getStrength() >= prey.getStrength());
	}

	public boolean eat(Plant plant) {
		return true;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}
}
