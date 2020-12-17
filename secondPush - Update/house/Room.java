package house;
import appliance.*;
import java.util.Scanner;

public class Room {
    private String roomname; 
    private double current_temp;
    private Lights lights;
    private double luminosity_in; 
    private double luminosity_out;
    private airConditioning ac;
    private TV tv;
    private Blinds blinds;
    private boolean motionSensor;
    private boolean OnOff;
    Scanner sc = new Scanner(System.in); 

    public Room(String roomname, double temp, double Luminosity_In, double Luminosity_Out, boolean motionSensor) {
        this.roomname = roomname;
        this.current_temp = temp;
        this.luminosity_in = Luminosity_In;
        this.luminosity_out = Luminosity_Out;
        this.motionSensor = motionSensor;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public Double getCurrent_temp() {
        return current_temp;
    }

    public void setCurrent_temp(Double current_temp) {
        this.current_temp = current_temp;
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

    public void setLights() {
        System.out.print("--Setting up the lights--");
        System.out.println("Are the lights on or off: ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
            System.out.println("Set the light levels inside the room to: ");
            double inLum = Double.parseDouble(sc.nextLine()); 
            OnOff= true;  
            Lights Light = new Lights(this.luminosity_in,inLum,OnOff);
            this.lights =  Light; 
            }    
        else if (Choice.equalsIgnoreCase("no")){
            OnOff= false;
            System.out.println("Set the light levels inside the room to: ");
            double inLum = Double.parseDouble(sc.nextLine());
            Lights Light = new Lights(this.luminosity_in,OnOff);
            this.lights = Light;
        }
    }

    public airConditioning getAc() {
        return ac;
    }

    public void setAc() {
        System.out.print("--Setting up Air Conditioning--");
        System.out.println("Do you wish to turn on the AC? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
                OnOff= true;    
                System.out.println("Enter desired temperature: ");
                double desiredtemp = Double.parseDouble(sc.nextLine());  
                airConditioning AirCond = new airConditioning(this.current_temp,desiredtemp,OnOff);
                this.ac = AirCond; 
        }    
        else if (Choice.equalsIgnoreCase("no")){
                OnOff= true;  
                airConditioning AirCond = new airConditioning(OnOff);
                this.ac=AirCond; 
        }
    }

    public TV getTv() {
        return tv;
    }

    public void setTv() {
        System.out.print("--Setting up the TV--");
        System.out.println("Do you wish to turn on the TV? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
            OnOff= true;  
            TV tv = new TV(OnOff);
            this.tv =tv; 
        }    
        else if (Choice.equalsIgnoreCase("no")){
            OnOff= true;
            TV tv = new TV(OnOff);
            this.tv =tv; 
        }
    }

    public Blinds getBlinds() {
        return blinds;
    }

    public void setBlinds() {
        System.out.print("--Setting up the blinds--");
        System.out.println("Are the blinds raised or not? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
            OnOff= true;  
            Blinds Blind = new Blinds(this.luminosity_out,OnOff);
            this.blinds = Blind; 
        }    
        else if (Choice.equalsIgnoreCase("no")){
            OnOff= false;
            Blinds Blind = new Blinds(this.luminosity_out,OnOff);
            this.blinds = Blind;
        }
    }

    public Double getLuminosity_in() {
        return luminosity_in;
    }

    public void setLuminosity_in(Double Luminosity_in) {
        this.luminosity_in = Luminosity_in;
    }

    public Double getLuminosity_out() {
        return luminosity_out;
    }

    public void setLuminosity_Out(Double Luminosity_Out) {
        this.luminosity_out = Luminosity_Out;
    }
   
    
}
