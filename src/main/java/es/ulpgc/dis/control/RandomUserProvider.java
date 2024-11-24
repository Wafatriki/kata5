package es.ulpgc.dis.control;

import es.ulpgc.dis.model.User;
import org.jsoup.Jsoup;

public class RandomUserProvider implements UserProvider {
    private static final String URL = "https://randomuser.me/api/";


    @Override
    public User newUser() {
        Jsoup.connect(URL);

    }
}
