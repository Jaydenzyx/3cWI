package at.jayden.project.basics.While_and_Switch;

import java.util.Random;

public class Switch_Aufgabe_1 {

    public static void main(String[] args) {



        Random random = new Random();

        int randomNumber = random.nextInt(6)+5;

// Wenn der Wert 10 ist gib aus Ten

        switch (randomNumber){

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("6");
                break;

            case 7:
                System.out.println("7");
                break;

            case 8:
                System.out.println("8");
                break;

            case 9:
                System.out.println("9");
                break;

            case 10:
                System.out.println("10");
                break;

        }
// Wenn der Wert 9 ist gib aus Nine

// Wenn der Wert 8 ist gib aus Eight

// etc.

        }
}
