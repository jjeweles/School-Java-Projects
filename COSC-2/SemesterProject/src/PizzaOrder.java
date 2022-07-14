import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

//----------------------------------------------------
// Programmer: Justin Jewell
// Course: COSC 1437 Section 007
// Semester: Spring 2022
// Assignment #: Semester Project
// Due Date: March 16, 2022
//----------------------------------------------------

public class PizzaOrder {

	public static void main(String[] args) {
		int x, y; // used to center the frame

		// instantiate a frame
		JFrame frame = new JFrame("Justin's Pizza!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// instantiate our 'primary' panel for our frame
		PizzaControls primary = new PizzaControls();

		// add this panel to the frame
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);

		// center frame on screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension size = frame.getSize();
		screenSize.height = screenSize.height / 2;
		screenSize.width = screenSize.width / 2;
		size.height = size.height / 2;
		size.width = size.width / 2;
		x = screenSize.height - size.height;
		y = screenSize.width - size.width;
		frame.setLocation(x, y);

	} // end method main

} // end class PizzaOrder
