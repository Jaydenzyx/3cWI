package at.jayden.project.basics.OO_Programming;

public class Tire {

    // winter oder sommmer reifen , größe , farbe
    public enum TYPE {Winter, Summer};
    private int Tiresize;
    private String Tirecolor;

    public Tire(int tiresize, String tirecolor) {
        Tiresize = tiresize;
        Tirecolor = tirecolor;
    }
}
