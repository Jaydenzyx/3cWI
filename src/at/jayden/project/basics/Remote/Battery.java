package at.jayden.project.basics.Remote;

public class Battery {
    private int chargingstatus;

    public Battery(int chargingstatus) {
        this.chargingstatus = chargingstatus;
    }

    public int getChargingstatus() {
        return chargingstatus;
    }

    public void setChargingstatus(int chargingstatus) {
        this.chargingstatus = chargingstatus;
    }
}
