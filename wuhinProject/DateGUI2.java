package wuhinProject;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DateGUI2 {
	private DefaultTableModel tableModel = new DefaultTableModel();
	private JTable table = new JTable(tableModel);
	
	public DateGUI2(UnsortedDate212List unsorted, SortedDate212List sorted) {
		JFrame frame = new JFrame();
		
		JPanel screen = new JPanel();
		screen.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		screen.setLayout(new BorderLayout());
		screen.add(table);
		
		
		frame.add(screen, BorderLayout.CENTER);
		screen.add(table.getTableHeader(), BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setTitle("Sorting an Array of Dates");
		frame.pack();
		frame.setBounds(400, 400, 400, 400);
		frame.setVisible(true);
		
		String[] dateUnsorted = new String[unsorted.length];
		String[] dateSorted = new String[sorted.length];
		Date212Node iterator = unsorted.head;
		Date212Node iterator2 = sorted.head;
		for(int i=0; i<dateUnsorted.length; i++) {
			dateUnsorted[i] = iterator.data.toString();
			dateSorted[i] = iterator2.data.toString();
			iterator = iterator.next;
			iterator2 = iterator2.next;
		}
		tableModel.addColumn(" ");
		tableModel.addColumn("Unsorted LinkList");
		tableModel.addColumn("Sorted LinkedList");
		for(int j=0; j<dateUnsorted.length; j++) {
			tableModel.addRow(new Object[] {String.valueOf(j+1),dateUnsorted[j], dateSorted[j]});
		}
		
	}
	public JTable getTable() {
		return this.table;
	}
	public DefaultTableModel getTableModel() {
		return this.tableModel;
	}
	
	

}