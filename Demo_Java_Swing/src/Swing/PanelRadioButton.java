package Swing;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelRadioButton extends JPanel {
	public PanelRadioButton() {
		JRadioButton male = new JRadioButton("Masculino");
		//male.setBounds(205, 90, 120, 30);
		JRadioButton female = new JRadioButton("Femenino");
		//female.setBounds(75, 90, 120, 30);
		add(male);
		add(female);	
	}
}
