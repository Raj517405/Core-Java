package program1;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		
		int marks;
		
		System.out.println("Enter Marks: ");
		try (Scanner obj = new Scanner(System.in)) {
			marks = obj.nextInt();
		}
		
		if(marks>80 && marks<100) {
			System.out.println("First Division");
		}
		else if (marks>60 && marks<80)
		{
			System.out.println("Second Division");
		}
		else if (marks>40 && marks<60) {
			System.out.println("Thired Division");
		}
		else {
			System.out.println("Failed...");
		}
	}

}
