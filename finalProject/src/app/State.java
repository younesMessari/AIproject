package app;
import java.time.LocalTime;

import static app.mainApp.*;

public class State {
    //current time, each room: temp, motion sensor
    private int temp;
    private int illum;
    private LocalTime time;
    private int[] roomsWithMotion;

    public State(int temp, int illum, LocalTime time, int[] roomsWithMotion) {
        this.temp = temp;
        this.illum = illum;
        this.time = time;
        this.roomsWithMotion = roomsWithMotion;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getIllum() {
        return illum;
    }

    public void setIllum(int illum) {
        this.illum = illum;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int[] getRoomsWithMotion() {
        return roomsWithMotion;
    }

    public void setRoomsWithMotion(int[] roomsWithMotion) {
        this.roomsWithMotion = roomsWithMotion;
    }

    @Override
    public String toString(){
        String st = "";
        st += ("Current temperature: " + this.getTemp() + "\n");
        st += ("Current Luminosity: " + this.getIllum() + "\n");
        st += ("Current Time: " + this.getTime().toString() + "\n");
        st += ("Current rooms with people in them: [");
        for(int n: this.getRoomsWithMotion()) st+= " " + n + " ";
        st += ("]");
        return st;
    }
}
