
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
		setName(title);
	}
	
	public SolarSystem(String title, Planet in) {
		setName(title);
		planets.add(in);
		in.setSolarSystem(this);
	}

	public SolarSystem(Collection<Planet> group) {
		planets.addAll(group);
		group.forEach(in -> in.setSolarSystem(this));
	}

	public SolarSystem(String title, Collection<Planet> group) {
		setName(title);
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
		return getName();
	}

	public Galaxy getGalaxy() {
		return galaxy;
	}

	public void setGalaxy(Galaxy galaxy) {
		this.galaxy = galaxy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Planet find(String seeking) {
		for (Planet check: planets)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
