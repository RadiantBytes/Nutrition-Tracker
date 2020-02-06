import javax.swing.*;

public class GUIFrame extends JFrame {

	int windowHeight = 600;
	int windowWidth = 400;
	
	private DatabaseManager myBD;

	
	public GUIFrame() {
		JFrame frame = new JFrame("Nutrition Tracker");
		JButton button1 = new JButton("Press");
		
		frame.setSize(windowHeight, windowWidth);
		
		System.out.println("Hit");
	}
	
}
