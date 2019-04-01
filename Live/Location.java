import java.util.Arrays;

public class Location {
	public Multiverse setSimulation() {
		return new Multiverse(new Universe("Laniakea", new Galaxy("MilkyWay", new SolarSystem("theSolarSystem",
				Arrays.asList(new Planet[] {new Planet("Mercury"), new Planet("Venus"), new Planet("Earth",
						Arrays.asList(new Continent[] {new Continent("North America",
								Arrays.asList(new Country[] {new Country("Canada"), new Country("USA",
										Arrays.asList(new State[] {new State("California", new Community("Bay Area",
												Arrays.asList(new City[] {new City("San Jose", new Neigborhood("Berryessa", new Street("Fumia Pl", new Block("18", new House("1806"))))),
														new City("Santa Clara"), new City("Fremont")}))), new State("New York"), new State("Florida"), new State("Hawaii")})), new Country("Mexico")})),
								new Continent("South America"), new Continent("Europe"), new Continent("Africa"), new Continent("Asia"), new Continent("Australia"), new Continent("Antarctica")})),
						new Planet("Mars"), new Planet("Jupiter"), new Planet("Saturn"), new Planet("Uranus"), new Planet("Neptune"), new Planet("Pluto")})))));
//		Multiverse existence = new Multiverse();
//		Universe Laniakea = new Universe();
//		existence.getUniverses().add(Laniakea);
//		Galaxy MilkyWay = new Galaxy();
//		Laniakea.getGalaxies().add(MilkyWay);
//		SolarSystem theSolarSystem = new SolarSystem();
//		MilkyWay.getSolarSystems().add(theSolarSystem);
//		Planet Mercury = new Planet();
//		Planet Venus = new Planet();
//		Planet Earth = new Planet();
//		Planet Mars = new Planet();
//		Planet Jupiter = new Planet();
//		Planet Saturn = new Planet();
//		Planet Uranus = new Planet();
//		Planet Neptune = new Planet();
//		Planet Pluto = new Planet();
//		theSolarSystem.getPlanets().add(Mercury);
//		theSolarSystem.getPlanets().add(Venus);
//		theSolarSystem.getPlanets().add(Earth);
//		theSolarSystem.getPlanets().add(Mars);
//		theSolarSystem.getPlanets().add(Jupiter);
//		theSolarSystem.getPlanets().add(Saturn);
//		theSolarSystem.getPlanets().add(Uranus);
//		theSolarSystem.getPlanets().add(Neptune);
//		theSolarSystem.getPlanets().add(Pluto);
//		Moon moon = new Moon();
//		Earth.getMoons().add(moon);
//		Continent NorthAmerica = new Continent();
//		Continent SouthAmerica = new Continent();
//		Continent Europe = new Continent();
//		Continent Africa = new Continent();
//		Continent Asia = new Continent();
//		Continent Australia = new Continent();
//		Continent Antarctica = new Continent();
//		List<Continent> a = Arrays.asList(new Continent[] {new Continent("North America"), new Continent("South America"), new Continent("Europe"), new Continent("Africa"), new Continent("Asia"), new Continent("Australia"), new Continent("Antarctica")});
//		Earth.getContinents().add(NorthAmerica);
//		Earth.getContinents().add(SouthAmerica);
//		Earth.getContinents().add(Europe);
//		Earth.getContinents().add(Africa);
//		Earth.getContinents().add(Asia);
//		Earth.getContinents().add(Australia);
//		Earth.getContinents().add(Antarctica);
//		Country Canada = new Country();
//		Country USA = new Country();
//		Country Mexico = new Country();
//		NorthAmerica.getCountries().add(Canada);
//		NorthAmerica.getCountries().add(USA);
//		NorthAmerica.getCountries().add(Mexico);
//		State California = new State();
//		USA.getStates().add(California);
//		Community BayArea = new Community();
//		California.getCommunities().add(BayArea);
//		City SanJose = new City();
//		City SantaClara = new City();
//		City Fremont = new City();
//		BayArea.getCities().add(SanJose);
//		BayArea.getCities().add(SantaClara);
//		BayArea.getCities().add(Fremont);
//		Neigborhood Berryessa = new Neigborhood();
//		SanJose.getNeigborhoods().add(Berryessa);
//		Street FumiaCt = new Street();
//		Berryessa.getStreets().add(FumiaCt);
//		Block eighteens = new Block();
//		FumiaCt.getBlocks().add(eighteens);
//		House eighteen06 = new House();
//		eighteens.getBuildings().add(eighteen06);
//		return existence;
	}
}
