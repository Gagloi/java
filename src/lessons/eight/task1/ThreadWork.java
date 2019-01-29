package lessons.eight.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.function.Consumer;

public class ThreadWork implements Runnable{
    Node root;
    private FileWriter writer;

    ThreadWork (Node root, File file){
        this.root = root;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                if (((Node) o).used.compareAndSet(false, true)){
                    //System.out.println(((Node) o).inf + Thread.currentThread().getName());
                    try {
                        writer.write(Thread.currentThread().getName() + " get the node with info " + node.inf + "\n");
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(5000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        consumer.accept(root);
        root.recPreOrder(consumer);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
