package Swing;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;

public class Main {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);//Determina si se muestra (true) o no (false).
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//El proceso termina.
	}
}

class MyFrame extends JFrame{
	
	public MyFrame() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		/*Dimension screenSize = toolkit.getScreenSize();
		
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		int posWidth =  screenWidth/2;
		int posHeight = screenHeight/2;
		
		setBounds(200,200,posWidth,posHeight);//Permite centrarlo*/
		
		setBounds(200,200,405,500);
		setLocationRelativeTo(null);
		/*setSize(200,200);
		setSize(screenWidth,screenHeight);//Permite obtener los datos del dispositivo en el cual se va a estar ejecutando
		setLocation(10,20);
		setTitle("My first window");*/
		setTitle("Registro");
		setResizable(false);
		
		Register panel = new Register();
		add(panel);
		
		PanelComboBox panel2 = new PanelComboBox();
		add(panel2);
		
		PanelRadioButton panel3 = new PanelRadioButton();
		add(panel3);
		
		PanelSlider panel4 = new PanelSlider();
		add(panel4);
		
		JTabbedPane panelComponents = new JTabbedPane();
		
		panelComponents.addTab("Registro", panel);
		panelComponents.addTab("ComboBox", panel2);
		panelComponents.addTab("RadioButton", panel3);
		panelComponents.addTab("PanelSlider", panel4);
		
		TitledBorder sexChooseBorder = new TitledBorder("Sexo");
		/*sexChooseBorder.setTitleJustification(ABORT);
		sexChooseBorder.setTitle("");*/
		
		add(new JPanel().add(panelComponents));
	}
}
