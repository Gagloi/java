package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = new Node(4, "thirdLeft", new AtomicBoolean(), new Node(5, "secondLeft", new AtomicBoolean(), null, null, stringBuilder), new Node(3, "thirdRight", new AtomicBoolean(), null, null, stringBuilder), stringBuilder);
        Tree tree1 = new Tree(new Node(1, "third", new AtomicBoolean(), node, node, stringBuilder));

        Thread thread1 = new Thread(tree1);
        Thread thread2 = new Thread(tree1);
        Thread thread3 = new Thread(tree1);
        Thread thread4 = new Thread(tree1);
        Thread stringThread = new Thread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
