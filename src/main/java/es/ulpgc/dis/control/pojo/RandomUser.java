package es.ulpgc.dis.control.pojo;

public class RandomUser {
    private Name name;
    private String email;
    private String gender;
    private Picture picture;

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public Picture getPicture() {
        return picture;
    }

    public record Picture(String large, String medium, String thumbnail) {}

    public record Name(String title, String firstName, String lastName) {}
}
