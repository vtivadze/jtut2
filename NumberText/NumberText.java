import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class NumberText extends JFrame {
	JTextField tf = new JTextField(5);
	JLabel l = new JLabel("Enter digits:");

	NumberText() {
		super("text");
		setLayout(new FlowLayout());

		((PlainDocument)tf.getDocument()).
			setDocumentFilter(new  NumberFilter());

		tf.setSelectedTextColor(Color.red);
		tf.setSelectionColor(Color.white);
		tf.setCaretColor(Color.red);
		l.setLabelFor(tf);
		add(l);
		add(tf);

		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NumberText();
	}

	class NumberFilter extends DocumentFilter {
		public void insertString(FilterBypass fb, int pos, String text, AttributeSet attr) throws BadLocationException {
			try {
				Integer.parseInt(text);
			} catch (Exception e) {
				super.insertString(fb, 0, "", attr);
				return;
			}

			super.insertString(fb, pos, text, attr);
		}
	}
}