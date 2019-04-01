
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
	}

	public Block(String title) {
		name = title;
	}

	public Block(Collection<Building> group) {
		buildings.addAll(group);
	}

	public Block(String title, Building in) {
		name = title;
		buildings.add(in);
	}

	public Block(String title, Collection<Building> group) {
		name = title;
		buildings.addAll(group);
	}

	public ArrayList<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(ArrayList<Building> buildings) {
		this.buildings = buildings;
	}

	public String toString() {
		return name;
	}
}
