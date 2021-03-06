import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SortSearchGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new SortSearchGUI();
		frm.setTitle("Sort and Search");
		frm.setSize(700, 400);
		frm.setVisible(true);
	}
	
	GBPanel studentPanel = addPanel(1,1,2,4);
	JLabel addstudentLabel = studentPanel.addLabel("Add Student:",1,1,2,1);
	JLabel snameLabel = studentPanel.addLabel("Name:",2,1,1,1);
	JTextField snameField = studentPanel.addTextField("",2,2,1,1);
	JLabel sgpaLabel = studentPanel.addLabel("GPA:",3,1,1,1);
	DoubleField sgpaField = studentPanel.addDoubleField(0.0,3,2,1,1);
	JButton addStudentButton = studentPanel.addButton("Add",4,1,2,1);
	
	GBPanel widgetPanel = addPanel(1,3,2,4);
	JLabel addwidgetLabel = widgetPanel.addLabel("Add Widget:",1,1,2,1);
	JLabel wnumLabel = widgetPanel.addLabel("Product number:",2,1,1,1);
	IntegerField wnumField = widgetPanel.addIntegerField(0,2,2,1,1);
	JLabel wnumsoldLabel = widgetPanel.addLabel("Number sold:",3,1,1,1);
	IntegerField wnumsoldField = widgetPanel.addIntegerField(0,3,2,1,1);
	JButton addWidgetButton = widgetPanel.addButton("Add",4,1,2,1);
	
	GBPanel employeePanel = addPanel(1,5,2,4);
	JLabel addempLabel = employeePanel.addLabel("Add Employee:",1,1,2,1);
	JLabel enameLabel = employeePanel.addLabel("Name:",2,1,1,1);
	JTextField enameField = employeePanel.addTextField("",2,2,1,1);
	JLabel esalaryLabel = employeePanel.addLabel("Salary:",3,1,1,1);
	DoubleField esalaryField = employeePanel.addDoubleField(0.0,3,2,1,1);
	JButton addEmployeeButton = employeePanel.addButton("Add",4,1,2,1);
	
	GBPanel buttonPanel = addPanel(5,1,6,1);
	JButton searchButton = buttonPanel.addButton("Search",1,1,1,1);
	JButton sortButton = buttonPanel.addButton("Sort",1,2,1,1);
	JButton exitButton = buttonPanel.addButton("Exit",1,3,1,1);
	
	ArrayList<Comparable> list = new ArrayList<Comparable>();
	
	public SortSearchGUI() {
		studentPanel.setBackground(new Color(6,74,178));
		widgetPanel.setBackground(new Color(53,150,205));
		employeePanel.setBackground(new Color(6,74,178));
		buttonPanel.setBackground(new Color(3,138,128));
		
		searchButton.setEnabled(false);
		sortButton.setEnabled(false);
	}
	
	public void buttonClicked(JButton button) {
		if (button == addStudentButton) {
			if (isWhitespace(snameField.getText()) || !sgpaField.isValidNumber()) {
				messageBox("Invalid input");
				return;
			} else if (sgpaField.getNumber() < 0 || sgpaField.getNumber() > 5) {
				messageBox("Invalid GPA");
				return;
			}
			
			Student s = new Student(snameField.getText(), sgpaField.getNumber());
			list.add(s);
			
			snameField.setText("");
			sgpaField.setNumber(0.0);
			
			searchButton.setEnabled(true);
			sortButton.setEnabled(true);
			
		}
		
		if (button == addWidgetButton) {
			if (!wnumField.isValidNumber() || !wnumsoldField.isValidNumber()) {
				messageBox("Invalid input");
				return;
			} else if (wnumField.getNumber() < 100 || wnumField.getNumber() > 999) {
				messageBox("Invalid product number");
				return;
			} else if (wnumsoldField.getNumber() < 0) {
				messageBox("Invalid number sold");
				return;
			}
			
			Widget w = new Widget(wnumField.getNumber(), wnumsoldField.getNumber());
			list.add(w);
			
			wnumField.setNumber(0);
			wnumsoldField.setNumber(0);
			
			searchButton.setEnabled(true);
			sortButton.setEnabled(true);
			
		}
		
		if (button == addEmployeeButton) {
			if (isWhitespace(enameField.getText()) || !esalaryField.isValidNumber()) {
				messageBox("Invalid input");
				return;
			} else if (esalaryField.getNumber() < 0) {
				messageBox("Invalid salary");
				return;
			}
			
			Employee e = new Employee(enameField.getText(), esalaryField.getNumber());
			list.add(e);
			
			enameField.setText("");
			esalaryField.setNumber(0);
			
			searchButton.setEnabled(true);
			sortButton.setEnabled(true);
			
		}
		
		if (button == searchButton) {
			SearchDlg s = new SearchDlg(this, list);
			s.setVisible(true);
		}
		
		if (button == sortButton) {
			SortDlg s = new SortDlg(this, list);
			s.setVisible(true);
		}
		
		if (button == exitButton) {
			System.exit(1);
		}
	}
	
	public boolean isWhitespace(String s) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				return false;
		}
		return true;
	}

}
