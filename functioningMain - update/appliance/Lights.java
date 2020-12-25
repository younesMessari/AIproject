package appliance;

public class Lights {
    private int illuminance;
    private boolean On;

    public Lights(int illuminance, boolean on) {
        this.illuminance = illuminance;
        On = on;
    }

    public int getIlluminance() {
        return illuminance;
    }

    public boolean isOn() {
        return On;
    }


    public void setIlluminance(int illuminance) {
        this.illuminance = illuminance;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public void turnOn() {
        if (!isOn()) {
            setOn(true);
        }
    }

    public void turnOff(){
        if (isOn()){
            setOn(false);
        }

    }

    public void raiseIllum(){
        setIlluminance(this.getIlluminance()+1);
    }

    public void lowerIllum(){
        setIlluminance(this.getIlluminance()-1);
    }

    public void Lighten(){
        if(!isOn()){
            turnOn();
        }
        while(getIlluminance() < app.Settings.getDesLum()){
            raiseIllum();
        }
        turnOff();
    }
    public void Darken() {
        if(!isOn()){
            turnOn();
        }
        while (getIlluminance() > app.Settings.getDesLum()) {
            lowerIllum();
        }
        turnOff();
    }
}
