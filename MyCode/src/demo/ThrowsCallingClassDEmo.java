package demo;

public class ThrowsCallingClassDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowsDemo.divide(5,5);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please Check Your Inputs");
		}

	}

}
