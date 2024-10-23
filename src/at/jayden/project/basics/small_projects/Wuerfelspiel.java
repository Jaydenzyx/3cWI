package at.jayden.project.basics.small_projects;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();


        boolean isfinished = false;
        int rounds = 6;
        int playerOne = 0;
        int playerTwo = 0;

        while (!isfinished) {
            System.out.println("Du darfst noch " + rounds + " mal Würfeln\n");
            System.out.println("1. Würfeln");
            System.out.println("2. Spiel Beenden");
            int seletcion = scanner.nextInt();

            if (seletcion == 1) {

                int Randomnumber1 = Random.nextInt(6) + 1;
                int Randomnumber2 = Random.nextInt(6) + 1;

                playerOne += Randomnumber1;
                playerTwo += Randomnumber2;

                rounds -= 1;

                System.out.println("\nSpieler 1 hat " + Randomnumber1 + " gewürfelt");
                System.out.println("Spieler 2 hat " + Randomnumber2 + " gewürfelt\n");

                if (rounds == 0) {
                    System.out.println("Spieler 1 hat insgesamt " + playerOne + " gewürfelt ");
                    System.out.println("Spieler 2 hat insgesamt " + playerTwo + " gewürfelt ");

                    if (playerOne < playerTwo) {
                        System.out.println("Spieler 2 hat gewonnen");
                        isfinished = true;
                    } else if (playerOne > playerTwo) {
                        System.out.println("Spieler 1 hat gewonnen");
                        isfinished = true;
                    } else if (playerOne == playerTwo) {
                        System.out.println("Unentschieden! Keiner hat gewonnen");
                        isfinished = true;
                    }

                }


            }

            if (seletcion == 2) {
                isfinished = true;
            }

        }
    }
}
