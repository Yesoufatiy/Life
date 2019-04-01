
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
	}

	public Street(String title) {
		name = title;
	}

	public Street(Collection<Block> group) {
		blocks.addAll(group);
	}

	public Street(String title, Block in) {
		name = title;
		blocks.add(in);
	}

	public Street(String title, Collection<Block> group) {
		name = title;
		blocks.addAll(group);
	}

	public ArrayList<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(ArrayList<Block> blocks) {
		this.blocks = blocks;
	}

	public String toString() {
		return name;
	}
}
