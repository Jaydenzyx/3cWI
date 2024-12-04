package at.jayden.project.basics.OO_Programming;

public class main {

    public static void main(String[] args) {


        Engine e1 = new Engine(120, Engine.TYPE.DIESEL);

        Car c1 = new Car(e1,20,7,14,"Mercedes","1234","red",7,125);

        Car c2 = new Car(e1,30,5,95,"Audi","12345","blue",5,140);

        Car c3 = new Car(e1,60,4,46,"BMW","123456","black",3,100);

        System.out.println(c3.getMaxFuel());
        System.out.println(c3.getFuelAmount());

        c2.turboBoost();

        c2.honk();
        System.out.println(c2.honkcounter);
        c2.honk();
        System.out.println(c2.honkcounter);

        c2.turboBoost();
        c2.getRemainingRange();



    }


}
