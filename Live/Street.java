
import java.util.ArrayList;
import java.util.Collection;

public class Street {
	private ArrayList<Building> buildings = new ArrayList<Building>();
	private String name;
	private Neigborhood neigborhood;

	public Street() {

	}

	public Street(Building in) {
		buildings.add(in);
		in.setStreet(this);
	}

	public Street(String title) {
		setName(title);
	}

	public Street(String title, Building in) {
		setName(title);
		buildings.add(in);
		in.setStreet(this);
	}

	public Street(Collection<Building> group) {
		buildings.addAll(group);
		group.forEach(in -> in.setStreet(this));
	}

	public Street(String title, Collection<Building> group) {
		setName(title);
		buildings.addAll(group);
		group.forEach(in -> in.setStreet(this));
	}

	public ArrayList<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(ArrayList<Building> buildings) {
		this.buildings = buildings;
	}

	public String toString() {
		return getName();
	}

	public Neigborhood getNeigborhood() {
		return neigborhood;
	}

	public void setNeigborhood(Neigborhood neigborhood) {
		this.neigborhood = neigborhood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Building find(String seeking) {
		for (Building check: buildings)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
