package lessons.four.task1;

public class Context implements Operation {

    @Override
    public void funcOne(Context context) {
        this.a = context.a * 2;
        if(this.a < 0){
            this.a = 0;
        }
    }

    public int a;
}
