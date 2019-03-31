
public class Living {
	public static void main(String[] args) {
		Person Adam = new Person();
		Person Eve = new Person();
		Person Yusuf = new Person();
		Person Malik = new Person();
		Yusuf.setStrength(19);
		Malik.setStrength(18);
		System.out.println(Yusuf.eat(Malik));
	}
}
