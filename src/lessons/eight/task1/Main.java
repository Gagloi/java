package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        Tree tree = new Tree(new Node(1,null,null, new AtomicBoolean()));
        Node node1 = new Node(8,new Node(9, new Node(10, null, null, new AtomicBoolean()), new Node(11, null, null, new AtomicBoolean()), new AtomicBoolean()),new Node(12, new Node(13, null, null, new AtomicBoolean()), new Node(14, null, null, new AtomicBoolean()), new AtomicBoolean()), new AtomicBoolean());
        Node node = new Node(1,new Node(2, new Node(3, null, null, new AtomicBoolean()), new Node(4, null, null, new AtomicBoolean()), new AtomicBoolean()),new Node(5, new Node(6, null, null, new AtomicBoolean()), new Node(7, null, null, new AtomicBoolean()), new AtomicBoolean()), new AtomicBoolean());
        tree.root =  new Node(100, node, node1, new AtomicBoolean());
        ThreadWork threadWork = new ThreadWork(tree.root);
        Thread thread1 = new Thread(threadWork);
        Thread thread2 = new Thread(threadWork);
        Thread thread3 = new Thread(threadWork);
        Thread thread4 = new Thread(threadWork);
        StringBuilder stringBuilder = new StringBuilder();

        Thread stringThread = new Thread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
