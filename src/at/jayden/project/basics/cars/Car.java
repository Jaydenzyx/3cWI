package at.jayden.project.basics.cars;

public class Car {

    private int distancedriven;
    private String color;
    private int Maxspeed;
    private int basicprice;
    private double basicconsumption;
    private manufacturer manufacturer;
    private engine engine;

    public Car(int distancedriven, String color, int maxspeed, int basicprice, double basicconsumption, at.jayden.project.basics.cars.manufacturer manufacturer, at.jayden.project.basics.cars.engine engine) {
        this.distancedriven = distancedriven;
        this.color = color;
        Maxspeed = maxspeed;
        this.basicprice = basicprice;
        this.basicconsumption = basicconsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }


    public int getDistancedriven() {
        return distancedriven;
    }

    public void setDistancedriven(int distancedriven) {
        this.distancedriven = distancedriven;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxspeed() {
        return Maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        Maxspeed = maxspeed;
    }

    public int getBasicprice() {
        int minusrabatt = basicprice/100 * manufacturer.getRabatt();
        basicprice = basicprice - minusrabatt;
        return basicprice;
    }

    public void setBasicprice(int basicprice) {
        this.basicprice = basicprice;
    }

    public double getBasicconsumption() {
        if(distancedriven >= 50000){
            return basicconsumption * 1.09;
        }
        else{
            return basicconsumption;
        }

    }

    public void setBasicconsumption(double basicconsumption) {
        this.basicconsumption = basicconsumption;
    }
}
