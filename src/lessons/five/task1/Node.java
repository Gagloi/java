package lessons.five.task1;

import java.util.function.Consumer;

public class Node {
    int inf;

    Node left;
    Node right;

    public Node(int inf, Node left, Node right) {
        this.inf = inf;
        this.left = left;
        this.right = right;
    }

    public void recPreOrder(Consumer consumer){
        if (left!=null) {
            System.out.println(left.inf);
            consumer.accept(left);
            left.recPreOrder(consumer);
        }
        if (right!=null) {
            System.out.println(right.inf);
            consumer.accept(right);
            right.recPreOrder(consumer);
        }
    }

}
