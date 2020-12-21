package appliance;

public class airConditioning {
    private double temperature;
    private double desiredtemp;
    private boolean On;

    public airConditioning(double temperature, double desiredtemp, boolean on) {
        this.temperature = temperature;
        this.desiredtemp = desiredtemp;
        On = on;
    }
    
    public airConditioning(double temperature, boolean on) {
        this.temperature = temperature;
        On = on;
    }
    
    public airConditioning(boolean on) {
        On = on;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isOn() {
        return On;
    }
    
    public void setTemperature(double temperature) {
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

    @Override
    public String toString() {
        if (isOn()==true){  
            return ("The AC is on and the current temperature is "+getTemperature());
        }
        else return ("The AC is off and the current temperature is "+getTemperature());
    }
    
    
}