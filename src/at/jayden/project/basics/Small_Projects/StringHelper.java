package at.jayden.project.basics.Small_Projects;

public class StringHelper {

    public static void main(String[] args) {

        String word = "hallo";
        System.out.println(reverseString(word));

        String rsv = "wow";
        System.out.println(isPalindrome(rsv));



        System.out.println(countletters("anna", 'a'));

    }

    public static  String reverseString (String word){

        String reverseWord = "";
        char letters;

        for (int i =0;i<word.length();i++){
            letters = word.charAt(i);
            reverseWord = letters + reverseWord;
        }

        return  reverseWord;
    }

    public static  boolean isPalindrome(String rsv){

        String reverseWord = "";
        char letters;

        for (int i =0;i<rsv.length();i++){
            letters = rsv.charAt(i);
            reverseWord = letters + reverseWord;
        }

        if (rsv.equals(reverseWord)){
            return true;
        }else {
            return false;
        }
    }

    public static int countletters (String word, char c){


        int count = 0;
        for (int i = 0; i<word.length();i++){
            if(word.charAt(i) == c){
            count ++;
            }
        }
        return count;

    }

}
