package com.hospital;

public class Doctor {
	int id;
	String name;
	String specialization;
	String hospitalName;
	double sal;
	
	public Doctor(int id, String name, String specialization, String hospitalName, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.hospitalName = hospitalName;
		this.sal = sal;
	}
	void showDoctorInfo() {
		System.out.println("Doctor ID: "+id);
		System.out.println("Doctor Name: "+name);
		System.out.println("specialization: "+specialization);
		System.out.println("Working In: "+hospitalName);
		System.out.println("Doctor Salary: "+sal);
	}

	String getName() {
		return name;
	}
	double getSal() {
		return sal;
	}
	

}
