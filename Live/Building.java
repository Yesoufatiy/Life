import java.util.Collection;

public class Building {
	private String name;
	private Block block;

	public Building() {

	}

	public Building(String title) {
		setName(title);
	}

	public String toString() {
		return getName();
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public void printAddress() {
		System.out.println(this + " " + this.getBlock().getStreet() + ",");
		System.out.println(this.getBlock().getStreet().getNeigborhood().getCity() + ", "
				+ this.getBlock().getStreet().getNeigborhood().getCity().getCommunity().getState());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
