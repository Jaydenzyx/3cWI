package at.jayden.project.basics.cars;

import at.jayden.project.basics.OO_Programming.Engine;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {

    engine e1 = new engine(200,"black",engine.TYPE.DIESEL);
    manufacturer m1 = new manufacturer("Leon","guam",5);

    Car c1 = new Car(47000,"black",200,17000,9.0,m1,e1);

        System.out.println(c1.getBasicprice());
        System.out.println(m1.getRabatt() + "%");
        System.out.println(c1.getBasicconsumption());


    }
}
