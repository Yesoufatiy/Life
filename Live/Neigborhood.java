
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
	}

	public Neigborhood(String title) {
		name = title;
	}

	public Neigborhood(Collection<Street> group) {
		streets.addAll(group);
	}

	public Neigborhood(String title, Street in) {
		name = title;
		streets.add(in);
	}

	public Neigborhood(String title, Collection<Street> group) {
		name = title;
		streets.addAll(group);
	}

	public ArrayList<Street> getStreets() {
		return streets;
	}

	public void setStreets(ArrayList<Street> streets) {
		this.streets = streets;
	}

	public String toString() {
		return name;
	}
}
