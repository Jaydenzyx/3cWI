package at.jayden.project.basics.While_and_Switch;

import java.util.Random;

public class While_Aufgabe_1 {

    public static void main(String[] args) {

        boolean isfinished = false;
        int sum = 0;

        while (!isfinished) {

            Random random = new Random();

            int randomNumber = random.nextInt(21) + 10;
            sum += randomNumber;

            if (randomNumber == 15 || randomNumber == 25) {
                System.out.println(sum);
                isfinished = true;
            }
        }
    }

}
