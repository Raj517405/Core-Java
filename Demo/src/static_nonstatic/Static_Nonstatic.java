package static_nonstatic;

class A {

	void meth() {
		System.out.println("This is non static method access by object.");
	}

	static void meth2() {
		System.out.println("This is static method access by class.");
	}

}

public class Static_Nonstatic {
	public static void main(String[] args) {
		A a = new A();
		a.meth();
		A.meth2();

	}
}
