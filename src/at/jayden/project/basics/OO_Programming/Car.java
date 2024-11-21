package at.jayden.project.basics.OO_Programming;

public class Car {

    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int MaxFuel;
    private int amountOfRepetitions;




    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int amountOfRepetitions) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.amountOfRepetitions = amountOfRepetitions;
    }

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

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelAmount(int fuelAmount) {


            this.fuelAmount = fuelAmount;

    }

    public int getFuelAmount() {
        if(this.fuelAmount>100){
            this.fuelAmount = 100;
        }

            return fuelAmount;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }


}







