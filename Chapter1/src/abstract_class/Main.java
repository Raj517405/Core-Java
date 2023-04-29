package abstract_class;

abstract class School {
	
	public void show() {
		System.out.println("School Application");
	}
	abstract int getAdmissionFee();
}
class DAV extends School {
	int getAdmissionFee() {
		return 25000;
	}
}

class DPS extends School {
	int getAdmissionFee() {
		return 35000;
	}
}
class JNV extends School {
	int getAdmissionFee() {
		return 1000;
	}
}
public class Main {
	public static void main(String[] args) {
		School s;
		s = new DAV();
		s.show();
		System.out.println("DAV Admission Fee: " + s.getAdmissionFee());
		
		s = new DPS();
		System.out.println("DPS Admisson Fee: " + s.getAdmissionFee());
		
		s = new JNV();
		System.out.println("JNV Admission Fee: "+ s.getAdmissionFee());
		
	}

}
