
public class Person extends Creature {
	private double balance;

	public boolean hunt(Animal prey) {
		return (this.getStrength() > prey.getStrength());
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
