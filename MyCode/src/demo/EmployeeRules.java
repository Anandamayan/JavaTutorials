package demo;

public interface EmployeeRules 
{
	int salary = 20000; // By default , these variables are final and static
	int leaves = 10;
   
	public void maintainHours();  //By default , they are abstract 
   
   public void relocate();
   
   public void report();
   
   public void dress();
   
   
}
