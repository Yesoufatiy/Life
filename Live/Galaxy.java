
import java.util.ArrayList;
import java.util.Collection;

public class Galaxy {
	private ArrayList<SolarSystem> solarSystems = new ArrayList<SolarSystem>();
	private String name;
	private Universe universe;

	public Galaxy() {

	}
	
	public Galaxy(SolarSystem in) {
		solarSystems.add(in);
		in.setGalaxy(this);
	}

	public Galaxy(String title) {
		name = title;
	}
	
	public Galaxy(String title, SolarSystem in) {
		name = title;
		solarSystems.add(in);
		in.setGalaxy(this);
	}

	public Galaxy(Collection<SolarSystem> group) {
		solarSystems.addAll(group);
		group.forEach(in -> in.setGalaxy(this));
	}

	public Galaxy(String title, Collection<SolarSystem> group) {
		name = title;
		solarSystems.addAll(group);
		group.forEach(in -> in.setGalaxy(this));
	}

	public ArrayList<SolarSystem> getSolarSystems() {
		return solarSystems;
	}

	public void setSolarSystems(ArrayList<SolarSystem> solarSystems) {
		this.solarSystems = solarSystems;
	}
	
	public String toString() {
		return name;
	}

	public Universe getUniverse() {
		return universe;
	}

	public void setUniverse(Universe universe) {
		this.universe = universe;
	}
}
