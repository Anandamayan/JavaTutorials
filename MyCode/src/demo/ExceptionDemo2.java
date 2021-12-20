package demo;

import java.util.Arrays;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int[] ar = new int[3];
		ar[0] = 40;
		ar[1] = 50;
		ar[2] = 60;
		try {
		ar[3] = 70;
		}
		catch(Exception e) {
			System.out.println("Check the length of Array");
		}
		
		
		System.out.println("Array is: " + Arrays.toString(ar));
	}
}
