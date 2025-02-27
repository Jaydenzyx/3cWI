package at.jayden.project.basics.Handy;

public class Cam {

    private String brand;
    private String model;
    public enum TYPE {Good, mid,low};
    private TYPE Qaulitytype;

    public Cam(String brand, String model, TYPE qaulitytype) {
        this.brand = brand;
        this.model = model;
        Qaulitytype = qaulitytype;
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

    public TYPE getQaulitytype() {
        return Qaulitytype;
    }

    public void setQaulitytype(TYPE qaulitytype) {
        Qaulitytype = qaulitytype;
    }

    public Photofile takePicture() {
        System.out.println("Picture taken");
        return new Photofile(32, "picture");
    }


}
