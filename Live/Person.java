import java.util.HashSet;

public class Person extends Creature {
	private Person mother;
	private Person father;
	private double balance = 0;
	private HashSet inventory = new HashSet();
	private String name;
	private Building place;
	
	public Person() {
		setEnergyGain(70);
		setHealthGain(35);
		setFilling(95);
		setEnergyCost(65);
	}
	
	public Person(String name) {
		this.setName(name);
		setEnergyGain(70);
		setHealthGain(35);
		setFilling(95);
		setEnergyCost(65);
	}

	public boolean hunt(Animal prey) {
		if (this.getStrength() <= prey.getStrength() || this.getEnergy() <= prey.getEnergyCost()) {
			this.setEnergy(this.getEnergy() - prey.getEnergyCost());
			if (this.getEnergy() < 0)
				this.setEnergy(0);
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
		this.getInventory().addAll(prey.getResources());
		return true;
	}

	public boolean fight(Person opponent) {
		if (this.getStrength() <= opponent.getStrength() || this.getEnergy() <= opponent.getEnergyCost()) {
			this.setEnergy(this.getEnergy() - opponent.getEnergyCost());
			if (this.getEnergy() < 0)
				this.setEnergy(0);
			opponent.fight(this);
			return false;
		}
		opponent.setAlive(false);
		this.setEnergy(this.getEnergy() - opponent.getEnergyCost());
		if (this.getEnergy() < 0)
			this.setEnergy(0);
		this.getInventory().addAll(opponent.getInventory());
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean farm(Plant veg) {
		if (this.getEnergy() < veg.getEnergyCost())
			return false;
		this.setHealth(this.getHealth() + veg.getHealthGain());
		if (getHealth() > 100)
			setHealth(100);
		this.setEnergy(this.getEnergy() + veg.getEnergyGain());
		if (getEnergy() > 100)
			setEnergy(100);
		this.setHunger(this.getHunger() - veg.getFilling());
		if (getHunger() < 0)
			setHunger(0);
		this.getInventory().add(veg);
		return true;
	}

	public HashSet getInventory() {
		return inventory;
	}

	public void setInventory(HashSet inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Building getPlace() {
		return place;
	}

	public void setPlace(Building place) {
		this.place = place;
	}
	
	public String toString() {
		return name;
	}
	
	public String introduction() {
		return this.name + " child of " + father.getName() + " and " + mother.getName();
	}
}
