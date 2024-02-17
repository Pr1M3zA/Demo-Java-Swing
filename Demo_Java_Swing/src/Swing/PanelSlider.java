package Swing;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class PanelSlider extends JPanel{
	public PanelSlider() {
		JSlider slider = new JSlider(0,100,10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		add(slider);
	}
}
