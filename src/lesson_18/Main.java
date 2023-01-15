package lesson_18;
/*Создать коллекцию класса ArrayList наполнить ее элементами
рандомными элементами типа Integer.
С помощью Stream'ов:
- Удалить дубликаты
- Вывести все четные элементы в диапазоне от 7 до 17
(включительно)
- Каждый элемент умножить на 2
- Отсортировать и вывести на экран первых 4 элемента
- Вывести количество элементов в стриме
- Вывести среднее арифметическое всех чисел в стриме
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Work.createArray();
    Work.deleteNumbers();
    Work.evenElements();
    Work.multiplyElements();
    Work.sortedElements();
    Work.avgOfNumbers();
    }
}
