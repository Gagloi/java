package lessons.eight.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Tree<T> implements Runnable{
    public volatile Node<T> root;
    public Tree(T rootData) {
        root = new Node<T>(0, "0", new AtomicBoolean(), new StringBuilder());
        root.data = rootData;
        ArrayList<Node<T>> list = new ArrayList<>();
        ArrayList<Node<T>> list1 = new ArrayList<>();
        Node<T> node = new Node<>(1,"1", new AtomicBoolean(), new StringBuilder());
        Node<T> node1 = new Node<>(2,"2", new AtomicBoolean(), new StringBuilder());
        list.add(node);
        list1.add(node1);

        root.children = list;
        root.children.get(0).children = list1;
    }


    @Override
    public void run() {
        if(root.used.compareAndSet(false, true)){
            System.out.println(Thread.currentThread().getName() + root.label);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }else if(root.children != null){
            traverseTree2(root);
        }
    }


    synchronized void traverseTree2(Node<T> element) {
        if (element.children != null){
            for (Node<T> child : element.children) {
                System.out.println(child.label + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){

                }
                traverseTree2(child);
            }
        }
    }



    public static class Node<T>{
        private T data;

        StringBuilder stringBuilder;
        String label;
        volatile AtomicBoolean used;

        private Node<T> parent;
        private volatile List<Node<T>> children;

        public Node(int inf, String label, AtomicBoolean used, StringBuilder stringBuilder) {
            this.label = label;
            this.used = used;
            this.stringBuilder = stringBuilder;
        }

    }
}

