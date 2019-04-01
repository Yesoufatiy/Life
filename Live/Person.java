import java.util.HashSet;

public class Person extends Creature {
	private Person mother;
	private Person father;
	private double balance = 0;
	private HashSet inventory = new HashSet();
	private String name;
	private Building place;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.setName(name);
	}

	public boolean hunt(Animal prey) {
		if (this.getStrength() <= prey.getStrength())
			return false;
		this.setEnergy(getEnergy() + prey.getEnergyGain());
		this.getInventory().addAll(prey.getResources());
		return true;
	}

	public boolean fight(Person opponent) {
		if (this.getStrength() <= opponent.getStrength())
			return false;
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
		if (getEnergy() < veg.getEnergyCost())
			return false;
		getInventory().add(veg);
		setEnergy(getEnergy() - veg.getEnergyCost());
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
