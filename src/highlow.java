//import java.util.Scanner;
//
//public class highlow {
//
//    public static int numberOfGuesses;
//    public static int gameNumber;
//
//    public static void main(String[] args) {
//        initGame();
//    }
//
//    public static void initGame() {
//        boolean programRunning;
//        boolean gameRunning = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the High / Low Guessing Game!");
//        do {
//            gameNumber = randomWithRange(1, 100);
//            System.out.println("The random number is: " + gameNumber);
//            do {
//                gameRunning = runRound(sc);
//            } while (gameRunning);
//            programRunning = getYesOrNo(sc).equals("y");
//        } while (programRunning);
//        System.out.println("Good bye!");
//    }
//
//    public static boolean runRound(Scanner sc) {
//
//        boolean gameNotWon = false;
//        System.out.print("Please enter a guess: ");
//
//        int playerGuess = getInteger(1, 100, sc);
//
//            if (playerGuess == gameNumber) {
//                System.out.println("GOOD GUESS!");
//                gameNotWon = false;
//
//            } else if (playerGuess > gameNumber) {
//                System.out.println("LOWER");
//                numberOfGuesses++;
//                gameNotWon = true;
//                System.out.println("Number of guesses made: " + numberOfGuesses);
//
//            } else {
//                System.out.println("HIGHER");
//                gameNotWon = true;
//                numberOfGuesses++;
//                System.out.println("Number of guesses made: " + numberOfGuesses);
//            }
//            return gameNotWon;
//    }
//
//    public static int randomWithRange(int min, int max)
//    {
//        int range = (max - min) + 1;
//        return (int)(Math.random() * range) + min;
//    }
//
//
//    public static int getInteger(int min, int max, Scanner sc) {
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max, sc);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max, sc);
//        }
//    }
//
//    public static String getYesOrNo(Scanner sc) {
//        String userChoice;
//        do {
//            System.out.println("Do you wish to play again? [y/n]: ");
//            userChoice = sc.next().trim();
//        } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
//        return userChoice;
//    }
//
//}

//public class RestaurantDish {
//
//    public static void main(String[] args) {
//
//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//
//    public string eat() {
//        return "nom, nom, nom!";
//    }
//
//    }
//}
//
//public class RestaurantTest {
//
//    RestaurantDish dish = new RestaurantDish();
//    dish.costInCents = "1500 ";
//    dish.nameOfDish = "Chicken Pesto";
//    dish.wouldRecommend = "yes!";
//    }


//    Create a class of static properties and methods called BurgerTools
//
//        Include a string property of mostPopularTopping
//        Include an int property of averageDaysBeforeExpiration
//        Include an int property of temperatureWhenCooked
//        Include a void method called grill() that prints out “Grilling burger”
//
//        Create a class called BurgerTester to test assigning and printing property values
//        and testing methods
//
//public class BurgerTools {
//    public String mostPopularTopping;
//    public int averageDaysBeforeExpiration;
//    public int temperatureWhenCooked;
//
//    public static void main(String[] args) {
//        public String grill() = "Grilling burger!";
//        System.out.println(grill);
//    }
//}
//
