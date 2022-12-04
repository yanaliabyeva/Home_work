package lesson_10_5;
/*Дана строка произвольной длины с произвольными словами. Написать программу
 для проверки является ли любое выбранное слово в строке палиндромом.
TeachMeSkills.by
Например, есть строка, вводится число 3, значит необходимо проверить
является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
 */
public class Main {
    public static void main(String[] args) {
        String stroka = "Номер моей квартиры 303";
        method1(stroka,4);
    }
    public static void method1(String stroka,int number) {
        String[] array;
        array = stroka.split(" ");
        if (number > array.length) {
            System.out.println("ПРЕДУПРЕЖДАЮ ЧТО ЧТО-ТО НЕ ТАК");
            return;
        }
        StringBuilder word = new StringBuilder(array[number - 1]);

        if (word.toString().equals(word.reverse().toString())) {
            System.out.println("Является палиндромом");
        } else {
            System.out.println("Не является палиндромом");
        }
    }
}



