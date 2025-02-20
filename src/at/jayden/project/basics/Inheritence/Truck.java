package at.jayden.project.basics.Inheritence;

public class Truck extends Car {

    private String trailer;

    public Truck(String brand, String color, Engine engine, String trailer) {
        super(brand, color, engine);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void breakCar() {
        super.breakCar();
    }

}
