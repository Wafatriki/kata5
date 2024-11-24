package es.ulpgc.dis.control;

import com.google.gson.Gson;
import es.ulpgc.dis.control.pojo.RandomUserResponse;
import es.ulpgc.dis.model.User;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Random;

public class RandomUserProvider implements UserProvider {
    private static final String URL = "https://randomuser.me/api/";


    @Override
    public User newUser() throws IOException {
        Connection connect = Jsoup.connect(URL).ignoreContentType(true);
        RandomUserResponse response = new Gson().fromJson(connect.get().text(), RandomUserResponse.class);
        return new RandomUserAdapter().from(response.getResult().getFirst());

    }
}
