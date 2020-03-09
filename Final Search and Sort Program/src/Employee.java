
public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (getSalary() == o.getSalary())
			return 0;
		else if (getSalary() < o.getSalary())
			return -1;
		else return 1;
	}

	
	
	
}
