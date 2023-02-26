public interface PhoneInterface {
    void turnOn() ;//включить
     String call(int phoneNumber);
    String coll(String  fullName);
    Contact searchContact(String contactName);
    Contact updateName(Contact contact, String newName);
    Contact[] getAllContacts();
}
