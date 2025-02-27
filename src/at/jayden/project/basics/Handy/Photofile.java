package at.jayden.project.basics.Handy;

public class Photofile {

    private double sizeMb;
    private String name;

    public Photofile(int sizeMb, String name) {
        this.sizeMb = sizeMb;
        this.name = name;
    }

    public double getSizeMb() {
        return sizeMb;
    }

    public void setSizeMb(double sizeMb) {
        this.sizeMb = sizeMb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
