package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        Tree tree = new Tree(new Node(1,null,null, new AtomicBoolean()));
        tree.root =  new Node(2,new Node(34, new Node(654, null, null, new AtomicBoolean()), new Node(123, null, null, new AtomicBoolean()), new AtomicBoolean()),new Node(43, new Node(234, null, null, new AtomicBoolean()), new Node(987, null, null, new AtomicBoolean()), new AtomicBoolean()), new AtomicBoolean());

        Thread thread1 = new Thread(tree.root);
        Thread thread2 = new Thread(tree.root);
        Thread thread3 = new Thread(tree.root);
        Thread thread4 = new Thread(tree.root);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
