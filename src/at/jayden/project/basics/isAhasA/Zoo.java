package at.jayden.project.basics.isAhasA;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private String Street;
    private List<Animal> animals;

    public Zoo(String name, String Street) {
        this.name = name;
        this.Street = Street;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimal() {
        for (Animal animal : animals) {
            System.out.println("Weight: " + animal.getWeight() + " Height: " + animal.getHeight());
        }
    }

    public void makeShow() {
        System.out.println("The Show has just started");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

}
