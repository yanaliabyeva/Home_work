package lesson_7.task1;

public class Triangle extends Figure{
    double side1;
    double side2;
    double side3;
    Triangle(double num1, double num2, double num3) {
        side1 = num1;
        side2 = num2;
        side3 = num3;
    }
    @Override
    public double calculatePerimeter(){
       double per = side1 + side2 + side3 ;
        return per;
    }
    public  double calculateAria(){
        double p = (side1 + side2 + side3) / 2;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }
}
