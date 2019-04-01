
import java.util.ArrayList;
import java.util.Collection;

public class Continent {
	private ArrayList<Country> countries = new ArrayList<Country>();
	private String name;
	private Planet planet;

	public Continent() {

	}

	public Continent(Country in) {
		countries.add(in);
		in.setContinent(this);
	}

	public Continent(String title) {
		name = title;
	}

	public Continent(String title, Country in) {
		name = title;
		countries.add(in);
		in.setContinent(this);
	}

	public Continent(Collection<Country> group) {
		countries.addAll(group);
		group.forEach(in -> in.setContinent(this));
	}

	public Continent(String title, Collection<Country> group) {
		name = title;
		countries.addAll(group);
		group.forEach(in -> in.setContinent(this));
	}

	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}

	public String toString() {
		return name;
	}

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}
}
