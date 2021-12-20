package demo;

class Vehicle1{
	void run() {
		System.out.println("Vehicle is Running");
	}
}

class Bike1 extends Vehicle1{
	void run() {
		System.out.println("Bike is Running Fastly");
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {
		Bike1 obj = new Bike1();
		obj.run();
		}
}
