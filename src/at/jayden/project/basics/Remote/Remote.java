package at.jayden.project.basics.Remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private String color;
    private List<Battery> batteries;


    public Remote(String color) {
        this.color = color;
        this.batteries = new ArrayList<>();
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }

    public void addBattery(Battery batteriess){
        this.batteries.add(batteriess);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getStatus(){
        int sum = 0;
        for (Battery battery : batteries){
            sum += battery.getChargingstatus();
        }

        sum = sum/ batteries.size();
        System.out.println(sum);
        }
    }



