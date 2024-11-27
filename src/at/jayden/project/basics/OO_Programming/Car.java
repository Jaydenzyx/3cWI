package at.jayden.project.basics.OO_Programming;

public class Car {

    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int MaxFuel;
    private int amountOfRepetitions;
    private int enginespeed;




    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int amountOfRepetitions, int enginespeed) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.amountOfRepetitions = amountOfRepetitions;
        this.enginespeed = enginespeed;
    }

    public void drive(int speed) {
        if(speed < 1 || speed > 100){
            System.out.println("Speed must be between 1 and 100");
            return;
        }
    }

    public void engine(){
        if (this.fuelAmount <1 || this.fuelAmount<101){
            System.out.println("Not enough fuel");
        }

        if(this.enginespeed >=1 && this.enginespeed <=50) {
            System.out.println("slow modus");
            this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        }else {
            System.out.println("fast mode");
        }
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
            System.out.println("Tuutuu");
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







