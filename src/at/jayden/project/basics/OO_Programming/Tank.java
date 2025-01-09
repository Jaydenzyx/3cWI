package at.jayden.project.basics.OO_Programming;

public class Tank {

    private int fuelamount;
    private int maxFuel;

    public Tank(int fuelamount, int maxFuel) {
        this.fuelamount = fuelamount;
        this.maxFuel = maxFuel;
    }


    public int getFuelamount() {
        return fuelamount;
    }

    public void setFuelamount(int fuelamount) {
        this.fuelamount = fuelamount;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }
}
