package app;

import java.util.Scanner;
import appliance.*;
import house.*;
import java.util.ArrayList;

public class mainApp {
        
       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        boolean choice = true;
        ArrayList<Room> roomlist = new ArrayList(); 
        House my_house = new House();
        my_house.setRooms(roomlist);
        System.out.println("What is the luminosity outside the house: ");
        my_house.setLuminosity_out(sc.nextDouble());
        
        
        while (choice == true) { 
            my_house.addRoom();
            System.out.println("Do you want to add another room? (yes/no) ");
            String flag = sc.nextLine();
            if (flag.equalsIgnoreCase("no")){
                choice = false;
            }
        }      
    }
}


    
   

    
