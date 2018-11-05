package lessons.three;

import java.util.Random;
import java.util.Scanner;


//В РАЗРАБОТКЕ!
//
//
//
//
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomize = new Random();
        System.out.println("Enter value from 1 to 100");
        int value = scanner.nextInt();
        boolean win = true;
        int random = randomize.nextInt(100);
        System.out.println("Value: " + value);
        System.out.println("Random number: " + random);
        int currentRandom = random;
        while(win){
            if (random < value){
                System.out.println("Is number leather than value?");
                boolean answer = answer(scanner.next());
                if(answer){
                    random = randomize.nextInt(100 - random) + random;
                    System.out.println("Random number: " + random);
                }
            }else if (random > value){
                System.out.println("Is number higher than value?");
                boolean answer = answer(scanner.next());
                if(answer){
                    random = randomize.nextInt(random);
                    System.out.println("Random number: " + random);
                }
            }if (random == value){
                System.out.println("This value = " + random);
                win = false;
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
}
