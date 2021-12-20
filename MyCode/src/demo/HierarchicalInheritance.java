package demo;

class Vehicle{
	void drive() {
	System.out.println("To Drive");
	}
}

 class Car extends Vehicle {
	 void four() {
		 System.out.println("It has four wheel");
	 }
 }
 
 class Bike extends Vehicle{
	 void two() {
		 System.out.println("It has two wheel");
	 }
 }

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.drive();
		b.two();
		
		Car c = new Car();
		c.four();
	}
}
