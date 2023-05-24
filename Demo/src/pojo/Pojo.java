package pojo;

//POJO (Plane Old Java Object):
//A class which contain certain private variables or attribute and 
//their value can be modified with the help of getter and setter. 

//Rules for POJO:
//All variables are private.
//2.All methods are public.
//3. Every field/attribute/variables have public getter and setter method.
//4. Must have public constructor.
public class A {
	private String name;
	private int id;
	private double sal;

	public A(String name, int id, double sal) { // This is parameterized constructor
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double fee) {
		this.sal = sal;
	}

}

public class Pojo {
	public static void main(String[] args) {
		A a = new A("Ajay", 102, 53000);
		
		
}
}
