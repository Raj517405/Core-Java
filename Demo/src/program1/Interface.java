package program1;

interface Reliance{
	abstract void showInfo();	
}
interface RelianceFresh extends Reliance{
	abstract void DispInfo();
}
interface Interface extends Reliance{
	abstract void PrintInfo();              //By default all the methods are public abstract.
}
	
public class NavJivan implements RelianceFresh,Interface{
	public void showInfo() {
		System.out.println("Relance");
	}
		public void DispInfo(){
			System.out.println("RelanceFresh");
		}
		public void PrintInfo(){
			System.out.println("Interface");
		}

	
	public static void main(String[] args) {
		RelianceFresh rf = new NavJivan();
		Interface i = new NavJivan();
		a.meth();
	}
}
