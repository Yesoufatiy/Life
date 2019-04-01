
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
	}

	public City(String title) {
		name = title;
	}

	public City(Collection<Neigborhood> group) {
		neigborhoods.addAll(group);
	}

	public City(String title, Neigborhood in) {
		name = title;
		neigborhoods.add(in);
	}

	public City(String title, Collection<Neigborhood> group) {
		name = title;
		neigborhoods.addAll(group);
	}

	public ArrayList<Neigborhood> getNeigborhoods() {
		return neigborhoods;
	}

	public void setNeigborhoods(ArrayList<Neigborhood> neigborhoods) {
		this.neigborhoods = neigborhoods;
	}

	public String toString() {
		return name;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}
}
