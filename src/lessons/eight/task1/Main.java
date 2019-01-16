package lessons.eight.task1;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Tree<Tree.Node> tree = new Tree<Tree.Node>(new Tree.Node(0, "0", new AtomicBoolean(), stringBuilder));

        Thread thread1 = new Thread(tree);
        Thread thread2 = new Thread(tree);
        Thread thread3 = new Thread(tree);
        Thread thread4 = new Thread(tree);
        Thread stringThread = new Thread();


        tree.traverseTree2(tree.root);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
