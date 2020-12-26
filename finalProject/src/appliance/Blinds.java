package appliance;

import static app.mainApp.*;
import java.time.LocalTime;

public class Blinds {
    private LocalTime time;
    private boolean raised;

    public Blinds() {
        this.time = currentState.getTime();
        this.raised = false;
    }

    public boolean isRaised() {
        return raised;
    }

    public void setRaised(boolean raised) {
        this.raised = raised;
    }

    public void Raise(){
        if(!isRaised())
            setRaised(true);
    }

    public void Lower(){
        if(isRaised())
            setRaised(false);
    }

   /*private boolean raised;

    public Blinds() {
        this.raised = false;
    }

    public boolean isRaised() {
        return raised;
    }

    public void setRaised(boolean raised) {
        this.raised = raised;
    }

    public boolean lowerCondition() {

        boolean bool = false;

        if (isRaised()) {
            if (currentState.luminosity < 2) {
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
    }*/
}