public class Dog implements Speaker {
	// declare instance field
	private String name;

	public Dog(String inName) {
		name = inName;
	}

	// implement two methods from Speaker interface
	public void speak() {
		System.out.println(name + " says: Woof!");
	}

	// implement abstract methods from Speaker interface
	public void announce(String str) {
		System.out.println(name + " playfully announces: " + str);
	}
} // end class Dog