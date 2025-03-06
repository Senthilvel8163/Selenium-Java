// Getting various input values using Scanner class
package Basics;

import java.util.Scanner;

public class UserInput_Scanner {

	public static void main(String[] args) {
		// Declaring different data types 
        String name, dept = "";
        byte age ; 
        char gender; 
        short bonus; 
        int deduction; 
        float salary; 
        double ctc; 
        long mobile; 
        boolean isalive; 
  
        Scanner sc = new Scanner(System.in);  // Instance/object of Scanner class is created
        
        System.out.print("Enter Employee Name : \t");
        name = sc.nextLine();
        
        System.out.print("Enter Department : \t");
        dept = sc.next();   // Gets a token  -- 
        
        System.out.print("Enter Age : \t");
        age = sc.nextByte();
        
        System.out.print("Enter Gender : \t");
        gender = sc.next().charAt(0);
        
        System.out.print("Enter Bonus : \t");
        bonus = sc.nextShort();
        
        System.out.print("Enter Deduction : \t");
        deduction = sc.nextInt();
        
        System.out.print("Enter Salary : \t");
        salary = sc.nextFloat();
        
        System.out.println("Enter CTC Amount : \t");
        ctc = sc.nextDouble();
        
        System.out.print("Enter Contact Number : \t");
        mobile = sc.nextLong();
        
        System.out.print("Enter IsAlive : \t");
        isalive = sc.nextBoolean();     
        
        System.out.println("Employee Name : " + name); 
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age); 
        System.out.println("Department : " + dept); 
        System.out.println("Bonus : " + bonus); 
        System.out.println("Duduction : " + deduction); 
        System.out.println("Salary : " + salary); 
        System.out.println("Annual Income : " +  ctc); 
        System.out.println("Contact No : " + mobile);
        System.out.println("Alive : " + isalive);

        sc.close();

	}

}

