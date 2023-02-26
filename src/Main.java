import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Phone phone1=new Phone("Apple","Iphone",1234567, new Contact[]{new Contact(708860076, "Sena")});
        Phone phone2=new Phone("Xiaomi","Redmi",12345678, new Contact[]{new Contact(708860077, "Ignat")});
        Phone phone3=new Phone("Samsung","Galaxy",123456789, new Contact[]{new Contact(708860078, "Arkadi")});
        Phone[] phones={phone1,phone2,phone3};

        for (Phone phone:phones) {
            System.out.println(phone);
        }

        phone1.turnOn();
       /* phone2.turnOn();
        phone3.turnOn();*/

        phone1.coll("Sena"); //// Атын жазса номерин чыгарып берет
       /* phone2.coll("Ignat");
        phone3.coll("Arkadi");*/


       System.out.println(phone1.call(708860076));//Номер жазса  атын чыгарып берет
      /* System.out.println(phone2.call(708860077));
       System.out.println(phone3.call(708860078));*/


        System.out.println(phone1.searchContact("Sena"));  // Атын жазсан издеп контактттан атын анан номерин чыгарат
       /* System.out.println(phone2.searchContact("Ignat"));
        System.out.println(phone3.searchContact("Arkadi"));*/


         System.out.println(phone1.updateName(new Contact(708860076,"Sena"), "Dina"));
     /*    System.out.println(phone2.updateName(new Contact(708860077,"Ignat"), "Bekzat"));
         System.out.println(phone3.updateName(new Contact(708860078,"Arkadi"), "Arsen"));*/

        System.out.println(Arrays.toString(phone1.getAllContacts()));
        System.out.println(Arrays.toString(phone2.getAllContacts()));
        System.out.println(Arrays.toString(phone3.getAllContacts()));













        //* 2 класс тузунуз
        // * Contact(phoneNumber, fullName)
        // * Phone(brand, name, password, Contacts[] contacts)
        // * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат,
        // пароль сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
        // * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан издейт эгер тапса номер менен
        // ошол номерди жана ошол номер кандай атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет

        // * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт табылса ошол контакттын
        // атын жана ошол номерди кайтарып ушуга чалып жатасыз деп кайтарып берет

        // * searchContact(); деген методдун жардамы менен контакттарды издейсиз параметрине бир контактын аты жазылат,
        // ошол ат менен контакт табылса ошол контакты(Contact) кайтарып берет
        // * Contact updateName(); бул методдун жардамы менен контакттын атын озгортсо болот,
        // параметрине 2 соз алат ( эскиАты, жаныАты)
        // * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын алып берет
        // * main - ден класстардын объееттерин тузуп программанызды иштетиниз

    }
}






