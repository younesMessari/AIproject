package appliance;
import house.*;

public class Alarm {

    private boolean on;

    public Alarm(){
        this.on = false;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean turnOn(House h){
        for(Room r: h.getRooms()){
            if(r.getLights().isOn() || r.getAc().isOn() || r.getBlinds().isRaised() || r.getTv().isOn()){
                this.setOn(false);
                return false;
            }
        }
        this.setOn(true);
        return true;
    }

    public boolean isOn(){
        return on == true;
    }

    public boolean isOff(){
        return on == false;
    }
}
