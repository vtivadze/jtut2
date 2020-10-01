import java.awt.*;
import javax.swing.*;

public class SwingApplicationTemplate extends JFrame {
	public SwingApplicationTemplate(String title) {
		super(title);
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] s) {
		new SwingApplicationTemplate("Title of main window");
	}
}