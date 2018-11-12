package lessons.four.task4;

public class Filter {
    public Object[] filter(A[] arr, Pattern pattern ){
        Object[] result = new Object[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if (pattern.method(arr[i])){
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public interface Pattern{
        boolean method(A a);
    }
}
