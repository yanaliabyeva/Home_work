package lesson_10_1;

public class Containce1a2bExaption extends Exception{
    String message;

    public Containce1a2bExaption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Containce1a2bExaption{" +
                "message='" + message + '\'' +
                '}';
    }
}
