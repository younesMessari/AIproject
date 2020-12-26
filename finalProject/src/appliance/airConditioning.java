package appliance;
import static app.mainApp.*;

public class airConditioning {
    private int temperature;
    private boolean On;

    public airConditioning() {
        this.temperature = currentState.getTemp();
        On = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return On;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
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

    public void raiseTemp(){
        setTemperature(this.temperature+1);
    }

    public void lowerTemp(){
        setTemperature(this.temperature-1);
    }

    public void Heat(){
        while(getTemperature() < app.Settings.getDesTemp()){
            raiseTemp();
        }
        turnOff();
    }
    public void Cool() {
        while (getTemperature() > app.Settings.getDesTemp()) {
            lowerTemp();
        }
        turnOff();
    }
}