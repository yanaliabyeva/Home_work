package lesson_10_1;

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
        stringBuilder.append(arrayForChar[1]+ "/" + arrayForChar[3]);
        System.out.println(stringBuilder);
    }

    public static void print3(String number){
        String[] array;
        StringBuilder stringBuilder = new StringBuilder();
        array = number.split("-");
        stringBuilder.append(array[1] + "/" + array[3] + "/" );
        char arrayForChar[] = array[4].toCharArray();
        stringBuilder.append(arrayForChar[1]+ "/" + arrayForChar[3]);
        System.out.println(stringBuilder.toString().toUpperCase());
    }
    public static void print4(String number){
        if (number.contains("abc") || number.contains("ABC"))
            System.out.println("Содержит");
        else{
            System.out.println("Не содержит");
        }
    }
    public static void print5(String number){
        if (number.startsWith("555"))
            System.out.println("Начинается");
        else {
            System.out.println("Не начинается");
        }
    }
    public static void print6(String number){
        if (number.endsWith("1a2b"))
            System.out.println("Заканчивается");
        else {
            System.out.println("Не заканчивается");
        }
    }
}




