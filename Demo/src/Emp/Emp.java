package Emp;

class A {
	int id;
	String name;
	String address;
	double salary;

	public A(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
		
		void showInfo() {
			System.out.println("ID: "+id);
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Salary: "+salary);
		} 
		
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Emp {
	public static void main(String[] args) {
		A a = new A(02, "Ajay Gupta", "Mumbai", 43000);
		a.showInfo();
		
	}

}
