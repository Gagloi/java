package lessons.six.task2;

public class Main {
    public static void main(String[] args) {
        String[] objects = new String[4];
        MyCoolList<String> list = new MyCoolList(objects);
        list.add("1");
        for (Object it: list){
            System.out.println(it);
        }
    }
}
