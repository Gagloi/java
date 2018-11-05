package lessons.three;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число от 1 до 100: ");
        int number = scan.nextInt();
        int randomize = 100;
        boolean win = true;
        while (win){
            int next = random.nextInt(randomize);
            if (next < number){
                System.out.println("Число меньше * ?");
                scan.next();
            }else if (next > number){
                System.out.println("Число больше * ?");
            }else if (next == number){
                System.out.println("Красавчик!");
                win = false;
            }
        }
    }

    public static boolean otvet(String string){
        if (string.equals("Yes")){

        }else{

        }
    }
}
