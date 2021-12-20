package demo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionDemo ed = new ExceptionDemo();
	    ed.calculate();
		}
	    
		
		   private void calculate() {
			   Scanner sc = new Scanner(System.in); 
				System.out.println("Enter Two  Numbers: ");
			    int no1 = sc.nextInt();
			    int no2 = sc.nextInt();
		   
			/*System.out.println(no1+no2);
			System.out.println(no1-no2);
			System.out.println(no1*no2);*/
			try {
			System.out.println(no1/no2); //Exception Possible Area
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Check your Divisor, seems it is zero");//Exception Handling Block
				
			}
	}

}
