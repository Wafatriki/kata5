package es.ulpgc.dis.control;

import es.ulpgc.dis.control.pojo.RandomUser;
import es.ulpgc.dis.model.User;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.logging.Logger;

public class RandomUserAdapter implements UserAdapter<RandomUser> {
    @Override
    public User from(RandomUser object) {
        User user = new User()
                .setName(object.getName().first() + " " + object.getName().last())
                .setEmail(object.getEmail())
                .setGender(User.Gender.valueOf(firstUpperCase(object.getGender())));
        loadPhoto(object, user);
        return user;
    }

    private String firstUpperCase(String gender) {
        return gender.substring(0,1).toUpperCase() + gender.substring(1);
    }

    private static void loadPhoto(RandomUser object, User user) {
        try {
            user.setPhoto(photoFrom(object.getPicture().medium()));
        } catch (IOException e) {
            Logger.getAnonymousLogger().severe(e.getMessage());
        }
    }

    private static byte[] photoFrom(String url) throws IOException {
        return Jsoup.connect(url)
                .ignoreContentType(true)
                .execute()
                .bodyAsBytes();
    }
}

