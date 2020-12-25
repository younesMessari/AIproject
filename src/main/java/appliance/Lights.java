package appliance;

public class Lights {
    
    private double CurrentLux;
    private double DesiredLux;
    private boolean Switch;

    public Lights(double CurrentLux, double DesiredLux, boolean Switch) {
        this.CurrentLux = CurrentLux;
        this.DesiredLux = DesiredLux;
        this.Switch = Switch;
    }
    
    public Lights(double CurrentLux,boolean Switch) {
        this.CurrentLux = CurrentLux;
        this.Switch = Switch;
    }
    
    public double getCurrentLux() {
        return CurrentLux;
    }

    public void setCurrentLux(double CurrentLux) {
        this.CurrentLux = CurrentLux;
    }

    public double getDesiredLux() {
        return DesiredLux;
    }

    public void setDesiredLux(double DesiredLux) {
        this.DesiredLux = DesiredLux;
    }

    public boolean isSwitch() {
        return Switch;
    }

    public void setSwitch(boolean Switch) {
        this.Switch = Switch;
    }
    
   
    public boolean isOn(){
        if (this.Switch == true)
                return true;
        else{
                return false;}
    }
    
    public boolean isOff(){
        if (this.Switch == false)
                return true;
        else {
            return false;}
    }
    
    public boolean Brighten(){
        if (isOn()==true){
            if (CurrentLux<DesiredLux){
                while(CurrentLux>DesiredLux){
                    RaiseLum();}
                System.out.print("Luminosity Regulated");
                return true; 
            }
        }
        return false;
    }
    
    public boolean Darken(){
        if (isOn()==true){
            if (CurrentLux>DesiredLux){
                while(CurrentLux<DesiredLux){
                    LowerLum();}
                System.out.println("Luminosity Regulated");
                return true; 
            }
        }
        return false;
    
    }
    
    public boolean RaiseLum(){
       setCurrentLux(CurrentLux++);
       return true;
    }
    public boolean LowerLum(){
       setCurrentLux(CurrentLux--);
       return true;
    }
    public boolean turnOn(){
        if (isOn()==true){
           System.out.println("Light already on");
           return false;
        } 
        setSwitch(true);
        return true;
        
    }
    
    public boolean turnOff(){
        if (isOn()==false){
           System.out.println("Light already off");
           return false;
        } 
        setSwitch(false);
        return true;
    }

    @Override
    public String toString() {
        if (isOn() == true){
            return ("The lights are on and have a luminosity of: "+getCurrentLux()+".");}
        else return ("The lights are off");
    }
}
