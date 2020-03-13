import java.util.ArrayList;

public class SortSearch {
	
	public static ArrayList<Comparable> insertionSort(ArrayList<Comparable> c, int n) {
		Comparable val;
		int pos;
		for(int i = 0; i < n; i++) {
			val = c.get(i);
			pos = i;
			
			while(pos > 0 && c.get(pos-1).compareTo(val)>0) {
				c.set(pos, c.get(pos-1));
				pos--;
			}
			
			c.set(pos, val);
		}
		
		return c;
	}
	
	public static ArrayList<Comparable> selectionSort(ArrayList<Comparable> c, int n) {
		
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (c.get(j).compareTo(c.get(min_idx)) < 0)
					min_idx = j;
			}
			Comparable temp = c.get(min_idx);
			c.set(min_idx, c.get(i));
			c.set(i, temp);
		}
		
		return c;
	}
	
	public static String binarySearch(ArrayList<Comparable> c, String s, char type) {
		ArrayList<Comparable> a = selectionSort(c, c.size());
		String output = "";
		int left = 0;
		int right = a.size() - 1;
		
		int compareval;
		
		while (left <= right) {
			int middle = left + (right - left) / 2;
			
			compareval = a.get(middle).compareTo(s.toLowerCase());
			if (compareval == 0) {
				if (type == 'e') {
					Employee e = (Employee)a.get(middle);
					output += e.getInfo();
				} else if (type == 's') {
					Student e = (Student)a.get(middle);
					output += e.getInfo();
				} else {
					Widget e = (Widget)a.get(middle);
					output += e.getInfo();
				}
			} else if (compareval > 0) {
				right = middle - 1;
				
			} else {
				left = middle + 1;
			}
			
		}
		if (output.contentEquals(""))
			output = "Not found";
		
		return output;
	}
	
	public static  String sequentialSearch(ArrayList<Comparable> c, String s, char type) {
		String output = "";
		for(int i = 0; i < c.size(); i++) {
			if (c.get(i).compareTo(s) == 0) {
				if (type == 'e') {
					Employee e = (Employee)c.get(i);
					output += e.getInfo();
				} else if (type == 's') {
					Student e = (Student)c.get(i);
					output += e.getInfo();
				} else {
					Widget e = (Widget)c.get(i);
					output += e.getInfo();
				}
			}
		}
		
		if (output.contentEquals(""))
			output = "Not found";
		
		return output;
	}
}
