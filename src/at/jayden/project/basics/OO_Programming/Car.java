package at.jayden.project.basics.OO_Programming;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Tank tank;
    private Engine engine;
    private String brand;
    private String serialNumber;
    private String color;
    private int speed;
    private List<RearMirror> mirrors;
    private List<Tire> tires;


    int honkcounter = 0;


    public Car(Engine engine,String brand, String serialNumber, String color,Tank tank) {
        this.engine = engine;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
        this.tank = tank;
    }


    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public void addTire(Tire tiress) {
        this.tires.add(tiress);
    }


    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }


    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.tank.getFuelamount() > this.tank.getMaxFuel() * 0.10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough Fuel to go to Superboost");
        }
    }


    public void honk() {
        System.out.println("Tuutuu");
        honkcounter = honkcounter + 1;

    }

    public void getRemainingRange() {
        int RemainingRange = this.tank.getFuelamount() / this.engine.getFuelConsumption() * 100;
        System.out.println(RemainingRange + "km");
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

}








