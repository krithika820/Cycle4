import java.util.Scanner;

public class Garbage{
    
    public static void main(String args[])  {  
        Student obj=new Student();  
        obj.getDetails();
        obj.showDetails();
        obj=null;  
        System.gc();  
    
    }  
}  

class Student {
    Scanner sc = new Scanner(System.in);

    String name,number;
    int rollno;
       
    void getDetails() {
        System.out.println("Enter the Name of Student : ");
        name = sc.next();
        System.out.println("Enter the Roll No : ");
        rollno = sc.nextInt();
        System.out.println("Enter Phone Number : ");
        number = sc.next();

    }

    void showDetails() {

    System.out.println("\n Details\n");
    System.out.println("The Name of Student is " +name);
    System.out.println("Roll No is " +rollno);
    System.out.println("Phone Number is " +number);

    }

    protected void finalize() {
        System.out.println("\nGarbage of Object Collected");
    }
}
