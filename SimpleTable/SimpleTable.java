import java.awt.*;
import javax.swing.*;

public class SimpleTable extends JFrame {
	SimpleTable() {
		super("  My Table");
		setLayout(new FlowLayout());

		String[][] data = {{"-27","32"}, {"-45","55"}};
		String[] colNames = {"Yesterday", "Today"};

		JTable t1 = new JTable(data, colNames);

		add(new JScrollPane(t1));

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleTable();
	}
}