package appliance;
import house.Room;

public class TV {

    private boolean on;

    public TV(boolean on) {
        this.on = on;
    }
    

    public void setTVOn(Room r){
        if(!r.getTv().isOn() && r.getMotionSensor() == true){
            r.getTv().setOn(true);
        }
    }

    public void setOn(boolean b){
        on = b;
    }

    public void setTVOff(Room r){
        if(r.getTv().isOn() && r.getMotionSensor() == false){
            r.getTv().setOn(false);
        }
    }

    public boolean isOn(){
        return on;
    }

    @Override
    public String toString() {
       if (isOn()==true){
           return ("The Tv is on.");
       }
       else return ("The Tv is off");
    }
    
    
}
