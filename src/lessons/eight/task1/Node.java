package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;


public class Node implements Runnable {
    int inf;
    String label;
    volatile AtomicBoolean used;

    StringBuilder stringBuilder;

    Node left;
    Node right;

    public Node(int inf, String label, AtomicBoolean used, Node left, Node right, StringBuilder stringBuilder) {
        this.inf = inf;
        this.label = label;
        this.used = used;
        this.left = left;
        this.right = right;
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run(){
        try {
         recPreOrder();
        }catch (InterruptedException e){

        }
    }

    public void recPreOrder() throws InterruptedException{
        if (left!=null && used.compareAndSet(false, true)) {
            System.out.println(left.inf);
            System.out.println(Thread.currentThread().getName());
            System.out.println(stringBuilder.append(left.label + "->"));
            Thread.sleep(1000);
            left.recPreOrder();
        }
        if (right!=null && used.compareAndSet(false, true)) {
            System.out.println(right.inf);
            System.out.println(Thread.currentThread().getName());
            System.out.println(stringBuilder.append(right.label + "->"));
            Thread.sleep(1000);
            right.recPreOrder();
        }
    }

}
