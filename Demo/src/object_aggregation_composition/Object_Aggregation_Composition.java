package object_aggregation_composition;

class Emp {
	int empid;
	String empname;
	String empaddress;
	double empsalary;

	public Emp(int empid, String empname, String empaddress, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Emp [Employee ID: = " + empid + ", Employee Name: = " + empname + ", Employee Address: = " + empaddress
				+ ", Employee Salary: = " + empsalary + "]";
	}

}

class Emp2 {
	String emphobbies;
	String empfavouritefruit;

	public Emp2(String emphobbies, String empfavouritefruit) {
		super();
		this.emphobbies = emphobbies;
		this.empfavouritefruit = empfavouritefruit;
	}

	@Override
	public String toString() {
		return "Emp2 [Employee Hobbies: = " + emphobbies + ", Employee Fvourite Fruit: = " + empfavouritefruit + "]";
	}

}

class Access {
	Emp e = new Emp(102, "Ajay Gupta", "Delhi", 48000);
	Emp2 e1 = new Emp2("Reading Books", "Orange");

}

public class Object_Aggregation_Composition {
	public static void main(String[] args) {
		Access a = new Access();
		System.out.println(a.e.empname);
		System.out.println(a.e1);

	}

}
