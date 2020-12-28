package house;
import java.util.ArrayList;
import appliance.Alarm;

public class House {
    private static ArrayList<Room> rooms;
    private Alarm alarm;

    public House(){
        this.alarm = new Alarm();
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    public void removeRoom(Room r){
        rooms.remove(r);
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }
}
