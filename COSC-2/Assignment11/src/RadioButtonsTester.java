import javax.swing.JFrame;

//----------------------------------------------------
// Programmer: Justin Jewell
// Course: COSC 1437 Section 007
// Semester: Spring 2022
// Assignment #: 11
// Due Date: March 9, 2022
//----------------------------------------------------

public class RadioButtonsTester {

	public static void main(String[] args) {

		// instantiate a frame
		// from the class JFrame
		JFrame frame = new JFrame("Fun with radio buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// the primary panel is added
		// to the frame and made visible
		frame.getContentPane().add(new RadioButtonsGUI());
		frame.pack();
		frame.setVisible(true);

	} // end method main

} // end class RadioButtonsTester
