package at.jayden.project.basics.isAhasA;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal(10, 20);
        Animal a2 = new Animal(30, 40);

        Zoo z1 = new Zoo("Zoo1", "Street1");

        z1.addAnimal(a1);
        z1.addAnimal(a2);


        Dog d1 = new Dog(10, 20);

        z1.addAnimal(d1);

        z1.printAnimal();

        d1.bark();

    }
}
