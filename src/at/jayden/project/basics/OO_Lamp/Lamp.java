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

    public void addLightelement(Lightelement lightelement){
        this.lightelements.add(lightelement);
    }

}
