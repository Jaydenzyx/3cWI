package at.jayden.project.basics.OO_Lamp;

import java.util.List;

public class Lamp {

    private String color;
    private List<Lightelement> lightelements;

    public Lamp(String color, List<Lightelement> lightelements) {
        this.color = color;
        this.lightelements = lightelements;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Lightelement> getLightelements() {
        return lightelements;
    }

    public void addLightelement(Lightelement lightelement) {
        this.lightelements.add(lightelement);
    }

    public void turnallOn() {

        for (Lightelement/*typ*/ lightelement /*name*/ : lightelements /*von welcher liste*/) {
            lightelement.isOn = true;
            lightelement.setPowerconsumption(5);
        }

    }


    public void getOverallPowerConsumption() {
        int i = 0;
        for (Lightelement/*typ*/ lightelement /*name*/ : lightelements /*von welcher liste*/) {
            i += lightelement.getPowerconsumption();
        }
        System.out.println(i);
    }

    public void printNamesOfLightElements() {

        for (Lightelement/*typ*/ lightelement /*name*/ : lightelements /*von welcher liste*/) {
            System.out.println(lightelement.getName());
        }

    }


}




