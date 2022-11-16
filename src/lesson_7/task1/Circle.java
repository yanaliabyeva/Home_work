package lesson_7.task1;

public class Circle extends Figure{
    double r ;
    Circle(double num){
        r = num;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
    @Override
    public double calculateAria() {
        return Math.PI * r * r;
    }
}

