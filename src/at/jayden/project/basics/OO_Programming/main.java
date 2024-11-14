package at.jayden.project.basics.OO_Programming;

public class main {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "1234";
        c1.fuelAmount = 70;
        c1.MaxFuel = 100;
        c1.amountOfRepetitions = 5;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "12345";
        c2.fuelAmount = 20;
        c2.MaxFuel = 130;
        c2.amountOfRepetitions = 5;


        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c1.brake();
        c1.turboBoost();
        c2.honk();
        c1.getRemainingRange();
        c2.getRemainingRange();
    }


}
