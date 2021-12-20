package demo;

import java.util.Scanner;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ExceptionDemo3 ed3 = new ExceptionDemo3();
       ed3.getDetails();
	}

	private void getDetails() {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number: ");
		int accNo = sc.nextInt();
		System.out.println("Enter Your Pin Number: ");
		int pin = sc.nextInt();
		}
		catch(Exception e)
		{
			System.err.println("Enter your accno/pinno crctly");
		}
		finally {
			System.out.println("Close Transaction");
		}
		
	}
}
