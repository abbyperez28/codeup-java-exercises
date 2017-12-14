//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInt = sc.nextInt();
        System.out.println(userInt);

        sc.nextLine(); //enables to skip \n



        System.out.println("Please enter three words: ");

        String firstWord, secondWord, thirdWord;

        firstWord = sc.nextLine();
        secondWord = sc.nextLine();
        thirdWord = sc.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);



        System.out.println("Please enter a sentence ");
        String sentence = sc.nextLine();
        System.out.println(sentence);


        System.out.print("Please enter the room length: ");
        String lengthString = sc.nextLine();
        System.out.println(lengthString);

        double length = Double.parseDouble(lengthString);
//        System.out.println(length);



        System.out.print("Please enter the room width: ");
        String widthString = sc.nextLine();
//        System.out.println(widthString);

        double width = Double.parseDouble(widthString);
//        System.out.println(width);
        System.out.printf("Then length is %f the width is %f, length, width");
        //****Review "printf" and "5f"*******

        double area = width * length;
        double perimeter = width * 2 + length * 2;

//        System.out.println(area);
//        System.out.println(perimeter);

        System.out.printf("%f = %f x %f\n", area, length, width);
        System.out.printf("%f = 2 x %f + 2 x %f\n", perimeter, length, width);

    }

}
