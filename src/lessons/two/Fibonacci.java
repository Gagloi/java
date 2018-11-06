package lessons.two;

public class Fibonacci {

    public static int curr = 1;
    public static void main(String[] args) {
        System.out.println(next());
    }



    public static int lol(int curr){
        if (curr == 1){
            return 1;
        }
        if (curr == 2){
            return 1;
        }
        return lol(curr - 1) + lol(curr - 2);
    }
    public static int next(){
        int curr = Fibonacci.curr++;
        return  lol(curr);
    }

}
