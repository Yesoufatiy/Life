
import java.util.ArrayList;
import java.util.Collection;

public class Community {
	private ArrayList<City> cities = new ArrayList<City>();
	private String name;
	private State state;

	public Community() {

	}

	public Community(City in) {
		cities.add(in);
		in.setCommunity(this);
	}

	public Community(String title) {
		name = title;
	}

	public Community(String title, City in) {
		name = title;
		cities.add(in);
		in.setCommunity(this);
	}

	public Community(Collection<City> group) {
		cities.addAll(group);
		group.forEach(in -> in.setCommunity(this));
	}

	public Community(String title, Collection<City> group) {
		name = title;
		cities.addAll(group);
		group.forEach(in -> in.setCommunity(this));
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	public String toString() {
		return name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
