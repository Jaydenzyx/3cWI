package at.jayden.project.basics.Small_Projects;

import java.util.Scanner;

public class Bankomat_Beispiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean isfinished = false;

        int Kontostand = 0;
        while (!isfinished) {

            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand");
            System.out.println("4 Beenden");
            int seletcion = scanner.nextInt();
            if (seletcion == 1) {
                System.out.println("Geben sie den Betrag ein den sie Einzahlen möchten");
                ;

                if(scanner.hasNextInt()){
                    int Einzahlen = scanner.nextInt();

                    if (Einzahlen>0){
                        Kontostand+=Einzahlen;
                        System.out.println("erfolgreich" + " " + Kontostand + "€");
                    }

                    else{
                        System.out.println("Geben sie bitte eine positive Zahl ein");
                    }
                }

                else {
                    System.out.println("geben sie bitte eine gültige Zahl ein");
                    scanner.next();
                }

            }


            if(seletcion == 2){
                System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten:");

                if(scanner.hasNextInt()){

                    int Abheben = scanner.nextInt();

                    if (Abheben>0){
                        Kontostand-= Abheben;
                        System.out.println("Erfolgreich" +" " + Kontostand + "€");
                    }

                    else {
                        System.out.println("Geben sie bitte eine Positive Zahl ein");
                    }

                }

                else {
                    System.out.println("Eingabe Ungültig geben sie bitte eine gültige Zahl ein");
                    scanner.next();
                }

            }

            if (seletcion == 3){
                System.out.println("Ihr Kontostand Beträgt:" + Kontostand + "€");
            }

            if (seletcion == 4){
                isfinished = true;
            }

        }
    }
}

