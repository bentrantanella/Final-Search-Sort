import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.util.ArrayList;

public class SortDlg extends GBDialog {
	ArrayList<Comparable> list;
	
	public SortDlg(JFrame parent, ArrayList<Comparable> l) {
		super(parent);
		setTitle("Sort");
		setSize(300,300);
		
		list = l;
	}
	
	JComboBox optionsBox = addComboBox(1,1,1,1);
	JComboBox classBox = addComboBox(1,2,1,1);
	JButton sortButton = addButton("Sort",1,3,1,1);
	JTextArea outputArea = addTextArea("",2,1,3,3);
	
}
