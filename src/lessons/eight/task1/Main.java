package lessons.eight.task1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;


public class Main {


    public static void main(String[] args) {
        Tree tree = new Tree(new Node(0,null,null, new AtomicBoolean()), 0);
        Node node1 = new Node(8,new Node(9, new Node(10, null, null, new AtomicBoolean()), new Node(11, null, null, new AtomicBoolean()), new AtomicBoolean()),new Node(12, new Node(13, null, null, new AtomicBoolean()), new Node(14, null, null, new AtomicBoolean()), new AtomicBoolean()), new AtomicBoolean());
        Node node = new Node(1,new Node(2, new Node(3, null, null, new AtomicBoolean()), new Node(4, null, null, new AtomicBoolean()), new AtomicBoolean()),new Node(5, new Node(6, null, null, new AtomicBoolean()), new Node(7, null, null, new AtomicBoolean()), new AtomicBoolean()), new AtomicBoolean());
        tree.root =  new Node(100, node, node1, new AtomicBoolean());
        LogThread logThread = new LogThread(tree.root, new File("log.txt") );
        ThreadWork threadWork = new ThreadWork(tree.root);
        Thread thread1 = new Thread(threadWork);
        Thread thread2 = new Thread(threadWork);
        Thread thread3 = new Thread(threadWork);
        Thread thread4 = new Thread(threadWork);



        Thread log = new Thread(logThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        log.start();

    }
}
