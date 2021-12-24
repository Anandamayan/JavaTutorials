package busResv;

import java.util.*;

public class Booking {
         String passengerName;
         int busNo;
         Date date;
         
         
         Booking(){
        	 Scanner scanner = new Scanner(System.in);
        	 System.out.println("Enter name of Passenger: ");
        	 passengerName = scanner.next();
        	 System.out.println("Enter the Bus No: ");
        	 busNo =  scanner.nextInt();
        	 System.out.println("Enter date dd-mm-yyyy");
        	 String dateInput = scanner.next();
        	 
         }
}
