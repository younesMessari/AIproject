package appliance;
import static app.mainApp.currentState;
import static app.mainApp.userSettings;

public class Lights {
    private int illuminance;
    private boolean on;

    public Lights() {
        this.illuminance = currentState.getIllum();
        this.on = false;
    }

    public int getIlluminance() {
        return illuminance;
    }

    public boolean isOn() {
        return on;
    }


    public void setIlluminance(int illuminance) {
        this.illuminance = illuminance;
    }

    public void setOn(boolean on) {
        on = on;
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
        while(getIlluminance() < userSettings.getDesLum()){
            raiseIllum();
        }
    }

    public void Darken() {
        while (getIlluminance() > app.Settings.getDesLum()) {
            lowerIllum();
        }
    }
}
