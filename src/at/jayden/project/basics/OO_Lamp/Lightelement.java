package at.jayden.project.basics.OO_Lamp;

public class Lightelement {

    public boolean isOn = false;
    private String name;
    private String color;
    private int powerconsumption;

    public Lightelement(String name, String color, int powerconsumption) {
        this.name = name;
        this.color = color;
        this.powerconsumption = powerconsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerconsumption() {
        return powerconsumption;
    }

    public void setPowerconsumption(int powerconsumption) {
        this.powerconsumption = powerconsumption;
    }

    public void turnOn() {
        powerconsumption = powerconsumption + 5;
        if (isOn) {
            System.out.println("Mein name ist " + this.name + "." + "Ich bin bereits eingeschaltet");
            powerconsumption = powerconsumption - 5;
        } else {
            isOn = true;
            System.out.println("On");
        }

    }


}
