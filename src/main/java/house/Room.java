package house;
import appliance.*;
import java.util.Scanner;

public class Room {
    private String roomname; 
    private double current_temp;
    private Lights lights;
    private double luminosity_in;
    private airConditioning ac;
    private TV tv;
    private Blinds blinds;
    private boolean motionSensor;
    private boolean OnOff;
    Scanner sc = new Scanner(System.in); 

    public Room(String roomname, double temp, double Luminosity_In, boolean motionSensor) {
        this.roomname = roomname;
        this.current_temp = temp;
        this.luminosity_in = Luminosity_In;
        this.motionSensor = motionSensor;
    }

    public Room(double lum_out) {
       
        System.out.println("What is the name of room: ");
        setRoomname(sc.nextLine());
        System.out.println("What is the luminosity inside the room: ");
        setLuminosity_in(Double.parseDouble(sc.nextLine()));
        System.out.println("Current temperature: ");
        setCurrent_temp(Double.parseDouble(sc.nextLine()));
        System.out.println("Is the motion sensor on or off? ");
        System.out.println("Enter 'On' or 'Off': ");
        String choice = sc.nextLine();
        //do{
            if (choice.equalsIgnoreCase("on")){
                setMotionSensor(true); }
            else if (choice.equalsIgnoreCase("off")){            
                setMotionSensor(false);}
        //}while(choice != "yes" || choice != "no");
        setAc();
        System.out.println("AC set");
        setBlinds(lum_out);
        System.out.println("Blinds set");
        setLights();
        System.out.println("Lights set");
        setTv();
        System.out.println("TV set");
        
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
        System.out.println("--Setting up the lights--");
        System.out.println("Are the lights on or off: ");
        System.out.println("Enter 'On' or 'Off': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("on")){
            System.out.println("Set the light levels inside the room to: ");
            double inLum = sc.nextDouble(); 
            OnOff= true;  
            Lights Light = new Lights(this.luminosity_in,inLum,OnOff);
            this.lights =  Light; 
            }    
        else if (Choice.equalsIgnoreCase("off")){
            OnOff= false;
            System.out.println("Set the light levels inside the room to: ");
            double inLum = sc.nextDouble();
            Lights Light = new Lights(this.luminosity_in,OnOff);
            this.lights = Light;
        }
    }

    public airConditioning getAc() {
        return ac;
    }

    public void setAc() {
        System.out.println("--Setting up Air Conditioning--");
        System.out.println("Do you wish to turn on the AC? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
                OnOff= true;    
                System.out.println("Enter desired temperature: ");
                double desiredtemp = sc.nextDouble();  
                airConditioning AirCond = new airConditioning(this.current_temp,desiredtemp,OnOff);
                this.ac = AirCond; 
        }    
        else if (Choice.equalsIgnoreCase("no")){
                OnOff= false;  
                airConditioning AirCond = new airConditioning(OnOff);
                this.ac=AirCond; 
        }
    }

    public TV getTv() {
        return tv;
    }

    public void setTv() {
        System.out.println("--Setting up the TV--");
        System.out.println("Do you wish to turn on the TV? ");
        System.out.println("Enter 'ON or 'OFF': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("on")){
            OnOff= true;  
            TV tv = new TV(OnOff);
            this.tv =tv; 
        }    
        else if (Choice.equalsIgnoreCase("off")){
            OnOff= true;
            TV tv = new TV(OnOff);
            this.tv =tv; 
        }
    }

    public Blinds getBlinds() {
        return blinds;
    }

    public void setBlinds(double lum_out) {
        System.out.println("--Setting up the blinds--");
        System.out.println("Are the blinds raised or not? ");
        System.out.println("Enter 'YES' or 'NO': ");
        String Choice = sc.next();
        if (Choice.equalsIgnoreCase("yes")){
            OnOff= true;  
            Blinds Blind = new Blinds(lum_out,OnOff);
            this.blinds = Blind; 
        }    
        else if (Choice.equalsIgnoreCase("no")){
            OnOff= false;
            Blinds Blind = new Blinds(lum_out,OnOff);
            this.blinds = Blind;
        }
    }

    public Double getLuminosity_in() {
        return luminosity_in;
    }

    public void setLuminosity_in(Double Luminosity_in) {
        this.luminosity_in = Luminosity_in;
    }


    @Override
    public String toString() {
        System.out.println("This is room '"+getRoomname()+"'.");
        System.out.println(getLights());
        System.out.println(getBlinds());
        System.out.println(getTv());
        System.out.println(getAc());
      return ("");
    }
   
    
}
