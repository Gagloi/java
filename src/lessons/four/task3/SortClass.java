package lessons.four.task3;

public class SortClass{
    public void sort(Object[] objects, MyInterface myInterface){
        for(int i = 0; i < objects.length; i++){
            for(int j = 1; j < (objects.length - i); j++){
                if(myInterface.compare(objects[j - 1], objects[j])) {
                    Object temp = objects[j - 1];
                    objects[j - 1] = objects[j];
                    objects[j] = temp;
                }
            }
        }
    }


}
