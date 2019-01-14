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
        System.out.println("ruuuuuuun");
        if(used.compareAndSet(false, true)){
            try {
             recPreOrder();
            }catch (InterruptedException e){

            }
        }
    }

    public void recPreOrder() throws InterruptedException{
        if (left!=null) {
            System.out.println(left.inf);
            System.out.println(left);
            Thread.sleep(1000);
            left.recPreOrder();
        }
        if (right!=null) {
            System.out.println(right.inf);
            System.out.println(right);
            Thread.sleep(1000);
            right.recPreOrder();
        }
    }

}
