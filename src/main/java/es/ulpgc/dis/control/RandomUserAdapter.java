package es.ulpgc.dis.control;

import es.ulpgc.dis.control.pojo.RandomUser;
import es.ulpgc.dis.model.User;

public class RandomUserAdapter implements UserAdapter<RandomUser> {
    @Override
    public User from(RandomUser object) {
        return null;
    }
}
