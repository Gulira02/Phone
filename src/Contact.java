public class Contact {
    private int phoneNumber;
    private String contactName;

    public Contact(int phoneNumber, String contactName) {
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }
    public Contact(){}

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "Contact {" +
                "phoneNumber: " + phoneNumber +" "+
                "contactName: " + contactName + '\'' +
                '}';
    }


}
