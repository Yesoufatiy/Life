import java.util.ArrayList;
import java.util.Scanner;

public class Living {
	public static void main(String[] args) {
		System.out.println("How would you like to start? The currently available options are:");
		System.out.println("'s' for basic starter kit");
		System.out.println("'y' for a start based on Yusuf's Life");
		Scanner reader = new Scanner(System.in);
		String reading = reader.nextLine();
		while (!reading.equals("Q")) {
			if (reading.equals("s")) {
				System.out.println(((Person) starterKit().get(4)).introduction());
			} else if (reading.equals("y")) {
				System.out.println(((Person) myStart().get(12)).introduction() + " lives at ");
				((Person) myStart().get(12)).getPlace().printAddress();
			} else {
				System.out.println("I am a little human being child kid and I am homeless and alone and I have nothing.");
			}
			reading = reader.nextLine();
		}
	}
	
	public static ArrayList starterKit() {
		ArrayList life = new ArrayList();
		life.add(new Location().setSimulation());					// 0 multiverse
		life.add(((Multiverse) life.get(0)).getWorld());			// 1 world
		life.add(new Person("Adam"));								// 2 man
		life.add(new Person("Eve"));								// 3 woman
		life.add(new Person("Baby"));								// 4 kid
		((Person) life.get(4)).setFather((Person) life.get(2));
		((Person) life.get(4)).setMother((Person) life.get(3));
		return life;
	}
	
	public static ArrayList myStart() {
		ArrayList life = new ArrayList();
		life.add(new Location().setSimulation());					// 0 multiverse
		life.add(((Multiverse) life.get(0)).getWorld());			// 1 world
		life.add(((Planet) life.get(1)).myAddress());				// 2 home
		life.add(new Person("Mamdouh"));							// 3 dd
		life.add(new Person("Zeinab"));								// 4 dm
		life.add(new Person("Farouk"));								// 5 md
		life.add(new Person("Nadia"));								// 6 mm
		life.add(new Person("Osama"));								// 7 db
		((Person) life.get(7)).setFather((Person) life.get(3));
		((Person) life.get(7)).setMother((Person) life.get(4));
		life.add(new Person("Ashraf"));								// 8 db
		((Person) life.get(8)).setFather((Person) life.get(3));
		((Person) life.get(8)).setMother((Person) life.get(4));
		life.add(new Person("Hesham"));								// 9 d
		((Person) life.get(9)).setFather((Person) life.get(3));
		((Person) life.get(9)).setMother((Person) life.get(4));
		life.add(new Person("Hatem"));								// 10 mb
		((Person) life.get(10)).setFather((Person) life.get(5));
		((Person) life.get(10)).setMother((Person) life.get(6));
		life.add(new Person("Heba"));								// 11 m
		((Person) life.get(11)).setFather((Person) life.get(5));
		((Person) life.get(11)).setMother((Person) life.get(6));
		life.add(new Person("Yusuf"));								// 12 me
		((Person) life.get(12)).setFather((Person) life.get(9));
		((Person) life.get(12)).setMother((Person) life.get(11));
		((Person) life.get(12)).setPlace((Building) life.get(2));
		life.add(new Person("Leena"));								// 13 s
		((Person) life.get(13)).setFather((Person) life.get(9));
		((Person) life.get(13)).setMother((Person) life.get(11));
		life.add(new Person("Safa"));								// 14 s
		((Person) life.get(14)).setFather((Person) life.get(9));
		((Person) life.get(14)).setMother((Person) life.get(11));
		life.add(new Person("Misk"));								// 15 s
		((Person) life.get(15)).setFather((Person) life.get(9));
		((Person) life.get(15)).setMother((Person) life.get(11));
		return life;
	}
}
