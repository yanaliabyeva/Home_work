package lesson_8.task1;

public class Phone {
    private int number;
    private final String model;
    private double weight;
    private Contact[] contacts = new Contact[3];
    private int size = 0;

    Phone(int number,String model){
        this.number = number;
        this.model = model;
    }
    Phone(int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void recciveCall(Contact contact){
        System.out.println("Звонит" + contact.getName());
        System.out.println(contact.getNumber());
    }
    public Contact recciveCall(int number, String name){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName() == name && contacts[i].getNumber() == number) {
                return  contacts[i];
            }
        }
        return null;
    }
    public int getNumber(){
        return number;
    }
    public void addContact(Contact contact){
        contacts[size] = contact;
        size++;
    }
    public void printContacts(){
        for (Contact contact : contacts){
            if (contact != null) System.out.println(contact.getName());
            else System.out.println("null");
        }
        System.out.println();
    }
    public void sendMessage(String message,Contact ... contacts){
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].getNumber() + " " + message);
        }
    }
}
