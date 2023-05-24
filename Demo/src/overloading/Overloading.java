package overloading;

// Method Overloading: Creating multiple methods with same name but different parameters in the same class.
//1.No. of Parameter
//2. Types of Parameter
//3. Sequence of Parameter

class A{
	void meth() {
		System.out.println("This is a normal method.");
	}
	void meth(int a, double b) {
		System.out.println("This is a overloaded method.");
	}
	void meth(String name) {
		System.out.println("This is also a overloaded method.");
	}
	
}

public class Overloading {
	public static void main(String[] args) {
		A a = new A();
		a.meth("Ajay Gupta");
		
	}

}
