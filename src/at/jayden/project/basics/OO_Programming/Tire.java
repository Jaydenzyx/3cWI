package at.jayden.project.basics.OO_Programming;

public class Tire {

    // winter oder sommmer reifen , größe , farbe
    public enum TYPE {Winter, Summer}

    ;
    private int Tiresize;
    private String Tirecolor;
    private TYPE Tiretype;

    public Tire(int tiresize, String tirecolor, TYPE tiretype) {
        Tiresize = tiresize;
        Tirecolor = tirecolor;
        Tiretype = tiretype;

    }

    public int getTiresize() {
        return Tiresize;
    }

    public void setTiresize(int tiresize) {
        Tiresize = tiresize;
    }

    public String getTirecolor() {
        return Tirecolor;
    }

    public void setTirecolor(String tirecolor) {
        Tirecolor = tirecolor;
    }
}
