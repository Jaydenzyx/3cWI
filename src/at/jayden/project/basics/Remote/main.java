package at.jayden.project.basics.Remote;

public class main {

    public static void main(String[] args) {

        Battery b1 = new Battery(90);
        Battery b2 = new Battery(80);

        Remote r1 = new Remote("black");

        r1.addBattery(b1);
        r1.addBattery(b2);

        r1.getStatus();


    }
}
