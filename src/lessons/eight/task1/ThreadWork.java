package lessons.eight.task1;

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
                    //System.out.println(((Node) o).inf + Thread.currentThread().getName());
                    root.builder.append(Thread.currentThread().getName() + " get the node with info " + ((Node) o).inf + "\n");
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(5000));
                        root.builder.append(Thread.currentThread().getName() + " stopped work with node with info  " + ((Node) o).inf + "\n");
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
