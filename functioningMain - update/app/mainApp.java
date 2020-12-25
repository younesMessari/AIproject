package app;
import java.time.LocalTime;
import java.util.Scanner;
import house.*;

public class mainApp {
    public static void main(String args[]){
        //Rooms initialization
        Scanner sc = new Scanner(System.in);
        int nOfRooms;
        House house;
        boolean flag = false;

        System.out.println("How many rooms do you have?");
        nOfRooms = sc.nextInt();
        house = new House();
        for(int i=0; i<nOfRooms; i++){
            roomTypeMenu(i);
            sc = new Scanner(System.in);
            int typeChoice = sc.nextInt();
            Room r = new Room(roomType.BEDROOM);
            switch(typeChoice){
                case 1:
                    r = new Room(roomType.HALLWAY);
                    flag = true;
                    break;
                case 2:
                    r = new Room(roomType.BEDROOM);
                    flag = true;
                    break;
                case 3:
                    r = new Room(roomType.LIVINGROOM);
                    flag = true;
                    break;
                case 4:
                    r = new Room(roomType.BATHROOM);
                    flag = true;
                    break;
                case 5:
                    r = new Room(roomType.KITCHEN);
                    flag = true;
                    break;
                default:
                    System.out.println("Input error. Try again.");
                    i--;
                    break;
            }
            if(flag) house.addRoom(r);
        }

        //User settings
        Scanner sc2 = new Scanner(System.in);
        int temperature, illumination;
        String raiseTime;
        String lowerTime;

        System.out.println("Setting your preferences: ");
        System.out.println("Desired temperature: ");
        temperature = sc2.nextInt();
        System.out.println("Desired Illumination: ");
        illumination = sc2.nextInt();
        System.out.println("Time to raise blinds (hh:mm:ss): ");
        raiseTime = sc.nextLine();
        System.out.println("Time to lower blinds (hh:mm:ss): ");
        lowerTime = sc.nextLine();

        Settings userSettings = new Settings(temperature, illumination, LocalTime.parse(lowerTime), LocalTime.parse(raiseTime));
    }

    private static void roomTypeMenu(int i){
        System.out.println("What type of room is room " + (i+1) + ": ");
        System.out.println("1. Hallway");
        System.out.println("2. Bedroom");
        System.out.println("3. Living Room");
        System.out.println("4. Bathroom");
        System.out.println("5. Kitchen");
        System.out.print("Your choice: ");
    }

}
