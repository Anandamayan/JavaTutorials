package demo;

public class EverForceEmployee implements EmployeeRules , FamilyRules
{


	public static void main(String[] args) 
	{
		EverForceEmployee EF = new EverForceEmployee();
		EF.maintainHours();
		EF.relocate();
		EF.enjoy();
		
		System.out.println(EmployeeRules.salary);
		System.out.println(EmployeeRules.leaves);
	}
		public void maintainHours()
		{
			System.out.println("10 Hours");
		}
		   
		public void relocate()
		{
			System.out.println("Bangalore");
		}
		   
		public void report()
		{
			System.out.println("Manager");
		}
		   
		 public void dress()
		 {
			 System.out.println("Formal");
		 }
		 
		   public void takeCareparents()
		   {
			   System.out.println("Caring");
		   }
			
			public void helpMembers()
			{
				System.out.println("Helping");
			}
			
			public void eatTogether()
			{
				System.out.println("Eating");
			}
			
			public void enjoy()
			{
				System.out.println("Enjoying");
			}
	

}
