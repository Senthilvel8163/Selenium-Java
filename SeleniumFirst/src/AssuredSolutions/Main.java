package AssuredSolutions;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter employee code : " );
	    String employeeCode = scanner.nextLine();
	    
	    System.out.print("Enter employee name : " );
	    String employeeName = scanner.nextLine();
	    
	    System.out.print("Enter department : " );
	    String department = scanner.nextLine();
	    
	    System.out.print("Enter basic pay : " );
	    double basicPay = scanner.nextDouble();
	    
	    double da, hra, pf, tax;
	    
	    if(basicPay>20000){ 
	    da  = 0.585 * basicPay;
	    hra = 0.15 * basicPay;
	    pf  = 0.20 * basicPay;
	    tax = 0.17 * basicPay;
	    
	    }else if(basicPay>15000){
	    da  = 0.46 * basicPay;
	    hra = 0.12 * basicPay;
	    pf  = 0.15 * basicPay;
	    tax = 0.12 * basicPay;
	    
	    } else {
	     da = 0.425 * basicPay;
	    hra = 1500;
	    pf  = 0.10  * basicPay;
	    tax = 0;
	    } 
	    
	     double grossPay  = basicPay + da + hra;
	     double deduction = pf + tax;
	     double netPay    = grossPay - deduction;
	     
	    
		System.out.println("Employee code is : " + employeeCode);
		System.out.println("Employee name is : " + employeeName);
		System.out.println("Employee deparment is : " + department);
		System.out.println("Employee basic pay is : " + basicPay);
		System.out.println("Employee da is :" + da);
		System.out.println("Employee hra is :" + hra);
		System.out.println("Employee pf is :" + pf);
		System.out.println("Employee tax is : " + tax);
		System.out.println("Employee gross pay is : " + grossPay);
		System.out.println("Employee net pay is : " + netPay);
		
	}
}