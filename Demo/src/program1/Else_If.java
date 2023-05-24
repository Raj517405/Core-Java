package program1;

import java.util.Scanner;  //Java is a package, util is sub package and Scanner is a pre-define class

public class Else_If {
	public static void main(String[] args) {
		
		int pwd;          //Variable declaration
		
		System.out.println("Enter Password: "); //Print Statement
		Scanner obj = new Scanner(System.in);    //creating object of Scanner class(System.in is a ) 
		pwd=obj.nextInt();
		
		if(pwd==1958)          // If else condition
		{
			System.out.println("Name: Ajay Gupta");
			System.out.println("Age: 22");
			System.out.println("Address: Mumbai");
			System.out.println("Mob. No.: 9085465064");
		}
		else {
			System.out.println("Sorry! Password is wrong.");
		}
		
	}

}
