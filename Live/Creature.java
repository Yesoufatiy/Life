import java.util.ArrayList;

public class Creature extends Organism {
	private int strength = 0;
	private int energy = 100;
	private int hunger = 0;
	private ArrayList<Creature> characters = new ArrayList<Creature>();

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
	
	public String getName() {
		return "";
		
	}
	
	public boolean isHuman() {
		return false;
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
	
	public void stats(Person subject) {
		System.out.println(subject.getName() + "'s stats are as follows:");
		System.out.println("Health level is at " + subject.getHealth());
		System.out.println("Energy cost is " + subject.getEnergyCost());
		System.out.println("Strength level is at " + subject.getStrength());
		System.out.println("Energy level is at " + subject.getEnergy());
		System.out.println("Hunger level is at " + subject.getHunger());
		System.out.println("Father is " + subject.getFather());
		System.out.println("Mother is " + subject.getMother());
		System.out.println("Balance is at " + subject.getBalance());
		if (subject.getPlace() != null) {
			System.out.println("Living place location address is ");
			subject.getPlace().printAddress();
		}
	}
	
	public void stats(Animal subject) {
		System.out.println(subject.getSpecies() + "'s stats are as follows:");
		System.out.println("Health level is at " + subject.getHealth());
		System.out.println("Energy cost is " + subject.getEnergyCost());
		System.out.println("Strength level is at " + subject.getStrength());
		System.out.println("Energy level is at " + subject.getEnergy());
		System.out.println("Hunger level is at " + subject.getHunger());
	}

	public ArrayList<Creature> getCharacters() {
		return characters;
	}

	public void setCharacters(ArrayList<Creature> characters) {
		this.characters = characters;
	}
}
