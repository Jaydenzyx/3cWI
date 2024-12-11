package at.jayden.project.basics.OO_Programming;

public class Car {

    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int MaxFuel;
    private int speed;

    int honkcounter = 0;



    public Car(Engine engine, int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int maxFuel) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.MaxFuel = maxFuel;
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
        System.out.println("Tuutuu");
        honkcounter = honkcounter + 1;

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




    public void setMaxFuel(int maxFuel) {
        if (MaxFuel>100){
            this.MaxFuel = 100;
            if (fuelAmount>100){
                this.fuelAmount = 100;
            }
        }
        MaxFuel = maxFuel;
    }

    public int getMaxFuel() {

        return MaxFuel;
    }


    public Engine getEngine() {
        return engine;
    }

    //egg

}








