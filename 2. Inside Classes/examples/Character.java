package examples;

public class Character {

	private String name;
	private String species;

	/* The Constructor: for creating instances */
	public Character(String name, String species) {
		this.name = name; // this.name -> a member variable associated with class
		this.species = species; // after = symbol -> parameter passed when the constructor will be called
	}

	Character bilbo = new Character("Bilbo", "Hobbit");
	Character legolas = new Character("Legolas", "Elf");

}
