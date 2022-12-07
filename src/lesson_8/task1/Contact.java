package lesson_8.task1;

class Contact {
    private String name;
    private int number;

    Contact(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public int getNumber() {
        return number;
    }
}
