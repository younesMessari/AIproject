package app;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import house.*;

public class mainApp {
    public static House house;
    public static Settings userSettings;
    public static State currentState;

    public static void main(String args[]){
        //Rooms initialization
        Scanner sc = new Scanner(System.in);
        int nOfRooms;
        boolean flag = false;

        System.out.println("How many rooms do you have?");
        nOfRooms = sc.nextInt();
        house = new House();
        for(int i=0; i<nOfRooms; i++){
            roomTypeMenu(i);
            sc = new Scanner(System.in);
            int typeChoice = sc.nextInt();
            Room r = null;
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

        userSettings = new Settings(temperature, illumination, LocalTime.parse(lowerTime), LocalTime.parse(raiseTime));
        //Settings(22, 300, 19:00:00, 07:00:00)

        //generate random state
        final int[] stateTemp = new int[1];
        final int[] stateLights = new int[1];
        final int[] stateMotion = new int[2];
        final int[] stateHours = new int[1];
        final int[] stateMinutes = new int[1];
        final String[] stateTime = new String[1];

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        stateTemp[0] = randInt(15, 40);
                        stateLights[0] = randInt(300,900);
                        stateMotion[0] = randInt(1, 6);
                        stateMotion[1] = randInt(1, 6);
                        stateHours[0] = randInt(0, 23);
                        stateMinutes[0] = randInt(0,59);
                        stateTime[0] = (stateHours + ":" + stateMinutes + ":00");
                    }
                },
                5000
        );
        currentState = new State(stateTemp[0], stateLights[0], LocalTime.parse(stateTime[0]), stateMotion);
        //Print state
        System.out.println("New state: \n" + currentState.toString());
        //solve state
        regulate(currentState);
        printHouse();
        //print
        resetRooms();
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

    public static void regulate(State s){
        ArrayList<Room> houseRooms = House.getRooms();
        Room r;
        for(int n: s.getRoomsWithMotion()){
            r = houseRooms.get(n);
            r.setMotionSensor(true);
        }
        for(Room room: houseRooms){
            if(room.getMotionSensor()){
                //Lights handling
                room.getLights().turnOn();
                if(room.getLights().getIlluminance() < userSettings.getDesLum())
                    room.getLights().Lighten();
                else if(room.getLights().getIlluminance() > userSettings.getDesLum())
                    room.getLights().Darken();

                //AC handling
                room.getAc().turnOn();
                if(room.getAc().getTemperature() < userSettings.getDesTemp())
                    room.getAc().Heat();
                else if(room.getAc().getTemperature() > userSettings.getDesTemp())
                    room.getAc().Cool();

                //Blinds handling
                if(room.hasBlinds){
                    if(currentState.getTime().isAfter(userSettings.getTimeToRaiseBlinds()) && !room.getBlinds().isRaised())
                        room.getBlinds().Raise();
                    if(currentState.getTime().isBefore(userSettings.getTimeToLowerBlinds()) && room.getBlinds().isRaised())
                        room.getBlinds().Lower();
                }

                //TV handling
                if(room.hasTV){
                    room.getTv().setTVOn();
                }
            }
        }
    }

    public static void resetRooms(){
        for(Room r: House.getRooms()){
            r.setMotionSensor(false);
        }
    }

    public static void printHouse(){
        for(Room r: house.getRooms())
            r.toString();
    }



    public static int randInt(int min, int max) {
        Random rand = null;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }


}
