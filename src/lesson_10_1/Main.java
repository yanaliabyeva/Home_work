package lesson_10_1;
/* Написать программу со следующим функционалом:
        На вход передать строку (будем считать, что это номер документа). Номер документа
         имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        - Вывести на экран в одну строку два первых блока по 4 цифры.
         - Вывести на экран номер документа, но блоки из трех букв заменить
          на *** (каждая буква заменятся на *).
        - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем
         регистре(реализовать с помощью класса StringBuilder).
        - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит
         или нет(причем, abc и ABC считается одинаковой последовательностью).
        - Проверить начинается ли номер документа с последовательности 555.
        - Проверить заканчивается ли номер документа на последовательность 1a2b.
        Все эти методы реализовать в отдельном классе в статических методах, которые на
        вход (входным параметром) будут принимать вводимую на вход программы строку.
*/

public class Main {
    public static void main(String[] args) {
        String number = "1234-abed-1234-abed-1a2";
        List.print(number);
        List.print1(number);
        List.print2(number);
        List.print3(number);
        try{
            System.out.println(List.print4(number));
        }
        catch (AbcContainsExeption ex){
            System.out.println(ex);
        }
        try{
            System.out.println(List.print5(number));
        }
        catch (Contains555Exeption e){
            System.out.println(e);
        }
        try{
            System.out.println(List.print6(number));
        }
        catch (Containce1a2bExaption e2){
            System.out.println(e2);
        }
    }
}
