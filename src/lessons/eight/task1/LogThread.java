package lessons.eight.task1;

import java.util.Random;
import java.util.function.Consumer;

public class LogThread implements Runnable {

    private Node root;
    private StringBuilder stringBuilder;

    LogThread(Node root, StringBuilder stringBuilder){
        this.root = root;
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
         recPreOrder(root);

    }

    public void recPreOrder(Node node){
        if (node.left!=null) {
            try {
                System.out.println(stringBuilder);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            recPreOrder(node.left);
        }
        if (node.right!=null) {
            try {
                System.out.println(stringBuilder);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            recPreOrder(node.right);
        }
    }
}
