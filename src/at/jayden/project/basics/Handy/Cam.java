package at.jayden.project.basics.Handy;

public class Cam {

    private String brand;
    private String model;
    private int resolution;

    public Cam(String brand, String model, int resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

}
