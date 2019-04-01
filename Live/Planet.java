
import java.util.ArrayList;
import java.util.Collection;

public class Planet {
	private ArrayList<Continent> continents = new ArrayList<Continent>();
	private ArrayList<Moon> moons = new ArrayList<Moon>();
	private String name;
	private SolarSystem solarSystem;

	public Planet() {

	}

	public Planet(Continent in) {
		continents.add(in);
		in.setPlanet(this);
	}

	public Planet(String title) {
		name = title;
	}

	public Planet(String title, Continent in) {
		name = title;
		continents.add(in);
		in.setPlanet(this);
	}

	public Planet(Collection<Continent> group) {
		continents.addAll(group);
		group.forEach(in -> in.setPlanet(this));
	}

	public Planet(String title, Collection<Continent> group) {
		name = title;
		continents.addAll(group);
		group.forEach(in -> in.setPlanet(this));
	}

	public ArrayList<Continent> getContinents() {
		return continents;
	}

	public void setContinents(ArrayList<Continent> continents) {
		this.continents = continents;
	}

	public ArrayList<Moon> getMoons() {
		return moons;
	}

	public void setMoons(ArrayList<Moon> moons) {
		this.moons = moons;
	}

	public String toString() {
		return name;
	}

	public SolarSystem getSolarSystem() {
		return solarSystem;
	}

	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}
}
