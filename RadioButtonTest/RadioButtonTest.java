import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.*;

class RadioButtonTest extends JFrame {
	public RadioButtonTest() {
		setBackground(Color.white);
		setLayout(new FlowLayout());

		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.setBorder(BorderFactory.createEtchedBorder());

		JRadioButton rb1 = new JRadioButton("<html><u>R</u>ed<p>background");
		rb1.setMnemonic(KeyEvent.VK_R);
		rb1.setToolTipText("<html>Your are choosing<p>red background");
		rb1.addActionListener(this);
		rb1.setActionCommand("red");

		JRadioButton rb2 = new JRadioButton("<html><u>G</u>reen<p>background");
		rb2.setMnemonic(KeyEvent.VK_G);
		rb2.setToolTipText("<html>Your are choosing<p>green background");
		rb2.addActionListener(this);
		rb2.setActionCommand("green");

		JRadioButton rb3 = new JRadioButton("<html><u>B</u>lue<p>background");
		rb3.setMnemonic(KeyEvent.VK_B);
		rb3.setToolTipText("<html>Your are choosing<p>blue background");
		rb3.addActionListener(this);
		rb3.setActionCommand("blue");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1); bg.add(rb2); bg.add(rb3);

		p.add(rb1); p.add(rb2); p.add(rb3);
		add(p);

		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonTest();
	}
}