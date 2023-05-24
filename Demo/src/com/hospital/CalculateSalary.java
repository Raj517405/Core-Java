package com.hospital;

public class CalculateSalary {
	
	static double calSal(double sal) {
		return sal;
	}

}
class DoctorSalary extends CalculateSalary{
	static double calDocSal(double sal) {
		if (sal >= 70000.0) {
			double gst = (sal/100)*18;
			System.out.println("18% GST("+gst+") is deducted from your account and trasfer to the Government.");
			return sal - gst;
		}
		else {
			return sal;
		}
		
	}
}
