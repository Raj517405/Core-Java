package interface_class;

// Interface: Interface is a class which have abstract methods and variables are public static final.  
//All the methods are purely abstract and variables are public static final.
//1. We can not create the object of the Interface as well as abstract class.

//2. Abstract method do not have body.
//Abstract Methods: Method which does not have curly braces not even the body.

interface Customer{
	int amt=10;               //By default methods are 'public abstract' in Interface.
	 void purchase();       //By default variables are 'public static final'
	                    
}
class Seller implements Customer{
	@Override
	 public void purchase() {
		System.out.println("Custoner needs "+amt+"Kg rice.");
	}
}

public class Interface {
	public static void main(String[] args) {
		Customer c = new Seller();
		c.purchase();
		
	}

}
