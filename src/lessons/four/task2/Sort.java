package lessons.four.task2;

public abstract class Sort {
    public void sorting(Object[] objects){
        for(int i = 0; i < objects.length; i++){

            for(int j = 1; j < (objects.length - i); j++){

                if(compare(objects[j - 1], objects[j])) {

                    Object temp = objects[j - 1];

                    objects[j - 1] = objects[j];

                    objects[j] = temp;

                }

            }

        }
    }
    public abstract boolean compare(Object object1, Object object2);
}
