package abstract_class;

//Abstract Class:
//Abstract class is a class which does not have body and curly braces.
//We can not create the object of abstract class.
//
abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car start with key.");
	}
}

class Scooter extends Vehicle {
	void start() {
		System.out.println("Scooter start with kick or else.");
	}
}
public class Abstract {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}

}
