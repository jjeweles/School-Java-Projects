//----------------------------------------------------
// Programmer:	Justin Jewell
// Course:		COSC 1437 Section 007
// Semester:	Spring 2022
// Assignment #: 04
// Due Date:	February 9, 2022
//----------------------------------------------------

import javax.swing.JFrame;

public class IncrementDecrementTester {

	public static void main(String[] args) {
		// create a frame and add a pane to
		// it and make it visible
		JFrame frame = new JFrame("Increment / Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new IncrementDecrementPanel());
		frame.pack();
		frame.setVisible(true);

	} // end method main
} // end class IncrementDecrementTester
