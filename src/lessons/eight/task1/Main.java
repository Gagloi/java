package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Tree tree = new Tree(new Node(1, "first", new AtomicBoolean(), new Node(2, "secondLeft", new AtomicBoolean(), null, null, stringBuilder), new Node(3,"secondRight", new AtomicBoolean(), null, null, stringBuilder), stringBuilder));
        Thread thread1 = new Thread(tree);
        Thread thread2 = new Thread(tree);
        Thread thread3 = new Thread(tree);
        Thread thread4 = new Thread(tree);



        thread1.run();
        thread2.run();

    }
}
