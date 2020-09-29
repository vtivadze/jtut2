import java.awt.*;
import java.awt.event.*;

class TextTest extends Frame {
	TextTest(String s) {
		super(s);
		setLayout(null);
		setFont(new Font("Serif", Font.PLAIN, 14));

		Label l1 = new Label("Your name:", Label.RIGHT);
		l1.setBounds(30, 30, 70, 25);
		add(l1);

		Label l2 = new Label("Password:", Label.RIGHT);
		l2.setBounds(30, 60, 70, 25);
		add(l2);

		TextField tf1 = new TextField(30);
		tf1.setBounds(110, 30, 160, 25);
		add(tf1);

		TextField tf2 = new TextField(30);
		tf2.setBounds(110, 60, 160, 25);
		tf2.setEchoChar('*');
		add(tf2);

		TextField tf3 = new TextField("Enter here your order", 30);
		tf3.setBounds(20, 100, 250, 30);
		add(tf3);

		TextArea ta = new TextArea("Your order:", 5, 50, TextArea.SCROLLBARS_NONE);
		ta.setEditable(false);
		ta.setBounds(20, 150, 250, 140);
		add(ta);

		Button b1 = new Button("Apply");
		b1.setBounds(290, 180, 100, 30);
		add(b1);

		Button b2 = new Button("Cancel");
		b2.setBounds(290, 220, 100, 30);
		add(b2);

		Button b3 = new Button("Logout");
		b3.setBounds(290, 260, 100, 30);
		add(b3);

		setSize(410, 310);
		setVisible(true);
	}

	public static void main(String[] args) {
		Frame f = new TextTest("  Text Fields");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}