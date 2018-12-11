package lessons.six.task1;


import java.util.function.Consumer;

public class Tree<T extends Node> {
    Node root;
    public void traverse(Consumer consumer){
      root.recPreOrder(consumer);
    }


}
