import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SearchDlg extends GBDialog {
	ArrayList<Comparable> list;
	
	public SearchDlg(JFrame parent, ArrayList<Comparable> l) {
		super(parent);
		setTitle("Search");
		setSize(300,300);
		
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
	JButton searchButton = addButton("Sort",2,2,1,1);
	JTextArea outputArea = addTextArea("",2,1,3,3);
	JButton exitButton = addButton("Exit",5,1,1,1);
	
	public void buttonClicked (JButton button) {
		if (button == searchButton) {
			
		}
		
		if (button == exitButton) {
			
		}
	}
	
}
