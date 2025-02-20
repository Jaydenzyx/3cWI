package at.jayden.project.basics.Inheritence;

public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(7, 90);

        Car c1 = new Car("mercedes", "white", e1);

        Truck t1 = new Truck("audi", "black", e1, "Trailer1");

        System.out.println(t1.getColor() + " " + t1.getTrailer());

        t1.drive();

        t1.breakCar();

    }
}
