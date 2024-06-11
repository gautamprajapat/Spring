package pojo_classes;

public class Employee {
	 int id;
	 String name;
	 double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
	

}
