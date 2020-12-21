package app;

import java.util.Scanner;
import appliance.*;
import house.*;
import java.util.ArrayList;

public class mainApp {
        
       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        String flag;
        boolean choice = true;
        ArrayList<Room> roomlist = new ArrayList(); 
        
        while (choice == true) { 
            Room room = new Room();
            roomlist.add(room);
            System.out.println("The data of the room entered is:");
            System.out.println(room);
            System.out.println("Do you want to add another room? (yes/no) ");
            if ((flag = sc.nextLine()) == "no"){
                choice = false;
            }
        }      
    }
}


    
   

    
