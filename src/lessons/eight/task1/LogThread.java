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
            root.logPreOrder();
    }
}
