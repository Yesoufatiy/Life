
import java.util.Collection;
import java.util.LinkedList;

public class Multiverse {
	private LinkedList<Universe> universes = new LinkedList<Universe>();
	private String name;

	public Multiverse() {

	}
	
	public Multiverse(Universe in) {
		universes.add(in);
		in.setMultiverse(this);
	}

	public Multiverse(String title) {
		name = title;
	}
	
	public Multiverse(String title, Universe in) {
		name = title;
		universes.add(in);
		in.setMultiverse(this);
	}

	public Multiverse(Collection<Universe> group) {
		universes.addAll(group);
		group.forEach(in -> in.setMultiverse(this));
	}

	public Multiverse(String title, Collection<Universe> group) {
		name = title;
		universes.addAll(group);
		group.forEach(in -> in.setMultiverse(this));
	}

	public LinkedList<Universe> getUniverses() {
		return universes;
	}

	public void setUniverses(LinkedList<Universe> universes) {
		this.universes = universes;
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
}
