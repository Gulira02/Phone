import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Phone implements PhoneInterface {

    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;


    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    Scanner scanner = new Scanner(System.in);


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {

        this.password = password;
    }

    public Contact[] getContacts() {

        return contacts;
    }

    public void setContacts(Contact[] contacts) {

        this.contacts = contacts;
    }



    @Override
    public void turnOn() {
        System.out.println("Activate your phone: ");
        System.out.println("Enter the password: ");
        int password1 = scanner.nextInt();
        if (Objects.equals(password1, password)) {
            System.out.println("You entered the correct password");
        } else {
            System.out.println("You entered the wrong password!!!");
        }

    }

    @Override
    public String call(int phoneNumber) {//Номер жазса  атын чыгарып берет
        System.out.println("Enter your phone number");
        phoneNumber = scanner.nextInt();
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getPhoneNumber(), phoneNumber)) {
                return "Calling " + contact.getContactName();
            }
        }
         return " Unknown number ";

    }



    @Override
    public String coll(String fullName) {// Атын жазса номерин чыгарып берет
        System.out.println("Enter the name of the contact ");
        fullName.equalsIgnoreCase(scanner.nextLine());
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getContactName(), fullName))
                System.out.println("Calling " + contact.getPhoneNumber());
        }
        return "Contact not found";
    }

    @Override
    public Contact searchContact(String contactName) {// Контакттан атын жазса  номерин жана атын чыгарат
        for (Contact contact : contacts) {
            System.out.println("Enter a name:  ");
            contactName.equalsIgnoreCase(scanner.nextLine());
            if ((contact.getContactName().equals(contactName))) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateName(Contact contact, String newName) {
        System.out.println("Enter a new name: ");
        newName=scanner.nextLine();
        contact.setContactName(newName);
       return contact;
    }



    @Override
    public Contact[] getAllContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Phone{\n" +
                " brand: " + brand + '\'' +
                " name: " + name + '\'' +
                " password: " + password +'\'' +
                " contacts: " + Arrays.toString(contacts) +
                '}';
    }
}


