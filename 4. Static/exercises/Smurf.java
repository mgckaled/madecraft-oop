package exercises;

public class Smurf {

	private final String name;

	public Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
