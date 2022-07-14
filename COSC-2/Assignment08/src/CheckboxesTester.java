import javax.swing.JFrame;

//----------------------------------------------------
// Programmer: Justin Jewell
// Course: COSC 1437 Section 007
// Semester: Spring 2022
// Assignment #: 8
// Due Date: March 2, 2022
//----------------------------------------------------

public class CheckboxesTester {

	public static void main(String[] args) {
		// instantiate a frame
		// from the class JFrame
		JFrame frame = new JFrame("Fun with checkboxes!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// the primary panel is added
		// to the frame and made visible
		frame.getContentPane().add(new CheckboxesGUI());
		frame.pack();
		frame.setVisible(true);

	} // end method main
} // end class CheckboxesTester
