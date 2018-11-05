package lessons.three;

public class Clock {
    public static void main(String[] args) {
        int [] hours = new int[24];
        int [] minutes = new int[60];
        hours = init(hours);
        minutes = init(minutes);
        hours = invert(hours);
        int count = 0;
        for (int i = 0; i < 24; i++){
            for (int j = 0; j < 60; j++){
                if (hours[i] == minutes[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int[] invert(int [] mas){
        for (int i = 0; i < mas.length; i++){
            int od = i % 10;
            int des = i / 10;
            mas[i] = des + od * 10;
        }
        return mas;
    }

    public static int[] init(int [] mas){
        for (int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        return mas;
    }


}
