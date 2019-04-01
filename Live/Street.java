
import java.util.ArrayList;
import java.util.Collection;

public class Street {
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private String name;
	private Neigborhood neigborhood;

	public Street() {

	}

	public Street(Block in) {
		blocks.add(in);
		in.setStreet(this);
	}

	public Street(String title) {
		setName(title);
	}

	public Street(String title, Block in) {
		setName(title);
		blocks.add(in);
		in.setStreet(this);
	}

	public Street(Collection<Block> group) {
		blocks.addAll(group);
		group.forEach(in -> in.setStreet(this));
	}

	public Street(String title, Collection<Block> group) {
		setName(title);
		blocks.addAll(group);
		group.forEach(in -> in.setStreet(this));
	}

	public ArrayList<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(ArrayList<Block> blocks) {
		this.blocks = blocks;
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
	
	public Block find(String seeking) {
		for (Block check: blocks)
			if (check.getName() == seeking)
				return check;
		return null;
	}
}
