package at.jayden.project.basics.Handy;

public class memorycard {

    private int capacity;
    private int type;

    public memorycard(int capacity, int type) {
        this.capacity = capacity;
        this.type = type;
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

}
