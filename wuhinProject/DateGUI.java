package wuhinProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import wuhinProject.Date212;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DateGUI {
	private DefaultTableModel tableModel = new DefaultTableModel();
	private JTable table = new JTable(tableModel);
	
	public DateGUI(String dates) {
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
		String[] date2 = sort(dates);
		StringTokenizer date = new StringTokenizer(dates,",");
		String[] date1 = new String[date2.length];
		int i=0;
		while(date.hasMoreTokens()) 
			date1[i++] = date.nextToken();
		
		
		tableModel.addColumn(" ");
		tableModel.addColumn("Input File Dates");
		tableModel.addColumn("Sorted Dates (Ascending Order)");
		for(int j=0; j<date1.length; j++) {
			tableModel.addRow(new Object[] {String.valueOf(j+1),date1[j], date2[j]});
		}
		
	}
	
	public JTable getTable() {
		return this.table;
	}
	public DefaultTableModel getTableModel() {
		return this.tableModel;
	}
	
	public static String[] sort(String dates) {
		StringTokenizer date = new StringTokenizer(dates, ",");
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		while(date.hasMoreTokens()) {
			list.add(date.nextToken());
		}
		
		
		Date212[] output = new Date212[list.size()];
		for(int i=0; i<output.length; i++) {
			Date212 temp = new Date212(list.get(0));
			for(int j=0; j<list.size(); j++) {
				Date212 temp2 = new Date212(list.get(j));
				if(temp.compareTo(temp2)>0)
					temp = temp2;
			}
			output[i] = temp;
			list.remove(temp.stringFormat());
		}
		String[] result = new String[output.length];
		for(int l=0; l<result.length; l++) {
			result[l] = output[l].toString();
		}
		return result;
	}
	
	public static String[] selectionSort(String[] dates) {
		for(int i=0; i<dates.length; i++) {
			for(int j=i; j<dates.length; j++) {
				if(dates[j].compareTo(dates[i])<0) {
					convert(dates[i], dates[j]);
				}
			}
		}
		return dates;
	}
	public static void convert(String n, String m) {
		String temp = n;
		n=m;
		m=temp;
	}
	public static void main(String... args) {
		String[] test = {"20020223","19991208","18231010","16750723"};
		for(int i=0; i<test.length;i++) {
			System.out.println(test[i]);
		}
	}
	
	

}
