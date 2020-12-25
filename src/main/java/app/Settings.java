package app;

public class Settings {
    private static int des_temp;
    private double luminosity;

    public static int getDesiredTemp() {
        return des_temp;
    }

    public void setDesiredTemp(int desiredTemp) {
        this.des_temp = desiredTemp;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }
}
