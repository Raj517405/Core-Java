package overloading;

class Overload {
	void meth() {
		System.out.println("Ajay Gupta");
	}
	void meth(int a) {
		System.out.println(a);
	}
	void meth(int a, int b) {
		System.out.println(a+" "+b);
	}
}
class Overload2 extends Overload{
}
public class Overloading {
	
	public static void main(String[] args) {
		Overload2 a = new Overload2();
		a.meth();
		a.meth(120, 150);
		a.meth(2);
		
	}
} 



