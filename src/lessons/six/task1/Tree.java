package lessons.six.task1;


import java.util.function.Consumer;

public class Tree {
    Node root;
    public void traverse(Consumer consumer){
      root.recPreOrder(consumer);
    }


}
