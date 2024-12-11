package at.jayden.project.basics.OO_Programming;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type;


    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }



    public void drive(int amount){
        System.out.println("Your driving with " + amount + "kmh");
        if(amount <= 50){
            System.out.println("slow mode");
        }else {
            System.out.println("fast mode");
        }
    }


    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    //wagagw

}
