import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner s=new Scanner(System.in);
        ArrayList<Vehicle>rantedVehicles=new ArrayList<>();
       do {
           System.out.println("Vehicle Rental System");
        System.out.println("1 Rent a Car\n" +
                "\n" +
                "2 Rent a Bike\n" +
                "\n" +
                "3 Rent a Truck\n" +
                "\n" +
                "4 view Rented Vehicle\n" +
                "\n" +
                "5 to Exit");
        System.out.println("Enter choice");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter car model :");
                String carModel = s.next();
                System.out.println("Enter Rental Days :");
                int days = s.nextInt();
                Vehicle c1=new Car(carModel,days);
                c1.displayDetails();
                rantedVehicles.add(c1);
                break;
            case 2:
                System.out.println("Enter bike brand :");
                String bikeBrand = s.next();
                System.out.println("Enter Rental hours :");
                int hour = s.nextInt();
                Vehicle b1=new Bike(bikeBrand,hour);
                b1.displayDetails();
                rantedVehicles.add(b1);
                break;
            case 3:
                System.out.println("Enter truck type :");
                String truckType = s.next();
                System.out.println("Enter Rental Weeks :");
                int weeks = s.nextInt();
                Vehicle t1=new Car(truckType,weeks);
                t1.displayDetails();
                rantedVehicles.add(t1);
                break;
            case 4:
                for(Vehicle v:rantedVehicles){
                    v.displayDetails();
                }
                break;
            case 5:
                System.out.println("Thank you for using the Vehicle Rental System! ");
        }}while(choice<=5);
       }
    }
