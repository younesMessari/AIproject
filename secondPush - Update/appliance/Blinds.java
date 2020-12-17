package appliance;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Blinds {

    private double luminosity;
    private LocalTime time;
    private boolean raised;

    LocalTime time7
            = LocalTime.parse("07:00:00");
    LocalTime time19
            = LocalTime.parse("19:00:00");

    public Blinds(double luminosity, boolean raised) {
        this.luminosity = luminosity;
        this.time = LocalTime.now();
        this.raised = raised;
    }
    
    public Blinds(double luminosity, LocalTime time, boolean raised) {
        this.luminosity = luminosity;
        this.time = LocalTime.now();
        this.raised = raised;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public LocalTime getTime() {
        return time;
    }

    public boolean isRaised() {
        return raised;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setRaised(boolean raised) {
        this.raised = raised;
    }

    public boolean lowerCondition() {

        boolean bool = false;

        if (isRaised()) {
            if (luminosity < 2) {
                int value = time.compareTo(time7);
                if (value > 0) {
                    int value2 = time.compareTo(time19);
                    if (value2 < 0) {
                        bool = true;
                    }
                }
            }
        }

        return bool;
    }

    public void Lower() {
        if (lowerCondition()) {
            raised = false;
        }
    }


    public void Raise() {
        if (!lowerCondition()) {
            raised = true;
        }
    }
}