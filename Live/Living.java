import java.util.ArrayList;
import java.util.Arrays;

public class Living {
	public static void main(String[] args) {
		Multiverse mine = new Location().setSimulation();
		Planet myWorld = mine.getUniverses().get(0).getGalaxies().get(0).getSolarSystems().get(0).getPlanets().get(2);
		Building home = mine.getUniverses().get(0).getGalaxies().get(0).getSolarSystems().get(0).getPlanets().get(2).getContinents().get(0).getCountries().get(1).getStates().get(0).getCommunities().get(0).getCities().get(0).getNeigborhoods().get(0).getStreets().get(0).getBlocks().get(0).getBuildings().get(0);
//		home.printAddress();
		Person Yusuf = new Person();
		Person Malik = new Person();
		Yusuf.setStrength(19);
		Malik.setStrength(18);
		Yusuf.fight(Malik);
//		mine.find("Laniakea").find("MilkyWay").find("theSolarSystem").find("Earth").find("North America").find("USA").find("California").find("Bay Area").find("San Jose").find("Berryessa").find("Fumia Pl").find("18").find("1806").printAddress();
		
		Multiverse newLife = (Multiverse) starterKit().get(0);
		Planet newWorld = newLife.getWorld();
		Building newHome = newWorld.myAddress();
		Person dad = (Person) starterKit().get(1);
		Person mom = (Person) starterKit().get(2);
		Person me = new Person("Baby");
		me.setFather(dad);
		me.setMother(mom);
		me.setPlace(newHome);
		System.out.println(me.introduction() + " and I live at ");
		me.getPlace().printAddress();
		System.out.println();
		System.out.println(starterKit());
		System.out.println();
		System.out.println(myStart());
	}
	
	public static ArrayList starterKit() {
		ArrayList life = new ArrayList();
		life.add(new Location().setSimulation());
		life.add(new Person("Adam"));
		life.add(new Person("Eve"));
		return life;
	}
	
	public static ArrayList myStart() {
		ArrayList life = new ArrayList();
		life.add(new Location().setSimulation());			// 0 multiverse
		life.add(((Multiverse) life.get(0)).getWorld());	// 1 world
		life.add(((Planet) life.get(1)).myAddress());		// 2 home
		life.add(new Person("Mamdouh"));					// 3 dd
		life.add(new Person("Zeinab"));						// 4 dm
		life.add(new Person("Farouk"));						// 5 md
		life.add(new Person("Nadia"));						// 6 mm
		life.add(new Person("Osama"));						// 7 db
		life.add(new Person("Ashraf"));						// 8 db
		life.add(new Person("Hesham"));						// 9 d
		life.add(new Person("Hatem"));						// 10 mb
		life.add(new Person("Heba"));						// 11 m
		life.add(new Person("Yusuf"));						// 12 me
		life.add(new Person("Leena"));						// 13 s
		life.add(new Person("Safa"));						// 14 s
		life.add(new Person("Misk"));						// 15 s
		return life;
	}
}
