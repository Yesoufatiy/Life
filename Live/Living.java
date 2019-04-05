import java.util.ArrayList;
import java.util.Scanner;

public class Living {
	static Person player;
	static Animal plays;
	static ArrayList<Creature> environment;
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		new Creature().stats(((Person) ((ArrayList<Creature>) myStart().get(4)).get(9)));
		new Creature().stats(new Lion());
		new Creature().stats(new Elephant());
		new Creature().stats(new Hawk());
		System.out.println("How would you like to start? The currently available options are:");
		System.out.println("'s' for basic starter kit");
		System.out.println("'y' for a start based on Yusuf's Life");
		System.out.println("'a' for an animal player's perspective");
		System.out.println("'Q' for QUITTING");
		String reading = reader.nextLine();
		while (!reading.equals("Q")) {
			if (reading.equals("s")) {
				ArrayList surroundings = starterKit();
				player = ((Person) ((ArrayList<Creature>) surroundings.get(3)).get(2));
				environment = ((Creature) surroundings.get(2)).getCharacters();
				System.out.println(player.introduction());
				while (!reading.equals("D")) {
					actions();
					reading = reader.nextLine();
					if (!reading.equals("D"))
						act(reading);
				}
			} else if (reading.equals("y")) {
				ArrayList surroundings = myStart();
				player = ((Person) ((ArrayList<Creature>) surroundings.get(4)).get(9));
				environment = ((Creature) surroundings.get(3)).getCharacters();
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
				environment = ((Creature) surroundings.get(2)).getCharacters();
				plays = animals();
				if (!plays.getSpecies().equals("animal")) {
					System.out.println("You are now a " + plays.getSpecies());
					while (!reading.equals("D")) {
						actions();
						reading = reader.nextLine();
						if (reading.equals("f"))
							System.out.println("Animals cannot do that.");
						else if (reading.equals("a"))
							animalistic();
						else if (reading.equals("i")) {
							System.out.println("Here is your inventory:");
							System.out.println(plays.getResources());
						} else if (reading.equals("s")) {
							System.out.println("Here are your stats:");
							plays.stats(plays);
						} else if (!reading.equals("D"))
							act(reading);
					}
				}
			} else {
				System.out.println("I am a little human being child kid cry baby and I am homeless and alone and I have nothing.");
				actions();
				reading = reader.nextLine();
				if (!reading.equals("D"))
					System.out.println("You were not able to accomplish that.");
			}
			System.out.println();
			System.out.println("Your life has ended. How would you like to restart? The currently available options are:");
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
		life.add(new Creature());									// 2 creature
		ArrayList<Creature> all = ((Creature) life.get(2)).getCharacters();
		all.add(new Person("Adam"));								// 00 man
		all.add(new Person("Eve"));									// 01 woman
		all.add(new Person("Baby"));								// 02 kid
		((Person) all.get(2)).setFather((Person) all.get(0));
		((Person) all.get(2)).setMother((Person) all.get(1));
		life.add(all);												// 3 characters
		return life;
	}
	
	public static ArrayList myStart() {
		ArrayList life = new ArrayList();
		life.add(new Location().setSimulation());					// 0 multiverse
		life.add(((Multiverse) life.get(0)).getWorld());			// 1 world
		life.add(((Planet) life.get(1)).myAddress());				// 2 home
		life.add(new Creature());									// 3 creature
		ArrayList<Creature> all = ((Creature) life.get(3)).getCharacters();
		all.add(new Person("Mamdouh"));								// 00 dd
		all.add(new Person("Zeinab"));								// 01 dm
		all.add(new Person("Farouk"));								// 02 md
		all.add(new Person("Nadia"));								// 03 mm
		all.add(new Person("Osama"));								// 04 db
		((Person) all.get(4)).setFather((Person) all.get(0));
		((Person) all.get(4)).setMother((Person) all.get(1));
		all.add(new Person("Ashraf"));								// 05 db
		((Person) all.get(5)).setFather((Person) all.get(0));
		((Person) all.get(5)).setMother((Person) all.get(1));
		all.add(new Person("Hesham"));								// 06 d
		((Person) all.get(6)).setFather((Person) all.get(0));
		((Person) all.get(6)).setMother((Person) all.get(1));
		all.add(new Person("Hatem"));								// 07 mb
		((Person) all.get(7)).setFather((Person) all.get(2));
		((Person) all.get(7)).setMother((Person) all.get(3));
		all.add(new Person("Heba"));								// 08 m
		((Person) all.get(8)).setFather((Person) all.get(2));
		((Person) all.get(8)).setMother((Person) all.get(3));
		all.add(new Person("Yusuf"));								// 09 me
		((Person) all.get(9)).setFather((Person) all.get(6));
		((Person) all.get(9)).setMother((Person) all.get(8));
		((Person) all.get(9)).setPlace((Building) life.get(2));
		all.add(new Person("Leena"));								// 010 s
		((Person) all.get(10)).setFather((Person) all.get(6));
		((Person) all.get(10)).setMother((Person) all.get(8));
		all.add(new Person("Safa"));								// 011 s
		((Person) all.get(11)).setFather((Person) all.get(6));
		((Person) all.get(11)).setMother((Person) all.get(8));
		all.add(new Person("Misk"));								// 012 s
		((Person) all.get(12)).setFather((Person) all.get(6));
		((Person) all.get(12)).setMother((Person) all.get(8));
		all.add(new Person("Arwa"));								// 013 c
		((Person) all.get(13)).setFather((Person) all.get(5));
		all.add(new Person("Nour"));								// 014 c
		((Person) all.get(14)).setFather((Person) all.get(5));
		all.add(new Person("Seif"));								// 015 c
		((Person) all.get(15)).setFather((Person) all.get(5));
		all.add(new Person("Mohamed"));								// 016 c
		((Person) all.get(16)).setFather((Person) all.get(4));
		new Person("Alex");
		life.add(all);												// 4 characters
		System.out.println(all);
		return life;
	}
	
	public static void actions() {
		System.out.println();
		System.out.println("What would you like to do now?");
		System.out.println("'f' for farming vegetables");
		System.out.println("'a' for attack another");
		System.out.println("'i' for look through inventory");
		System.out.println("'m' for moving to someplace new");
		System.out.println("'s' for viewing stats");
		System.out.println("'D' for DYING");
	}
	
	public static void act(String next) {
		if (next.equals("f")) {
			System.out.println("What would you like to farm?");
			System.out.println("'c' for farming carrots");
			System.out.println("'t' for farming tomatos");
			System.out.println("'p' for farming potatos");
			System.out.println("'m' for farming maize");
			System.out.println("'E' for ENDING");
			String read = reader.nextLine();
			if (read.equals("c")) {
				player.getInventory().add("carrots");
				System.out.println("You have farmed carrots.");
			} else if (read.equals("t")) {
				player.getInventory().add("tomatos");
				System.out.println("You have farmed tomatos.");
			} else if (read.equals("p")) {
				player.getInventory().add("potatos");
				System.out.println("You have farmed potatos.");
			} else if (read.equals("m")) {
				player.getInventory().add("maize");
				System.out.println("You have farmed maize.");
			} else if (read.equals("E")) {
				System.out.println("Nothing was farmed.");
			} else System.out.println("That is not a farmable option.");
		} else if (next.equals("a")) {
			System.out.println("Who would you like to attack?");
			System.out.println(environment);
			String read = reader.nextLine();
			if (!read.equals(player.getName())) {
				for (Creature character : environment) {
					if (character.getName().equals(read)) {
						if (character.isHuman()) {
							player.fight((Person) character);
						} else
							player.hunt((Animal) character);
					}
				}
			} else System.out.println("You cannot attack youself.");
		} else if (next.equals("i")) {
			System.out.println("Here is your inventory:");
			System.out.println(player.getInventory());
		} else if (next.equals("m")) {
			
		} else if (next.equals("s")) {
			System.out.println("Here are your stats:");
			player.stats(player);
		} else System.out.println("That action is not available yet.");
	}
	
	public static Animal animals() {
		System.out.println("Choose what kind of animal to take place of:");
		System.out.println("'l' for lion");
		System.out.println("'e' for elephant");
		System.out.println("'h' for hawk");
		System.out.println("'C' for CHANGING");
		String read = reader.nextLine();
		if (read.equals("l")) {
			environment.add(new Lion());
			return (Animal) environment.get(3);
		} else if (read.equals("e")) {
			environment.add(new Elephant());
			return (Animal) environment.get(3);
		} else if (read.equals("h")) {
			environment.add(new Hawk());
			return (Animal) environment.get(3);
		} else if (read.equals("C")) {
			return new Animal();
		} else System.out.println("That is not an available animal to use as a character player.");
		return new Animal();
	}
	
	public static void animalistic() {
		System.out.println("Who would you like to attack?");
		System.out.println(environment);
		String read = reader.nextLine();
		if (!read.equals(plays.getSpecies())) {
			for (Creature character : environment) {
				if (character.getName().equals(read)) {
					if (character.isHuman()) {
						plays.attack((Person) character);
					} else
						plays.eat((Animal) character);
				}
			}
		} else System.out.println("You cannot attack youself.");
	}
}
