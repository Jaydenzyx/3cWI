package at.jayden.project.basics.Inheritence;

public class Engine {

    private int Fuelconsumption;
    private int horsepower;


    public Engine(int fuelconsumption, int horsepower) {
        Fuelconsumption = fuelconsumption;
        this.horsepower = horsepower;
    }

    public int getFuelconsumption() {
        return Fuelconsumption;
    }

    public void setFuelconsumption(int fuelconsumption) {
        Fuelconsumption = fuelconsumption;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
