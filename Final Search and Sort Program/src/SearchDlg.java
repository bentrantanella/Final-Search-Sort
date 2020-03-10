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
	}
	
	
}
