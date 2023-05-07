package models;

public class Customer {
    private String name;
    private String surname;
    private String mail;
    private String phoneNumber;

    public Customer (){};

    public Customer(String name, String surname, String mail, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", mail = '" + mail + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                '}';
    }
}
