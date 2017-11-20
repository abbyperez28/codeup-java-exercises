//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        //WHILE LOOP
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15


        //        int i = 5;
        //
        //        while (i < 15) {
        //            System.out.println(i);
        //            i++;
        //            System.out.println(i);
        //        }

        //DO-WHILE LOOP
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

        //        int x = 0;
        //
        //        do {
        //            System.out.println(x);
        //            x += 2;
        //        } while (x <= 100);


        //        int x = 100;
        //
        //        do {
        //            System.out.println(x);
        //            x -= 5;
        //        } while (x >= -10);


        //        long y = 2;
        //
        //        do{
        //            System.out.println(y);
        //            y = y * y;
        ////            square = Math.pow(y, 2);
        //        } while (y < 1000000);

//        -------------OR-------------

//                do{
//                    System.out.println(y);
//                    y *= y;
//                } while (i < 1000000L);

                //REFRACTOR

//        for(long y = 2; y < 1000000; y *= y) {
//            System.out.println(y);
//        }


                //FIZZ BUZZ
//  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//  Write a program that prints the numbers from 1 to 100.
//  For multiples of three print “Fizz” instead of the number
//  For the multiples of five print “Buzz”.
//  For numbers which are multiples of both three and five print “FizzBuzz”.

//        public class fizzbuzz {
//            public static void main(String[] args) {
//                for (int i = 1; i <= 100; i++) {
//                    if(i % 3 == 0 && i % 5 ==0){
//                        System.out.println("Fizz Buzz");
//                    } else if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else {
//                        System.out.println(i);
//                    }
//            }


//  *********Display a table of powers******** >>>REVIEW<<<<
//
//  Prompt the user to enter an integer.
//  Display a table of squares and cubes from 1 to the value entered.
//  Ask if the user wants to continue.
//  Assume that the user will enter valid data.
//  Only continue if the user agrees to.

//                Scanner sc = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to?");
//        int userInt = sc.nextInt();
//
//        System.out.println("\nHere is your table!");
//        System.out.println("\nnumber | squared | cubed");
//        System.out.println("------ | ------ | ------");
//
//        for (int i = 1; i <= userInt; i += 1) {
//            System.out.print(i);
//            System.out.print(i * i);
//            System.out.print(i * i * i);
//        }
//
//    Scanner sc = new Scanner(System.in);
//    String userChoice;
//
//    do {
//        System.out.println("Pkease enter a grade: ");
//        int gradeEntered = sc.nextInt();
//        char letterGrade = ' ';
//
//        if(gradeEntered >= 88) {
//            letterGrade = 'A';
//        } else if (gradeEntered >= 80) {
//            letterGrade = 'B';
//        } else if (gradeEntered >= 67) {
//            letterGrade = 'C';
//        } else if (gradeEntered >= 60) {
//            letterGrade = 'D';
//        } else if (gradeEntered >= 0) {
//
//        }
//
//        System.out.println(letterGrade);
//
//        System.out.println("\nDo you wish to continue? [y/n] ");
//
//    } while (userChoice.equalsIgnoreCase( anotherString: "y") || userChoice.equalIsIgnoreCase( anotherString: "yes"));
//
//
//

    }
}







