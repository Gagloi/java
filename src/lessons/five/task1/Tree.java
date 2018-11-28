package lessons.five.task1;


import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class Tree {
    Node root;

    public void traverse(Consumer consumer){
      root.recPreOrder(consumer);
    }




    public Tree(Node root){
        this.root = root;
    }


}
