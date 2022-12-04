package lesson_10_3;
/*Дана строка произвольной длины с произвольными словами.
 Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
 Если таких слов несколько, то вывести последнее из них.
 */
public class Main {

    public static void main(String[] args) {
        String stroka = "Никита твое дз говно";
        method_1(stroka);
        metod_2(stroka);

    }

    public static void method_1(String stroka){
       String array[];
       array = stroka.split(" ");
       String min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (min.length() >= array[i].length()){
                min = array[i];
            }
        }
        System.out.println(min);

    }
    public  static void metod_2(String stroka){
        String array[];
        array = stroka.split(" ");
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.length() <= array[i].length()){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

