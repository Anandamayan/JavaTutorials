package demo;

class Adder{
	static int add(int a,int b) {
		return a + b;
	}
	static void add(int ...a) {
		for (int i : a)
            System.out.print(i + " ");
		
		
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}


public class MethodOverLoading {

	public static void main(String[] args) {
	    
		System.out.println(Adder.add(20,30));
	    
	    System.out.println(Adder.add(20,30,50));
	    Adder.add(20,30,40,50,70,90,40);
		}

}
