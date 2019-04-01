import java.util.ArrayList;
import java.util.Scanner;

public class Living {
	static Person player;
	public static void main(String[] args) {
		System.out.println("How would you like to start? The currently available options are:");
		System.out.println("'s' for basic starter kit");
		System.out.println("'y' for a start based on Yusuf's Life");
		System.out.println("'a' for an animal player's perspective");
		System.out.println("'Q' for QUITTING");
		Scanner reader = new Scanner(System.in);
		String reading = reader.nextLine();
		while (!reading.equals("Q")) {
			if (reading.equals("s")) {
				player = ((Person) starterKit().get(4));
				System.out.println(player.introduction());
				while (!reading.equals("D")) {
					actions();
					reading = reader.nextLine();
					if (!reading.equals("D"))
						act(reading);
				}
			} else if (reading.equals("y")) {
				player = ((Person) myStart().get(12));
				System.out.println(player.introduction() + " lives at ");
				player.getPlace().printAddress();
				while (!reading.equals("D")) {
					actions();
					reading = reader.nextLine();
					if (!reading.equals("D"))
						act(reading);
				}
			} else if (reading.equals("a")) {
				ArrayList surroundings = starterKit();
				Animal player;
				System.out.println("Choose what kind of animal to take place of:");
				player = new Lion();
				System.out.println("You are now a " + player.getSpecies());
				while (!reading.equals("D")) {
					actions();
					reading = reader.nextLine();
					if (reading.equals("f"))
						System.out.println("Animals cannot do that.");
					else if (reading.equals("i")) {
						System.out.println("Here is your inventory:");
						System.out.println(player.getResources());
					} else if (!reading.equals("D"))
						act(reading);
				}
			} else {
				System.out.println(
						"I am a little human being child kid cry baby and I am homeless and alone and I have nothing.");
				System.out.println("What would you like to do now?");
				System.out.println("'f' for farming vegetables");
				System.out.println("'a' for attack another");
				System.out.println("'i' for look through inventory");
				System.out.println("'m' for moving to someplace new");
				System.out.println("'D' for DYING");
				reading = reader.nextLine();
				if (!reading.equals("D"))
					System.out.println("You were not able to accomplish that.");
			}
			System.out.println(
					"Your life has ended. How would you like to restart? The currently available options are:");
			System.out.println("'s' for basic starter kit");
			System.out.println("'y' for a start based on Yusuf's Life");
			System.out.println("'a' for an animal player's perspective");
			System.out.println("'Q' for QUITTING");
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
	
	public static void actions() {
		System.out.println("What would you like to do now?");
		System.out.println("'f' for farming vegetables");
		System.out.println("'a' for attack another");
		System.out.println("'i' for look through inventory");
		System.out.println("'m' for moving to someplace new");
		System.out.println("'D' for DYING");
	}
	
	public static void act(String next) {
		if (next.equals("f")) {
			vegs();
		} else if (next.equals("a")) {
			
		} else if (next.equals("i")) {
			System.out.println("Here is your inventory:");
			System.out.println(player.getInventory());
		} else if (next.equals("m")) {
			
		} else System.out.println("That action is not available yet.");
	}
	
	public static void vegs() {
		System.out.println("What would you like to farm?");
		System.out.println("'c' for farming carrots");
		System.out.println("'t' for farming tomatos");
		System.out.println("'p' for farming potatos");
		System.out.println("'m' for farming maize");
		System.out.println("'E' for ENDING");
	}
}
