package demo;
// Example program for constructorOverloading
public class Test1 
{
      Test1(double d)
      {
    	  this(10);
    	  System.out.println("Double Arg Constructor");
      }
      Test1(int d)
      {
    	  this();
    	  System.out.println("Int - Arg Constructor");
      }
      Test1()
      {
    	  System.out.println("No - Arg Constructor");
      }
	public static void main(String[] args) 
	{
		//Test1 t1 = new Test1(20.5);
		//Test1 t2 = new Test1(10);
		//Test1 t3 = new Test1();
	}

}
