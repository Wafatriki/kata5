package es.ulpgc.dis.control;

import es.ulpgc.dis.model.User;

import java.util.ArrayList;
import java.util.List;

public class RandomUserLoaderCommand {
    public List<User> execute(){
        List<User> users = new ArrayList<User>();
        UserProvider provider = new RandomUserProvider();
        try{
            for (int i = 0; i < 10; i++) users.add(provider.newUser());
            return users;
        } catch (Exception e) {
            return users;
        }
    }
}
