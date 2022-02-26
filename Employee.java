import java.util.Scanner;
public class Employee {
	
	String Name,Phone_Number,Address;
	int Age,Salary;
	
	void print_Salary() {
		System.out.println("Salary : "+Salary);
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		Officer of = new Officer();
		Manager mg = new Manager();

		System.out.println("\nOfficer\n");
		of.input();
		System.out.println("Enter the specialization");
		of.specialization = scn.next();
		
		System.out.println("\nManager\n");
		mg.input();
		System.out.println("Enter the department");
		mg.Department = scn.next();

		System.out.println("\nOfficer\n");
		of.print();
		System.out.println("Specialization : "+of.specialization);

		System.out.println("\nManager\n");
		mg.print();
		System.out.println("Department "+mg.Department);

		scn.close();
	}

	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name :");
		Name = sc.next();

		System.out.println("Enter the Address :");
		Address = sc.next();

		System.out.println("Enter the Phone_Number :");
		Phone_Number = sc.next();

		System.out.println("Enter the Age :");
		Age = sc.nextInt();

		System.out.println("Enter the Salary :");
		Salary = sc.nextInt();
		sc.nextLine();		
		

	}

	void print() {
		System.out.println("\nName : "+Name+"\nAge : "+Age+"\nAddress : "+Address+"\nPhone_Number : "+Phone_Number);
		print_Salary();
	}

}
	
class Officer extends Employee {
	String specialization;
}

class Manager extends Employee {
	String Department;
}
