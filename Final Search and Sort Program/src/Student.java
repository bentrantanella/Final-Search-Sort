
public class Student implements Comparable<Student> {
	String name;
	double gpa;
	
	public Student(String n, double g) {
		name = n;
		gpa = g;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		return getName().compareToIgnoreCase(o.getName());
	}
	
	public String getInfo() {
		return name + ", GPA: " + gpa;
	}
	
	public boolean equals(String s) {
		return s.equalsIgnoreCase(name);
	}
}
