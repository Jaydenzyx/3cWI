package at.jayden.project.basics.OO_Programming;

public class main {

    public static void main(String[] args) {


        Car c1 = new Car(7,210,"Mercedes","1234","red",7,60);
        System.out.println(c1.getFuelAmount());

        Car c2 = new Car(5,95,"Audi","12345","blue",5,53);

        Car c3 = new Car(4,100,"BMW","123456","black",3,30);

        c3.engine();

    }


}
