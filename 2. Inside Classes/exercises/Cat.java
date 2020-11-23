package exercises;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--; // decrement by 1, Int member Class
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	void showStatus() {
		if (name == null) {
			System.out.println("The machine cannot help you. We don't know nothing!");
		} else {
			System.out.println("Name: " + this.name +"\nLives left: " + this.lives);
		}
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat cat_1 = new Cat("Geocondo");

		// 1. Make the Cat meow
		cat_1.meow();
		
		// 2. Get the Cat to print it's name
		cat_1.printName();

		// 3. Kill the Cat!
		cat_1.kill();
		cat_1.kill();
		cat_1.kill();
		cat_1.kill();
		cat_1.kill();
		cat_1.showStatus();
		cat_1.kill();
		cat_1.kill();
		cat_1.kill();
		cat_1.kill();

	}
}



