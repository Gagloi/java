package lessons.eight.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.function.Consumer;

public class ThreadWork implements Runnable{
    Node root;

    ThreadWork (Node root){
        this.root = root;

    }


    @Override
    public void run() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                if (((Node) o).used.compareAndSet(false, true)){
                    ((Node) o).label = Thread.currentThread().getName() + " get the node " + ((Node) o).inf;
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(5000));
                        ((Node) o).label = Thread.currentThread().getName() + " stop working with node " + ((Node) o).inf;
                        Tree.isAllNodes++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        consumer.accept(root);
        root.recPreOrder(consumer);
    }


}
