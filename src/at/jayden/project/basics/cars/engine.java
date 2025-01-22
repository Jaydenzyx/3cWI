package at.jayden.project.basics.cars;

public class engine {

    private int ps;
    public enum TYPE {DIESEL, GAS};
    private String color;

    public engine(int ps, String color, TYPE diesel) {
        this.ps = ps;
        this.color = color;
    }


    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }



}
