
public class Living {
	public static void main(String[] args) {
		Multiverse mine = new Location().setSimulation();
		Planet myWorld = mine.getUniverses().get(0).getGalaxies().get(0).getSolarSystems().get(0).getPlanets().get(2);
		System.out.println(myWorld);
		System.out.println(mine.getUniverses().get(0).getGalaxies().get(0).getSolarSystems().get(0).getPlanets());
		Building home = mine.getUniverses().get(0).getGalaxies().get(0).getSolarSystems().get(0).getPlanets().get(2).getContinents().get(0).getCountries().get(1).getStates().get(0).getCommunities().get(0).getCities().get(0).getNeigborhoods().get(0).getStreets().get(0).getBlocks().get(0).getBuildings().get(0);
		System.out.println(home);
		Person Adam = new Person();
		Person Eve = new Person();
		Person Yusuf = new Person();
		Person Malik = new Person();
		Yusuf.setStrength(19);
		Malik.setStrength(18);
		System.out.println(Yusuf.fight(Malik));
	}
}
