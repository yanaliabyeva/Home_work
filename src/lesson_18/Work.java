package lesson_18;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Work {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void createArray(){
        Random random = new Random();

        for (int i = 15; i >= 0; --i) {
            arrayList.add(random.nextInt(20));
        }
        System.out.println(arrayList);
    }
        public static void deleteNumbers(){
            List<Integer> deletedNumbers = arrayList.stream().distinct().collect(Collectors.toList());
            System.out.println(deletedNumbers);
    }
    public static void evenElements(){
        List <Integer> evenElements = (arrayList.stream().filter(n-> n%2==0 && n >= 7 && n <= 17).collect(Collectors.toList()));
        System.out.println("Массив из четных элементов: " + evenElements);
    }
    public static void multiplyElements(){
        List<Integer> multiplyElements = (arrayList.stream().map(x -> x*2).collect(Collectors.toList()));
        System.out.println("Массив из чисел умноженных на 2: " + multiplyElements);
    }
    public static void sortedElements(){
        List <Integer> sortedElements = arrayList.stream().sorted().limit(4).collect(Collectors.toList());
        System.out.println("Первые 4 элемента: " + sortedElements);
    }
    public static void numberOfElements(){
        Long count = ((long) arrayList.size());
        System.out.println("Количество элементов массива: " + count);
    }
    public static void avgOfNumbers(){
        OptionalDouble avgOfNumbers = arrayList.stream().mapToInt(n -> n).average();
        System.out.println("Среднее арифметическое: " + avgOfNumbers.getAsDouble());
    }
}

