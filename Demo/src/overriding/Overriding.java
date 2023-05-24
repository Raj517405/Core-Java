package overriding;

//Method Overriding:
//Method overriding is a process of creating method with same name and same signature/ parameter in the child class.
class Shape {
	void circle() {
		System.out.println("Circle Shape");
	}

	class Shape2 extends Shape {
		void circle() {
			System.out.println("Sqare Shape");
		}
	}
}

public class Overriding {
	public static void main(String[] args) {
		Shape a = new Shape2();
		a.circle();
	}

}
