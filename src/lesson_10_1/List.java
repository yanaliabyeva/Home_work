package lesson_10_1;
/*Доработать нулевое домашнее задание предыдущего урока. Теперь надо создать свои классы исключений на каждую ситуацию:
 - Проверить содержит ли номер документа последовательность abc.
 - Проверить начинается ли номер документа с последовательности 555. -
 Проверить заканчивается ли номер документа на последовательность 1a2b.
Если номер документа не удовлетворяет условию - то "бросить" исключение.
В методе класса, в котором будут вызываться эти методы для демонстрации работы,
 перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение
  для пользователя (сообщение на консоль).
 */
public class List {
    public static void print(String number){
        String[] array;
        array = number.split("-");
        System.out.println(array[0] + array[2]);
    }

    public static void print1(String number){
        String[] array;
        array = number.split("-");
        System.out.println(array[0] + "***" + array[2] + "***" + array[4]);
    }

    public static void print2(String number){
        StringBuilder stringBuilder = new StringBuilder();
        String[] array;
        array = number.split("-");
        stringBuilder.append(array[1] + "/" + array[3] + "/" );
        char arrayForChar[] = array[4].toCharArray();
        stringBuilder.append(arrayForChar[1]+ "/" + arrayForChar[2]);
        System.out.println(stringBuilder);
    }

    public static void print3(String number){
        String[] array;
        StringBuilder stringBuilder = new StringBuilder();
        array = number.split("-");
        stringBuilder.append(array[1] + "/" + array[3] + "/" );
        char arrayForChar[] = array[4].toCharArray();
        stringBuilder.append(arrayForChar[1]+ "/" + arrayForChar[2]);
        System.out.println(stringBuilder.toString().toUpperCase());
    }
    public static boolean print4(String number) throws AbcContainsExeption{
            if (number.contains("abc") || number.contains("ABC")){
            //System.out.println("Содержит");
                return true;
                }
            throw new AbcContainsExeption("Ошибка нахождения последовательности ABC");
            }

    public static boolean print5(String number)throws Contains555Exeption {
        if (number.startsWith("555")) {
            //System.out.println("Начинается");
            return true;
            }
        throw new Contains555Exeption("Ошибка нахождения последовательности 555");
        }
//        else {
//            System.out.println("Не начинается");
//        }

    public static boolean print6(String number)throws Containce1a2bExaption {
        if (number.endsWith("1a2b")) {
            return true;
        }
        throw new Containce1a2bExaption("Ошибка нахождения последовательности 1a2b");

           // System.out.println("Заканчивается");
//        else {
//            System.out.println("Не заканчивается");
//        }
    }
}




