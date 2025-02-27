package at.jayden.project.basics.Handy;

public class memorycard {

    private int capacity;
    private int type;
    private Handy handy;
    private Photofile photofile;
    private Cam cam;

    public memorycard(int capacity, int type, Cam cam) {
        this.capacity = capacity;
        this.type = type;
        this.cam = cam;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Handy getHandy() {
        return handy;
    }

    public void setPhotofile(Photofile photofile) {
        this.photofile = photofile;
    }

    public Photofile getPhotofile() {
        return photofile;
    }

    public void setCam(Cam cam) {
        this.cam = cam;
    }

    public Cam getCam() {
        return cam;
    }

    public void storephotofile(Photofile photo) {
        if (cam.getQaulitytype() == Cam.TYPE.Good) {
            System.out.println("Photofile stored");
        } else if (cam.getQaulitytype() == Cam.TYPE.mid) {
            photo.setSizeMb(photo.getSizeMb() * 0.9);
            System.out.println("Photofile stored");
        } else if (cam.getQaulitytype() == Cam.TYPE.low) {
            photo.setSizeMb(photo.getSizeMb() * 0.8);
            System.out.println("Photofile stored");
        }
    }


}
