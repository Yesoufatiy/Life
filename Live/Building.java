import java.util.Collection;

public class Building {
	private String name;
	private Street street;

	public Building() {

	}

	public Building(String title) {
		setName(title);
	}

	public String toString() {
		return getName();
	}

	public void printAddress() {
		System.out.println(this + " " + this.getStreet() + ",");
		System.out.println(this.getStreet().getNeigborhood().getCity() + ", "
				+ this.getStreet().getNeigborhood().getCity().getCommunity().getState());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}
}
