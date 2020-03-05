
public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return getSalary() - o.getSalary();
	}

	
	
	
}
