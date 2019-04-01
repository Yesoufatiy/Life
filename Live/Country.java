
import java.util.ArrayList;
import java.util.Collection;

public class Country {
	private ArrayList<State> states = new ArrayList<State>();
	private String name;
	private Continent continent;

	public Country() {

	}

	public Country(State in) {
		states.add(in);
		in.setCountry(this);
	}

	public Country(String title) {
		setName(title);
	}

	public Country(String title, State in) {
		setName(title);
		states.add(in);
		in.setCountry(this);
	}

	public Country(Collection<State> group) {
		states.addAll(group);
		group.forEach(in -> in.setCountry(this));
	}

	public Country(String title, Collection<State> group) {
		setName(title);
		states.addAll(group);
		group.forEach(in -> in.setCountry(this));
	}

	public ArrayList<State> getStates() {
		return states;
	}

	public void setStates(ArrayList<State> states) {
		this.states = states;
	}

	public String toString() {
		return getName();
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public State find(String seeking) {
		for (State check: states)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
