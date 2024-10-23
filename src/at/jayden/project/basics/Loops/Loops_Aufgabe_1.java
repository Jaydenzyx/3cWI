package at.jayden.project.basics.Loops;

public class Loops_Aufgabe_1 {
    public static void main(String[] args) {

       //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        int sum = 0;

        for (int i = 1;i<=100; i ++){
            sum+=i;
        }

        System.out.println(sum);

    }
}
