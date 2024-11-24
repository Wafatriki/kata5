package es.ulpgc.dis.control;

import es.ulpgc.dis.control.pojo.RandomUser;
import es.ulpgc.dis.model.User;
import org.jsoup.Jsoup;

import java.io.IOException;

public class RandomUserAdapter implements UserAdapter<RandomUser> {
    @Override
    public User from(RandomUser object) throws IOException {
        User user = new User()
                .setName(object.getName().firstName() + " " + object.getName().lastName())
                .setEmail(object.getEmail())
                .setGender(User.Gender.valueOf(firstUpperCase(object.getGender())));
        loadPhoto(object, user);
        return null;
    }

    private void loadPhoto(RandomUser object, User user) throws IOException {
        try{
            user.setPhoto(photoFrom(object.getPicture().medium()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] photoFrom(String url) throws IOException {
        return Jsoup.connect(url)
                .ignoreContentType(true)
                .execute()
                .bodyAsBytes();
    }

    private String firstUpperCase(String gender) {
        return gender.substring(0, 1).toUpperCase() + gender.substring(1);
    }


}
