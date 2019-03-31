
public class Boss extends Person {
	public boolean pay(Worker employee, double money) {
		if (this.getBalance() < money)
			return false;
		this.setBalance(this.getBalance() - money);
		employee.setBalance(employee.getBalance() + money);
		return true;
	}
}
