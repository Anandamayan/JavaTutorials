package demo;

class Animal{
	void eat() {
		System.out.println("Eating");}
	}
	class Dog extends Animal{
		void bark() {
			System.out.println("Barking");}
		}
		class ChildDog extends Dog{
			void sleep() {
				System.out.println("Sleeping");}
			}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		ChildDog d = new ChildDog();
		d.eat();
		d.bark();
		d.sleep();
		
	}
}
