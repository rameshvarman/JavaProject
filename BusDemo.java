package Project;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String agrs[]){

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Passenger> bookings = new ArrayList<Passenger>();

        buses.add(new Bus(1,true,3));
        buses.add(new Bus(2,false,25));
        buses.add(new Bus(3,false,34));

        int useropt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }


        while(useropt ==1) {
            System.out.println("Enter 1 to Book and 2 to Exit: ");
            useropt = scanner.nextInt();
            if(useropt == 1){
                Passenger booking = new Passenger();
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                    System.out.println("You're booking is confirmed");
                }
                else{
                    System.out.println("Try another bus or date.");
                }
            }
        }
    }
}
