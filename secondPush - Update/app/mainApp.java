package app;

import java.util.Scanner;
import appliance.*;
import house.*;

public class mainApp {
        Scanner sc = new Scanner(System.in); 
        airConditioning Ac; 
        boolean OnOff;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
//        Room 
//                
//        Make room
//                Create everything in the room
//                         Blindss
//                         Lights
//                         TV
//                         airConditioning
//                Initialise room
//                Add it to the House
    }
    
    public Room makeRoom(){
        
        System.out.println("What is the name of room: ");
        String name =sc.nextLine();
        System.out.println("What is the luminosity inside the room: ");
        double light_in = Double.parseDouble(sc.nextLine());
        System.out.println("What is the luminosity outside the room: ");
        double light_out = Double.parseDouble(sc.nextLine());
        System.out.println("Current temperature: ");
        double current_temp = Double.parseDouble(sc.nextLine());
        System.out.println("Is the motion sensor on or off? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")){
            OnOff= true; 
        }
        else if (choice.equalsIgnoreCase("no")){            OnOff = false;
        }
        
        
        Room new_room = new Room(name,current_temp,light_in,light_out,OnOff);
        new_room.setAc();
        new_room.setBlinds();
        new_room.setLights();
        new_room.setTv();
        return new_room; 
        }
    }
    
    
}

    
