package house;
import appliance.*;

public class Room {
    private roomType type;
    private Lights lights;
    private airConditioning ac;
    private TV tv;
    private Blinds blinds;
    private boolean motionSensor;

    private boolean hasBlinds;
    private boolean hasTV;

    public Room(roomType t){
        if(t == roomType.BATHROOM){
            this.hasBlinds = false;
            this.hasTV = false;
        }
        else if(t == roomType.BEDROOM){
            this.hasBlinds = true;
            this.hasTV = true;
        }
        else if(t == roomType.HALLWAY){
            this.hasBlinds = false;
            this.hasTV = false;
        }
        else if(t == roomType.KITCHEN){
            this.hasBlinds = true;
            this.hasTV = false;
        }
        else {
            this.hasBlinds = true;
            this.hasTV = true;
        }
    }


    public Lights getLights() {
        return lights;
    }

    public boolean getMotionSensor() {
        return motionSensor;
    }

    public void setMotionSensor(boolean motionSensor) {
        this.motionSensor = motionSensor;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public airConditioning getAc() {
        return ac;
    }

    public void setAc(airConditioning ac) {
        this.ac = ac;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public Blinds getBlinds() {
        return blinds;
    }

    public void setBlinds(Blinds blinds) {
        this.blinds = blinds;
    }

}
