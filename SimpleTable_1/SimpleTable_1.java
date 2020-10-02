import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class SimpleTable_1 extends JFrame {
	SimpleTable_1() {
		super("  The table with immutable first column");
		setLayout(new FlowLayout());

		JTable t1 = new JTable(new FirstColumnTableModel());
		JScrollPane jsp = new JScrollPane(t1);
		jsp.setSize(550, 450);
		add(jsp);

		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SimpleTable_1();
	}
}

class FirstColumnTableModel extends AbstractTableModel {
	protected Object[][] data = {
		{"Text", Color.black, true},
		{"Background", new Color(130, 56, 187), true},
		{"Border", new Color(200, 45, 125), true},
	};

	protected String[] colNames = {"Elements", "Color", "Choose"};

	public FirstColumnTableModel() {
		super();
	}

	public int getRowCount() { return data.length; }
	public int getColumnCount() { return data[0].length; }
	public Object getValueAt(int row, int col) { return data[row][col]; }

	public void setValueAt(Object value, int row,  int col) {
		if (col != 0) data[row][col] = value;
	}

	public boolean isCellEditable(int row, int col) {
		return col != 0;
	}

	public Class getColumnClass(int col) {
		return data[0][col].getClass();
	}

	public String getColumnName(int col) {
		return colNames[col];
	}
}