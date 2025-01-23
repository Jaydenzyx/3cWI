package at.jayden.project.basics.OO_Lamp;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {



    Lightelement le1 = new Lightelement("Luca","black",9);
    Lightelement le2 = new Lightelement("Tobias","black",9);
    Lightelement le3 = new Lightelement("Nejo","black",9);
    Lightelement le4 = new Lightelement("Damian","black",9);
    Lightelement le5 = new Lightelement("Leon","black",9);
    Lightelement le6 = new Lightelement("Raider","black",9);
    Lightelement le7 = new Lightelement("Hans","black",9);
    Lightelement le8 = new Lightelement("Kim","black",9);

    List <Lightelement> lightelements = new ArrayList<>();

    Lamp l1 = new Lamp("blue", lightelements);

    l1.addLightelement(le1);

    le2.turnOn();
    System.out.println(le1.getPowerconsumption());

    le2.turnOn();

    }
}
