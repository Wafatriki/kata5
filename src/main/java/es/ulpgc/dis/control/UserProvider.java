package es.ulpgc.dis.control;

import es.ulpgc.dis.model.User;

import java.io.IOException;

public interface UserProvider {
    User newUser() throws IOException;
}
