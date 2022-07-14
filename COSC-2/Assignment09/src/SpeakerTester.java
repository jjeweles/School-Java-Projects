import javax.swing.JOptionPane;

//----------------------------------------------------
// Programmer: Justin Jewell
// Course: COSC 1437 Section 007
// Semester: Spring 2022
// Assignment #: 9
// Due Date: March 2, 2022
//----------------------------------------------------

public class SpeakerTester {

	public static void main(String[] args) {
		// declare object variables
		// to be used in program
		Speaker rover, aristotle, someone;

		// instantiate 'rover' to be a 'Dog' object
		rover = new Dog("Rover");
		rover.speak();
		rover.announce("Ruff ruff to all my fellows dogs!");

		// instantiate 'aristotle' to be a 'Philosopher' object
		aristotle = new Philosopher("Aristotle", "A true friend is one soul in two bodies.");
		aristotle.speak();
		aristotle.announce("All men by nature desire to know.");

		// have aristotle pontificate!
		((Philosopher) aristotle).pontificate();

		// instantiate 'someone' to be a 'Dog' object
		someone = new Dog("Someone");
		someone.speak();
		someone.announce("Somebody thinks he is a dog!");

		// instantiate 'someone' to be a 'Philosopher' object
		someone = new Philosopher("Someone", "I think like a philosopher!");
		someone.speak();
		someone.announce("Somebody thinks he is smart!");

		// have 'someone' pontificate!
		((Philosopher) someone).pontificate();

		JOptionPane.showMessageDialog(null, "This program was written by Justin Jewell." + "\nEnd of program.");
	} // end method main
} // end class SpeakerTester
