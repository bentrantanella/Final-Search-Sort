import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SortDlg extends GBDialog {
	ArrayList<Comparable> list;
	
	
	public SortDlg(JFrame parent, ArrayList<Comparable> l) {
		super(parent);
		setTitle("Sort");
		setSize(600,600);
		
		list = l;
		
		optionsBox.addItem("Insertion Sort");
		optionsBox.addItem("Selection Sort");
		
		classBox.addItem("Student");
		classBox.addItem("Employee");
		classBox.addItem("Widget");
	}
	
	JComboBox optionsBox = addComboBox(1,1,1,1);
	JComboBox classBox = addComboBox(1,2,1,1);
	JButton sortButton = addButton("Sort",1,3,1,1);
	JTextArea outputArea = addTextArea("",2,1,3,3);
	JButton exitButton = addButton("Exit",5,1,1,1);
	
	public void buttonClicked(JButton button) {
		if (button == sortButton) {
			ArrayList<Comparable> sorted;
			String output = "";
			if (optionsBox.getSelectedItem().equals("Insertion Sort")) {
				if (classBox.getSelectedItem().equals("Student")) {
					sorted = SortSearch.insertionSort(getStudents(), getStudents().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Student s = (Student)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
				}
				else if (classBox.getSelectedItem().equals("Employee")) {
					sorted = SortSearch.insertionSort(getEmployees(), getEmployees().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Employee s = (Employee)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
				}
				else {
					sorted = SortSearch.insertionSort(getWidgets(), getWidgets().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Widget s = (Widget)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
				}
				
			} else {
				
				if (classBox.getSelectedItem().equals("Student")) {
					sorted = SortSearch.selectionSort(getStudents(), getStudents().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Student s = (Student)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
				}
				else if (classBox.getSelectedItem().equals("Employee")) {
					sorted = SortSearch.selectionSort(getEmployees(), getEmployees().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Employee s = (Employee)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
				}
				else {
					sorted = SortSearch.selectionSort(getWidgets(), getWidgets().size());
					
					for(int i = 0; i < sorted.size(); i++) {
						Widget s = (Widget)sorted.get(i);
						output += s.getInfo() + "\n\n";
					}
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
		
	
}
