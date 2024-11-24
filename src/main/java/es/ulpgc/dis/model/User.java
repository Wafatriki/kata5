package es.ulpgc.dis.model;

public class User {

    private String name;
    private Gender gender;
    private String surname;
    private String email;
    private byte[] photo;

    public enum Gender {Male, Female};

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getPhoto() {
        return photo;
    }
}


