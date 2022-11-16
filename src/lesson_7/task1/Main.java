package lesson_7.task1;
/*Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра. Площадь треугольника по формуле Герона.
Создать массив из 5 фигур.
Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.

 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3,3);
        Rectangle rectangle = new Rectangle(5,5);
        Circle circle = new Circle(8);
        Figure array[] = new Figure[5];
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(9);

        array[0] = triangle;
        array[1] = rectangle;
        array[2] = circle;
        array [3] = circle1;
        array[4] = circle2;
        double sumP = 0;
        double sumS = 0;

        for (int i = 0; i < array.length; i++) {
          sumP += array[i].calculatePerimeter();
          sumS += array[i].calculateAria();
        }
        System.out.println(sumP);
        System.out.println(sumS);
    }
}
