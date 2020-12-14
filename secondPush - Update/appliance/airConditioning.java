package appliance;

public class airConditioning {
    private int temperature;
    private boolean On;

    public airConditioning(int temperature, boolean on) {
        this.temperature = temperature;
        On = on;
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
        setTemperature(this.temperature++);
    }
    public void lowerTemp(){
        setTemperature(this.temperature--);
    }
    public void Heat(){
        if(!isOn()){
            turnOn();
        }
        while(getTemperature() <= app.Settings.getDesiredTemp()){
            raiseTemp();
        }
        turnOff();
    }
    public void Cool() {
        if(!isOn()){
            turnOn();
        }
        while (getTemperature() >= app.Settings.getDesiredTemp()) {
            lowerTemp();
        }
        turnOff();
    }
}