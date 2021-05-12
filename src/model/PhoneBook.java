package model;

public class PhoneBook {
    private String name;
    private String address;
    private String numberPhone;
    private String email;
    private String nameFacebook;

    public PhoneBook() {
    }

    public PhoneBook(String name, String address, String numberphone, String email, String nameFacebook) {
        this.name = name;
        this.address = address;
        this.numberPhone = numberphone;
        this.email = email;
        this.nameFacebook = nameFacebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberphone() {
        return numberPhone;
    }

    public void setNumberphone(String numberphone) {
        this.numberPhone = numberphone;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameFacebook() {
        return nameFacebook;
    }

    public void setNameFacebook(String nameFacebook) {
        this.nameFacebook = nameFacebook;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberphone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                ", nameFacebook='" + nameFacebook + '\'' +
                '}';
    }
}

