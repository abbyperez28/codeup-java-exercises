//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //WHILE LOOP
        int i = 5;

        while (i < 15) {
            System.out.println(i);
            i++;
            System.out.println(i);
        }

        //DO-WHILE LOOP
//        int x = 2;
//
//        do {
//            x += 2;
//            System.out.println(x);
//        } while (x < 100);


//        int x = 100;
//
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);

        long y = 2;

        do{
            System.out.println(y);
            y = y * y;
//            square = Math.pow(y, 2);
        } while (y < 1000000);



    }
}


