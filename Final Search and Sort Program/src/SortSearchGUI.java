import javax.swing.*;
import BreezySwing.*;

public class SortSearchGUI extends GBFrame {
	
	public static void main(String[] args) {
		JFrame frm = new SortSearchGUI();
		frm.setTitle("Sort and Search");
		frm.setSize(700, 400);
		frm.setVisible(true);
	}
	
	JLabel addstudentLabel = addLabel("Add Student:",1,1,2,1);
	JLabel addwidgetLabel = addLabel("Add Widget:",1,3,2,1);
	JLabel addempLabel = addLabel("Add Employee:",1,5,2,1);
	
	JLabel snameLabel = addLabel("Name:",2,1,1,1);
	JTextField snameField = addTextField("",2,2,1,1);
	JLabel wnumLabel = addLabel("Product number:",2,3,1,1);
	IntegerField wnumField = addIntegerField(0,2,4,1,1);
	JLabel enameLabel = addLabel("Name:",2,5,1,1);
	JTextField enameField = addTextField("",2,6,1,1);
	
	JLabel sgpaLabel = addLabel("GPA:",3,1,1,1);
	DoubleField = addDoubleField(0,3,2,1,1);

}
