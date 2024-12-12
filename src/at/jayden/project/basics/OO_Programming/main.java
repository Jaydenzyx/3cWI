package at.jayden.project.basics.OO_Programming;

public class main {

    public static void main(String[] args) {


        Engine e1 = new Engine(120, Engine.TYPE.DIESEL);

        Engine e2 = new Engine(210, Engine.TYPE.GAS);

        Engine e3 = new Engine(180, Engine.TYPE.DIESEL);

        Car c1 = new Car(e1, 7, 14, "Mercedes", "123", "red", 125);

        Car c2 = new Car(e2, 5, 95, "Audi", "1234", "blue", 140);

        Car c3 = new Car(e3, 10, 90, "Opel", "12345", "orange", 110);

        System.out.println(c3.getMaxFuel());
        System.out.println(c3.getFuelAmount());

        c2.turboBoost();

        c2.honk();
        System.out.println(c2.honkcounter);
        c2.honk();
        System.out.println(c2.honkcounter);


        c2.getEngine().drive(48);


        c2.turboBoost();
        c2.getRemainingRange();

        System.out.println(c2.getEngine().getHorsepower());


        c3.getEngine().drive(100);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, +40);

        c1.addMirror(r1);
        c2.addMirror(r2);

        System.out.println(c2.getMirrors().get(0).getMirrorposition());

        Tire t1 = new Tire(15, "blue", Tire.TYPE.Winter);
        Tire t2 = new Tire(20, "black", Tire.TYPE.Summer);


        System.out.println(t1.getTirecolor());
        System.out.println(t1.getTiresize());

        c1.addTire(t1);



    }
}
