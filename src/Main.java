import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Word Generator");
        String continuePro;
	    do {
            System.out.println("Please enter a word to translate: ");

            String engWord = scan.nextLine();

            System.out.println("The word "+ engWord + " is " + generatePigLatin(engWord) + " in Pig Latin!");

            System.out.println("Would you like to print another word? Y/N");
            continuePro = scan.nextLine();
        } while (continuePro.equalsIgnoreCase("Y"));
        System.out.println("Thanks for using the Pig Latin Word Generator!");

    }
    private static String generatePigLatin(String word) {

        char startLetter = word.charAt(0);
        if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
                || startLetter == 'u') {
            word = word.concat("way");

        } else {
            String startingLet;
            if (word.charAt(1) == 'h') {
                startingLet = word.substring(0, 2);
                word = word.concat(startingLet).concat("ay");
                word = word.substring(2);
            } else {
                startingLet = String.valueOf(startLetter);
                word = word.concat(startingLet).concat("ay");
                word = word.substring(1);
            }

        }
        return word;
    }
}
