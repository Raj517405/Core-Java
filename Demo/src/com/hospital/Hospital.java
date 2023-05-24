package com.hospital;

class A{
	int doctor;
	int nurse;
	int wardboy;
	String hospitalName;
	
	public A(int doctor, int nurse, int wardboy, String hospitalName) {
		super();
		this.doctor = doctor;
		this.nurse = nurse;
		this.wardboy = wardboy;
		this.hospitalName = hospitalName;
	}
	void showHospitalInfo() {
		System.out.println("Hospital Name: "+hospitalName);
		System.out.println("Number of Doctors: "+doctor);
		System.out.println("Number of Nurses: "+nurse);
		System.out.println("Number of Wardboy: "+wardboy);
	}
}
public class Hospital {

	public static void main(String[] args) {
		A a = new A(5,8,10, "City Hospital");
		System.out.println("");
		System.out.println("<----------Hospital Information---------->");
		System.out.println("");
		a.showHospitalInfo();
		
		Doctor d1 = new Doctor(101, "Dr. Ajay Gupta", "Cardiologist", "City Hospital", 90000.0);
		Doctor d2 = new Doctor(102, "Dr. Vinayak Srivastav", "Dentist", "City Hospital", 50000.0);		
		Doctor d3 = new Doctor(103, "Dr. Rajan Mehara", "Neurosergen", "City Hospital", 95000.0);	
		Doctor d4 = new Doctor(104, "Dr. Shivani Pandey", "Dermatologist", "City Hospital", 65000.0);	
		Doctor d5 = new Doctor(105, "Dr. Sunita Ashwini", "Sexologist", "City Hospital", 60000.0);
		
		System.out.println("\n<----------Doctor Information--------->");
		System.out.println("");
		d1.showDoctorInfo();
		System.out.println("");
		d2.showDoctorInfo();
		System.out.println("");
		d3.showDoctorInfo();
		System.out.println("");
		d4.showDoctorInfo();
		System.out.println("");
		d5.showDoctorInfo();
		
		System.out.println("\n<----------Salary Information--------->");
		System.out.println("");
		System.out.println("Doctor Name: "+d1.getName());
		System.out.println("Original Salary: "+d1.getSal());	
		System.out.println("In hand Salary: "+DoctorSalary.calDocSal(d1.getSal()));
		
		System.out.println("");
		System.out.println("Doctor Name: "+d2.getName());
		System.out.println("Original Salary: "+d2.getSal());	
		System.out.println("In hand Salary: "+DoctorSalary.calDocSal(d2.getSal()));
		
		System.out.println("");
		System.out.println("Doctor Name: "+d3.getName());
		System.out.println("Original Salary: "+d3.getSal());	
		System.out.println("In hand Salary: "+DoctorSalary.calDocSal(d3.getSal()));
		
		System.out.println("");
		System.out.println("Doctor Name: "+d4.getName());
		System.out.println("Original Salary: "+d4.getSal());	
		System.out.println("In hand Salary: "+DoctorSalary.calDocSal(d4.getSal()));
		
		System.out.println("");
		System.out.println("Doctor Name: "+d5.getName());
		System.out.println("Original Salary: "+d5.getSal());	
		System.out.println("In hand Salary: "+DoctorSalary.calDocSal(d5.getSal()));
		
	}

}
