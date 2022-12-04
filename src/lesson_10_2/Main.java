package lesson_10_2;

import java.lang.reflect.Array;

/*      Дана произвольная строка.
        Вывести на консоль новую строку, в которой
        продублирована каждая буква из начальной строки.
        Например, "Hello" -> "HHeelllloo".
*/
public class Main {

    public static void main(String[] args) {

        String hello = "Hello";

        char array[] = hello.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(array[i]);

        }
    }
}
