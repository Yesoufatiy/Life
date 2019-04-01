
import java.util.ArrayList;
import java.util.Collection;

public class SolarSystem {
	private ArrayList<Planet> planets = new ArrayList<Planet>();
	private String name;
	private Galaxy galaxy;

	public SolarSystem() {

	}
	
	public SolarSystem(Planet in) {
		planets.add(in);
		in.setSolarSystem(this);
	}

	public SolarSystem(String title) {
		name = title;
	}
	
	public SolarSystem(String title, Planet in) {
		name = title;
		planets.add(in);
		in.setSolarSystem(this);
	}

	public SolarSystem(Collection<Planet> group) {
		planets.addAll(group);
		group.forEach(in -> in.setSolarSystem(this));
	}

	public SolarSystem(String title, Collection<Planet> group) {
		name = title;
		planets.addAll(group);
		group.forEach(in -> in.setSolarSystem(this));
	}

	public ArrayList<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(ArrayList<Planet> planets) {
		this.planets = planets;
	}
	
	public String toString() {
		return name;
	}

	public Galaxy getGalaxy() {
		return galaxy;
	}

	public void setGalaxy(Galaxy galaxy) {
		this.galaxy = galaxy;
	}
}
