
import java.util.ArrayList;
import java.util.Collection;

public class Block {
	private ArrayList<Building> buildings = new ArrayList<Building>();
	private String name;
	private Street street;

	public Block() {

	}

	public Block(Building in) {
		buildings.add(in);
		in.setBlock(this);
	}

	public Block(String title) {
		setName(title);
	}

	public Block(String title, Building in) {
		setName(title);
		buildings.add(in);
		in.setBlock(this);
	}

	public Block(Collection<Building> group) {
		buildings.addAll(group);
		group.forEach(in -> in.setBlock(this));
	}

	public Block(String title, Collection<Building> group) {
		setName(title);
		buildings.addAll(group);
		group.forEach(in -> in.setBlock(this));
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

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
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
