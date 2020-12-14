package house;
import appliance.*;

public class Room {
    private Lights lights;
    private airConditioning ac;
    private TV tv;
    private Blinds blinds;
    private boolean motionSensor;

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
