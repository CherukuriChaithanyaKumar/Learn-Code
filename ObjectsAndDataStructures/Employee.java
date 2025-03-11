package ObjectsAndDataStructures;

public class Employee {
	private String name;
	private int age;
	private float salary;

	Employee(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Age:" + age);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Chandu", 50, 100000);
		employee.displayEmployeeInfo();
		employee.getName();

		employee.setSalary(100000);
		System.out.println("Updated Salary: " + employee.getSalary());
	}
}

// employee is an object and not just a data structure. 
// This is because employee is  instance of the Employee class, which encapsulate both data and behavior
