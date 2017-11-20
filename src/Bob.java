import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Say something to Bob!");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        boolean endsWithQuestionMark = userInput.endsWith("?");
        boolean isYelling = userInput.equals(userInput.toUpperCase());
        boolean didNotSayAnything = userInput.isEmpty();

        if(endsWithQuestionMark) {
            System.out.println("Sure.");
        } else if (isYelling) {
            System.out.println("Whoah, chill out!");
        } else if (didNotSayAnything) {
            System.out.println("Fine, be that way.");
        } else {
            System.out.println("Whatever.");
        }



        }
    }

