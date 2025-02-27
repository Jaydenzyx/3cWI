package at.jayden.project.basics.Handy;

public class Handy {

    private String brand;
    private String model;
    private Cam cam;
    private SimCard simCard;
    private memorycard memorycard;

    public Handy(String brand, String model, Cam cam, SimCard simCard, memorycard memorycard) {
        this.brand = brand;
        this.model = model;
        this.cam = cam;
        this.simCard = simCard;
        this.memorycard = memorycard;
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

    public void takepicture() {
        Photofile photo = cam.takePicture();
        if(memorycard.getCapacity()<photo.getSizeMb()){
            System.out.println("Not enough space on memorycard");
            return;
        }else {
            memorycard.storephotofile(photo);
        }

    }



}
