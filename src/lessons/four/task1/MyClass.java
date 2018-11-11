package lessons.four.task1;

public class MyClass {
    public void method(Context[] contexts, Operation operation){
        for (int i = 0; i < contexts.length; i++){
            operation.funcOne(contexts[i]);
        }
    }
}
