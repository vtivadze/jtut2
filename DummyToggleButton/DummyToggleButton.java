import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DummyToggleButton extends JFrame {
	private JToggleButton tb;

	public DummyToggleButton() {
		tb = new JToggleButton("<html><u>Y</u>es?<p>No?");
		tb.setMnemonic(KeyEvent.VK_Y);
		tb.setToolTipText("Make choose");
		add(tb);

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DummyToggleButton();
	}
}