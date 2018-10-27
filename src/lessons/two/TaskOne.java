package lessons.two;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    //Не ВЫДЕРЖАЛ посмотрел на StackOverflow (((
    public static int fibo(int curr){
       if (curr == 1){
           return 1;
       }
       if (curr == 2){
           return 1;
       }
       return fibo(curr - 1) + fibo(curr - 2);
    }


}
