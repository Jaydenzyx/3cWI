package at.jayden.project.basics.OO_Lamp;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {



    Lightelement le1 = new Lightelement("Luca","black",0);
    Lightelement le2 = new Lightelement("Tobias","black",0);
    Lightelement le3 = new Lightelement("Nejo","black",0);
    Lightelement le4 = new Lightelement("Damian","black",0);
    Lightelement le5 = new Lightelement("Leon","black",0);
    Lightelement le6 = new Lightelement("Raider","black",0);
    Lightelement le7 = new Lightelement("Hans","black",0);
    Lightelement le8 = new Lightelement("Kim","black",0);

    List <Lightelement> lightelements = new ArrayList<>();

    Lamp l1 = new Lamp("blue", lightelements);

        l1.addLightelement(le1);
        l1.addLightelement(le2);
        l1.addLightelement(le3);
        l1.addLightelement(le4);
        l1.addLightelement(le5);
        l1.addLightelement(le6);
        l1.addLightelement(le7);
        l1.addLightelement(le8);

        l1.getOverallPowerConsumption();

        l1.printNamesOfLightElements();

    }
}
