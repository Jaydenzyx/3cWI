package at.jayden.project.basics.OO_Programming;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;
    public int MaxFuel;
    public int amountOfRepetitions;


    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount > this.MaxFuel * 0.10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough Fuel to go to Superboost");
        }
    }

    public void honk() {

        for (int i = 0; i < this.amountOfRepetitions; i++) {
            System.out.println("Tuuutuuu");
        }

    }

    public void getRemainingRange() {
        int RemainingRange = this.fuelAmount / this.fuelConsumption * 100;
        System.out.println(RemainingRange + "km");
    }

}





