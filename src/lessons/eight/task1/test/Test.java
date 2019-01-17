package lessons.eight.task1.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        MyClass myClass = new MyClass(new MyClass(new MyClass(new MyClass(null, 1),2),3),4);


        Thread thread1 = new Thread(myClass);
        Thread thread2 = new Thread(myClass);
        Thread thread3 = new Thread(myClass);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class MyClass implements Runnable{
        MyClass next;
        int inf;
        public MyClass(MyClass next, int inf) {
            this.next = next;
            this.inf = inf;
        }

        @Override
        public void run() {
            while(next != null) {
                System.out.println(next + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
