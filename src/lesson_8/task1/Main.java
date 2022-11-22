package lesson_8.task1;

public class Main {
    public static void main (String [] args){
        Phone iphone = new Phone (7247030, "Iphone 13",0.173);
        Contact contact1 = new Contact ("Mom",1527491);
        Contact contact2 = new Contact("Sister",5846384);
        Contact contact3 = new Contact ("BF",1885553);

        iphone.printContacts();
        iphone.addContact(contact1);
        iphone.addContact(contact2);
        iphone.addContact(contact3);
        iphone.printContacts();

        iphone.sendMessage("i miss u",contact1);
    }
}
