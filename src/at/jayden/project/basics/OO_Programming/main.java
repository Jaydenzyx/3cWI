package at.jayden.project.basics.OO_Programming;

public class main {

    public static void main(String[] args) {


        Engine e1 = new Engine(120, Engine.TYPE.DIESEL,9);

        Engine e2 = new Engine(210, Engine.TYPE.GAS,8);

        Engine e3 = new Engine(180, Engine.TYPE.DIESEL,7);

        Tank t1 = new Tank(80,100);
        Tank t2 = new Tank(120,160);
        Tank t3 = new Tank(95,115);

        Car c1 = new Car(e1,"Audi","89148","blue",t1);

        Car c2 = new Car(e2,"BMW","15815","red",t2);

        Car c3 = new Car(e3,"Mercedes","9135","black",t3);




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

        Tire ti1 = new Tire(15, "blue", Tire.TYPE.Winter);
        Tire ti2 = new Tire(20, "black", Tire.TYPE.Summer);


        System.out.println(ti1.getTirecolor());
        System.out.println(ti1.getTiresize());

        c1.addTire(ti1);

        c1.turboBoost();


    }
}
