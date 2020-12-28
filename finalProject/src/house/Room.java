package house;
import appliance.*;

public class Room {
    private roomType type;
    private Lights lights;
    private airConditioning ac;
    private TV tv;
    private Blinds blinds;
    private boolean motionSensor;
    private int currentIllum;
    private int currentTemp;

    public boolean hasBlinds;
    public boolean hasTV;

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
        this.motionSensor = false;
        this.lights = new Lights();
        this.ac = new airConditioning();
        this.blinds= new Blinds();
        this.tv = new TV();
    }


    public int getCurrentIllum() {
        return currentIllum;
    }

    public void setCurrentIllum(int currentIllum) {
        this.currentIllum = currentIllum;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
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

    @Override
    public String toString(){
        String st = "";
        st += ("In the " + this.type + ": \n");
        st += ("Lights are ");
        if(this.getLights().isOn()) st += "on. \n";
        if(!this.getLights().isOn()) st += "off. \n";
        st += ("TV is ");
        if(this.getTv().isOn()) st += "on. \n";
        if(!this.getTv().isOn()) st += "off. \n";
        st += ("Temperature is set to " + this.getAc().getTemperature() + "\n");
        st += ("Illuminance is set to " + this.getLights().getIlluminance() + "\n");
        st += ("Blinds are ");
        if(this.getBlinds().isRaised()) st += "raised.\n";
        if(!this.getBlinds().isRaised()) st += "lowered.\n";
        return st;
    }

}
