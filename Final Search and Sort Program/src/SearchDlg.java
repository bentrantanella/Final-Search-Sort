import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SearchDlg extends GBDialog {
	ArrayList<Comparable> list;
	
	public SearchDlg(JFrame parent, ArrayList<Comparable> l) {
		super(parent);
		setTitle("Search");
		setSize(500,500);
		
		
		
		list = l;
		
		optionsBox.addItem("Binary Search");
		optionsBox.addItem("Sequential Search");
		
		
		classBox.addItem("Student");
		classBox.addItem("Employee");
		classBox.addItem("Widget");
		
		
	}
	
	JComboBox optionsBox = addComboBox(1,1,1,1);
	JComboBox classBox = addComboBox(1,2,1,1);
	JTextField searchField = addTextField("",2,1,1,1);
	JButton searchButton = addButton("Search",2,2,1,1);
	JTextArea outputArea = addTextArea("",3,1,3,3);
	JButton exitButton = addButton("Exit",6,1,1,1);
	
	
	
	public void buttonClicked (JButton button) {
		if (button == searchButton) {
			if(isWhitespace(searchField.getText())) {
				messageBox("Invalid search");
				return;
			}
				
			
			String output = "";
			if (optionsBox.getSelectedItem().equals("Binary Search")) {
				if (classBox.getSelectedItem().equals("Student")) {
					output = SortSearch.binarySearch(getStudents(), new Student(searchField.getText(), 0), 's');
					
					
				} else if (classBox.getSelectedItem().equals("Employee")) {
					output = SortSearch.binarySearch(getEmployees(), new Employee(searchField.getText(), 0), 'e');
					
					
				} else {
					output = SortSearch.binarySearch(getWidgets(), new Widget(Integer.parseInt(searchField.getText()), 0), 'w');
					
					
				}
				
				
			} else {
				
				if (classBox.getSelectedItem().equals("Student")) {
					output = SortSearch.sequentialSearch(getStudents(), searchField.getText(), 's');
					
					
				} else if (classBox.getSelectedItem().equals("Employee")) {
					output = SortSearch.sequentialSearch(getEmployees(), searchField.getText(), 'e');
					
					
				} else {
					output = SortSearch.sequentialSearch(getWidgets(), searchField.getText(), 'w');
					
					
				}
			}
			
			outputArea.setText(output);
		}
		
		if (button == exitButton) {
			dispose();
		}
	}
	
	private ArrayList<Comparable> getStudents() {
		ArrayList<Comparable> stulist = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Student)
				stulist.add(list.get(i));
		}
		
		return stulist;
	}
	
	private ArrayList<Comparable> getEmployees() {
		ArrayList<Comparable> emplist = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Employee)
				emplist.add(list.get(i));
		}
		
		return emplist;
	}
	
	private ArrayList<Comparable> getWidgets() {
		ArrayList<Comparable> widlist = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Widget)
				widlist.add(list.get(i));
		}
		
		return widlist;
	}
	
	public boolean isWhitespace(String s) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				return false;
		}
		return true;
	}
	
}
