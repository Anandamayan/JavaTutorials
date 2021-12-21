package busResv;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
	    ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,true,57));
		buses.add(new Bus(3,true,38));
        
		int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        
        for(Bus b:buses) {
        	b.displayBusInfo();
        }
        
        	while(userOpt==1) {
		     System.out.println("Enter 1 to Book and 2 to Exit: ");
          userOpt = scanner.nextInt();
         if(userOpt == 1) {
        	 Booking booking = new Booking();
         }
	}

}
}