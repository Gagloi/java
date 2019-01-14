package lessons.eight.task1;


import java.util.function.Consumer;

public class Tree implements Runnable{
    Node root;


    @Override
    public void run() {
        System.out.println("Я ран!");
        root.run();
    }

    public Tree(Node root){
        this.root = root;
    }


}
