
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
		setName(title);
	}

	public State(String title, Community in) {
		setName(title);
		communities.add(in);
		in.setState(this);
	}

	public State(Collection<Community> group) {
		communities.addAll(group);
		group.forEach(in -> in.setState(this));
	}

	public State(String title, Collection<Community> group) {
		setName(title);
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
		return getName();
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Community find(String seeking) {
		for (Community check: communities)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
