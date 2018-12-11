package lessons.seven.task2;

public class Abonent {
    private int phone;

    public Abonent(int phoneNumber){
        this.phone = phoneNumber;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "phone=" + phone +
                '}';
    }
}
