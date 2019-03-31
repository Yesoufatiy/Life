
public class Worker extends Person {
	public boolean getPaid(Boss employer, double money) {
		return employer.pay(this, money);
	}
}
