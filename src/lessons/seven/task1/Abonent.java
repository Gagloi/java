package lessons.seven.task1;


import java.util.Iterator;

public class Abonent {
    private String phoneNumber;

    public Abonent(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
