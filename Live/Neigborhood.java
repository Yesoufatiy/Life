
import java.util.ArrayList;
import java.util.Collection;

public class Neigborhood {
	private ArrayList<Street> streets = new ArrayList<Street>();
	private String name;
	private City city;

	public Neigborhood() {

	}

	public Neigborhood(Street in) {
		streets.add(in);
		in.setNeigborhood(this);
	}

	public Neigborhood(String title) {
		setName(title);
	}

	public Neigborhood(String title, Street in) {
		setName(title);
		streets.add(in);
		in.setNeigborhood(this);
	}

	public Neigborhood(Collection<Street> group) {
		streets.addAll(group);
		group.forEach(in -> in.setNeigborhood(this));
	}

	public Neigborhood(String title, Collection<Street> group) {
		setName(title);
		streets.addAll(group);
		group.forEach(in -> in.setNeigborhood(this));
	}

	public ArrayList<Street> getStreets() {
		return streets;
	}

	public void setStreets(ArrayList<Street> streets) {
		this.streets = streets;
	}

	public String toString() {
		return getName();
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Street find(String seeking) {
		for (Street check: streets)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
