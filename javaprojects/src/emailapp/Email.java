package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	
		//ask for and return department 
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}

	//Ask for department
	
	private String setDepartment() {
		System.out.print("Enter the department \n1 for sales\n2 for Development\n3 for Accounting\0 for none:\n");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "development"; }
		else if (depChoice == 3) { return "Accounting"; }
		else { return ""; }
	}
}

	