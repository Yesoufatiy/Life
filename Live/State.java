
import java.util.ArrayList;
import java.util.Collection;

public class State {
	private ArrayList<Community> communities = new ArrayList<Community>();
	private String name;
	private Country country;

	public State() {

	}

	public State(Community in) {
		communities.add(in);
		in.setState(this);
	}

	public State(String title) {
		name = title;
	}

	public State(String title, Community in) {
		name = title;
		communities.add(in);
		in.setState(this);
	}

	public State(Collection<Community> group) {
		communities.addAll(group);
		group.forEach(in -> in.setState(this));
	}

	public State(String title, Collection<Community> group) {
		name = title;
		communities.addAll(group);
		group.forEach(in -> in.setState(this));
	}

	public ArrayList<Community> getCommunities() {
		return communities;
	}

	public void setCommunities(ArrayList<Community> communities) {
		this.communities = communities;
	}

	public String toString() {
		return name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
