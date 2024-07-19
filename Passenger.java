package Project;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Passenger {

    String passengername;
    int busno;
    Date date;

    Passenger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name: ");
        passengername = scanner.next();
        System.out.println("Enter your Busno: ");
        busno = scanner.nextInt();
        System.out.println("Enter your date(dd-MM-yyyy): ");
        String dateinput = scanner.next();
        SimpleDateFormat datefomrat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = datefomrat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Passenger> bookings){
        int capacity = 0;
        for(Bus bus:buses){
            if(bus.getbusno() == busno)
                capacity = bus.getbusno();

        }

        int booked = 0;
        for(Passenger p:bookings){
            if(p.busno == busno && p.date.equals(date)){
                booked++;
            }
        }

        return booked <capacity?true:false;
    }
}
