package at.jayden.project.basics.OO_Programming;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type;
    private int fuelConsumption;


    public Engine(int horsepower, TYPE type,int fuelConsumption) {
        this.horsepower = horsepower;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }


    public void drive(int amount) {
        System.out.println("Your driving with " + amount + "kmh");
        if (amount >=1 &&amount <= 50) {
            System.out.println("slow mode");
        } else if (amount>50 && amount <= 100){
            System.out.println("fast mode");
        } else {
            System.out.println("geben sie bitte eine zahl zwischen 1 und 100 ein");
        }
    }


    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

}
