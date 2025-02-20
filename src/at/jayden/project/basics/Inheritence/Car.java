package at.jayden.project.basics.Inheritence;

public class Car {

    private String brand;
    private String color;
    private Engine engine;


    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive(){
        System.out.println("Car is driving");
    }

    public void breakCar(){
        System.out.println("Car is breaking");
    }

}
