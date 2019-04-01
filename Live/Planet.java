
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
		setName(title);
	}

	public Planet(String title, Continent in) {
		setName(title);
		continents.add(in);
		in.setPlanet(this);
	}

	public Planet(Collection<Continent> group) {
		continents.addAll(group);
		group.forEach(in -> in.setPlanet(this));
	}

	public Planet(String title, Collection<Continent> group) {
		setName(title);
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
		return getName();
	}

	public SolarSystem getSolarSystem() {
		return solarSystem;
	}

	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}
	
	public Building myAddress() {
		return this.getContinents().get(0).getCountries().get(1).getStates().get(0).getCommunities().get(0).getCities().get(0).getNeigborhoods().get(0).getStreets().get(0).getBlocks().get(0).getBuildings().get(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Continent find(String seeking) {
		for (Continent check: continents)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
