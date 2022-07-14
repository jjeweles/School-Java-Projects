import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComboBoxesGUI extends JPanel {
	private JLabel lblName, lblDegree;
	private JTextField txtName;
	private JComboBox cboInfo;
	private String[] personalInfo = { "Doctorate", "Master", "Bachelor" };
	private JLabel lblOutput;

	public ComboBoxesGUI() {
		// create a label that will
		// be used for display
		lblOutput = new JLabel("-----------");

		// create labels and text
		// fields for name
		lblName = new JLabel("What is your name?");
		txtName = new JTextField(12);

		lblDegree = new JLabel("What kind of degree do you want?");

		// create a combo box for degrees
		cboInfo = new JComboBox(personalInfo);
		cboInfo.addActionListener(new cboListener());

		// add all controls to panel
		add(lblName);
		add(txtName);
		add(lblDegree);
		add(cboInfo);
		add(lblOutput);

		// set up size and control of panel
		setPreferredSize(new Dimension(325, 125));
		setBackground(Color.WHITE);

	} // end constructor ComboBoxesGUI

	private class cboListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			int selection;
			String output = "";
			// determine which combo box
			// was selected and act appropriately
			selection = cboInfo.getSelectedIndex();
			output = txtName.getText() + ", ";

			switch (selection) {
			case 0: // Doctorate
				output += " going for the top degree I see: " + personalInfo[selection];
				break;
			case 1: // Master
				output += " good decision that you are doing this: " + personalInfo[selection];
				break;
			case 2: // Bachelor
				output += " go and get that degree now: " + personalInfo[selection];
				break;
			default:
				output += "Error! Unkown degree!";
			} // end switch statement

			// display this label!
			lblOutput.setText(output);

		} // end method actionPerfomed
	} // end class cboListener
} // end class ComboBoxesGUI