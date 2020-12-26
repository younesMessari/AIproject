package appliance;
import house.Room;

public class TV {

    private boolean on;

    public TV(){
        this.on = false;
    }

    public void setTVOn(){
        if(isOn() == false){
            setOn(true);
        }
    }

    private void setOn(boolean b){
        on = b;
    }

    public void setTVOff(){
        if(isOn() == true){
            setOn(false);
        }
    }

    public boolean isOn(){
        return on;
    }

}
