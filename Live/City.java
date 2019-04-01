
import java.util.ArrayList;
import java.util.Collection;

public class City {
	private ArrayList<Neigborhood> neigborhoods = new ArrayList<Neigborhood>();
	private String name;
	private Community community;

	public City() {

	}

	public City(Neigborhood in) {
		neigborhoods.add(in);
		in.setCity(this);
	}

	public City(String title) {
		setName(title);
	}

	public City(String title, Neigborhood in) {
		setName(title);
		neigborhoods.add(in);
		in.setCity(this);
	}

	public City(Collection<Neigborhood> group) {
		neigborhoods.addAll(group);
		group.forEach(in -> in.setCity(this));
	}

	public City(String title, Collection<Neigborhood> group) {
		setName(title);
		neigborhoods.addAll(group);
		group.forEach(in -> in.setCity(this));
	}

	public ArrayList<Neigborhood> getNeigborhoods() {
		return neigborhoods;
	}

	public void setNeigborhoods(ArrayList<Neigborhood> neigborhoods) {
		this.neigborhoods = neigborhoods;
	}

	public String toString() {
		return getName();
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Neigborhood find(String seeking) {
		for (Neigborhood check: neigborhoods)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
