package house;
import java.util.ArrayList;
import appliance.Alarm;

public class House {
    private ArrayList<Room> rooms;
    private Alarm alarm;
    private Double luminosity_out;


    

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    
    public void setRooms(ArrayList roomlist) {
        rooms = roomlist; 
    }
    
    public void addRoom() {
        Room newn = new Room(this.getLuminosity_out());
        System.out.println("The data of the new room will be:");
        System.out.println(newn);
        rooms.add(newn);
        
    }

    public House(ArrayList<Room> rooms, Double luminosity_out) {
        this.rooms = rooms;
        this.luminosity_out = luminosity_out;
    }
    
    public House(){
    
    }
    
    public Double getLuminosity_out() {
        return luminosity_out;
    }

    public void setLuminosity_out(Double luminosity_out) {
        this.luminosity_out = luminosity_out;
    }
    
}
