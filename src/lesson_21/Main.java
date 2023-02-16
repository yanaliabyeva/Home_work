package lesson_21;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
Текстовый файл содержит следующую информацию о персонах (Person) (имя, фамилия, пол, возраст).
Путь к файлу должен задаваться через консоль.
Каждое поле в файле разделено запятой.
Написать программу, которая читает информации из входного файла, сортирует персонов по имени и фамилии.
Отсортированные данные вывести в тот же файл, перезаписав его.
На консоль вывести количество человек с возрастом > 30.
На консоль вывести количество мужчин и женщин.

Пример данных в исходном файле:
Jack,Ward,male,16
Alex,Wilson, male,29
Monica,Lopez, female,33

Пример вывода на консоль:
Count: 1
male:2
female:1


Note:
Для работы с файлами можно использовать класс File.
Организовать корректую обработку исключений.
Для сортировки и вычислений можно использовать Stream.
/Users/aliabyeva/IdeaProjects/yana_aliabyeva_HW_TMS/src/lesson_21/file.txt
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String path;
        System.out.println("Введите путь к файлу:");
        path = scanner.next();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Person person = new Person();
                String[] array = line.split(",");
                person.setName(array[0]);
                person.setLastName(array[1]);
                person.setSex(array[2]);
                person.setAge(Integer.parseInt(array[3]));
                list.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (p1.getName() + p1.getLastName()).compareTo(p2.getName() + p2.getLastName());
            }
        });
        int countAge = 0;
        int countMale = 0;
        int countFemale = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > 30) {
                countAge++;
            }
            if (list.get(i).getSex().equals("male")) {
                countMale++;
            } else {
                countFemale++;
            }
        }
        System.out.println("Количество человек с возрастом > 30 : " + countAge);
        System.out.println("Количество мужчин : " + countMale);
        System.out.println("Количество женщин : " + countFemale);
        writeSortedFile(list);
    }

    public static void writeSortedFile(List<Person> list ) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("/Users/aliabyeva/IdeaProjects/" +
                    "yana_aliabyeva_HW_TMS/src/lesson_21/file.txt"));
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i) + " \n ");
            }
        } catch (IOException exception) {
            throw new RuntimeException();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException exception) {
                System.out.println(exception.getStackTrace());
            }
        }
    }
}
