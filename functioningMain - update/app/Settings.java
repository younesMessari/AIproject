package app;

import java.time.LocalTime;

public class Settings {
    private static int desTemp;
    private static int desLum;
    private static LocalTime timeToLowerBlinds;
    private static LocalTime timeToRaiseBlinds;

    public Settings(int desTemp, int desLum, LocalTime timeToLowerBlinds, LocalTime timeToRaiseBlinds){
        this.desTemp = desTemp;
        this.desLum = desLum;
        this.timeToLowerBlinds = timeToLowerBlinds;
        this.timeToRaiseBlinds = timeToRaiseBlinds;
    }

    public static int getDesTemp() {
        return desTemp;
    }

    public static void setDesTemp(int desTemp) {
        Settings.desTemp = desTemp;
    }

    public static int getDesLum() {
        return desLum;
    }

    public static void setDesLum(int desLum) {
        Settings.desLum = desLum;
    }

    public static LocalTime getTimeToLowerBlinds() {
        return timeToLowerBlinds;
    }

    public void setTimeToLowerBlinds(LocalTime timeToLowerBlinds) {
        this.timeToLowerBlinds = timeToLowerBlinds;
    }

    public static LocalTime getTimeToRaiseBlinds() {
        return timeToRaiseBlinds;
    }

    public void setTimeToRaiseBlinds(LocalTime timeToRaiseBlinds) {
        this.timeToRaiseBlinds = timeToRaiseBlinds;
    }
}
