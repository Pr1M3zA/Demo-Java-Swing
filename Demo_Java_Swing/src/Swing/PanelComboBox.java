package Swing;

import javax.swing.JComboBox;
import java.awt.Toolkit;
import javax.swing.*;

public class PanelComboBox extends JPanel {
	public PanelComboBox() {
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		setLayout(null);
		String[] frutas = {"Manzana", "Naranja", "Pera", "Uva"};
		JComboBox<String> listaFrutas = new JComboBox<String>(frutas);
		listaFrutas.setSelectedIndex(1);
		listaFrutas.setBounds(100,40,100,30);
		add(listaFrutas);
	}
}
