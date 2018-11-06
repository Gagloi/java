package lessons.three;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = initValue(scanner);

        boolean win = true;

        int min = 0;
        int max = 100;
        int random = myRandom(min, max);

        System.out.println("Value: " + value);
        System.out.println("Random number: " + random);

        while(win){
            if (question()) {
                System.out.println("Is value leather than " + random + " ?");
                boolean answer = answer(scanner.next());
                if (answer) {
                    max = random;
                    random = myRandom(min, max);
                } else {
                    min = random;
                    random = myRandom(min, max);
                }
                if (random == value) {
                    System.out.println("This value = " + random);
                    win = false;
                }
            }else {
                System.out.println("Is value higher than " + random + " ?");
                boolean answer = answer(scanner.next());
                if (!answer) {
                    max = random;
                    random = myRandom(min, max);
                } else {
                    min = random;
                    random = myRandom(min, max);
                }
                if (random == value) {
                    System.out.println("This value = " + random);
                    win = false;
                }
            }
        }
    }

    public static boolean answer(String answer){
        if (answer.equals("Yes")) {
            return true;
        }else{
            return false;
        }
    }

    public static int myRandom(int from, int to){
        Random random = new Random();
        return random.nextInt(to - from) + (from + 1);
    }

    public static int initValue(Scanner scanner){
        Random randomize = new Random();
        System.out.println("Enter value from 1 to 100");
        return scanner.nextInt();
    }

    public static boolean question(){
        Random random = new Random();
        int res = random.nextInt(2);
        if (res == 1){
            return true;
        }else {
            return false;
        }
    }
}
