package lessons.three;

public class Strings {

    public static void main(String[] args) {
        String [] strings = {"Алфавит","Старкрафт","Варкрафт","Дота2","Центнер","Роза","Мыло","Рама"};
        sort(strings);
        for (String i:strings){
            System.out.println(i);
        }
    }

    public static String[] sort(String[] mas){
        char buff = mas[0].charAt(0);
        for (int i = 0; i < 7; i++){
            for (int j = i + 1; j <= 7; j++){
                if (mas[i].charAt(0) > mas[j].charAt(0)){
                    String lol = mas[i];
                    mas[i] = mas[j];
                    mas[j] = lol;
                }
            }
        }
        return mas;
    }
}
