
import java.util.ArrayList;
import java.util.Collection;

public class Universe {
	private ArrayList<Galaxy> galaxies = new ArrayList<Galaxy>();
	private String name;
	private Multiverse multiverse;

	public Universe() {

	}
	
	public Universe(Galaxy in) {
		galaxies.add(in);
		in.setUniverse(this);
	}

	public Universe(String title) {
		name = title;
	}
	
	public Universe(String title, Galaxy in) {
		name = title;
		galaxies.add(in);
		in.setUniverse(this);
	}

	public Universe(Collection<Galaxy> group) {
		galaxies.addAll(group);
		group.forEach(in -> in.setUniverse(this));
	}

	public Universe(String title, Collection<Galaxy> group) {
		name = title;
		galaxies.addAll(group);
		group.forEach(in -> in.setUniverse(this));
	}

	public ArrayList<Galaxy> getGalaxies() {
		return galaxies;
	}

	public void setGalaxies(ArrayList<Galaxy> galaxies) {
		this.galaxies = galaxies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	public Multiverse getMultiverse() {
		return multiverse;
	}

	public void setMultiverse(Multiverse multiverse) {
		this.multiverse = multiverse;
	}
	
	public Galaxy find(String seeking) {
		for (Galaxy check: galaxies)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
