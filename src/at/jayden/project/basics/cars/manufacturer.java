package at.jayden.project.basics.cars;

public class manufacturer {

private String name;
private String Nationality;
private int Rabatt;

    public manufacturer(String name, String nationality, int rabatt) {
        this.name = name;
        Nationality = nationality;
        Rabatt = rabatt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public int getRabatt() {
        return Rabatt;
    }

    public void setRabatt(int rabatt) {
        Rabatt = rabatt;
    }
}
