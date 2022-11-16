package lesson_7.task1;

public class Rectangle extends Figure{
    double side1;
    double side2;
    Rectangle(double num1,double num2){
        side1 = num1;
        side2 = num2;
    }

    @Override
    public double calculatePerimeter() {
       double per = (side1 + side2) * 2;
        return per;
    }

    @Override
    public double calculateAria() {
        return side1 * side2;
    }
}

