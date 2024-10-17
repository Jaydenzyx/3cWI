import java.util.Scanner;

public class WoerterRaten {

    public static void main(String[] args) {

        String word = "Hans";

        char[] chararray = word.toCharArray();
        char[] hiddenword = new char[chararray.length];

        System.out.println(hiddenword);

        for (int i = 0; i < hiddenword.length; i++) {
            hiddenword[i] = '*';
        }

        Scanner scanner = new Scanner(System.in);
        boolean notfinished = true;

        while (notfinished) {
            String input = scanner.nextLine();
            char guess = input.charAt(0);

            for (int i = 0; i < hiddenword.length; i++) {
                if (word.charAt(i) == guess) {
                    hiddenword[i] = guess;
                }
            }

            if (new String(hiddenword).equals(word)) {
                System.out.println("Gewonnen! Das Wort war: " + word);
                break;
            }

            System.out.println(hiddenword);
        }
    }
}
