package es.ulpgc.dis;

import es.ulpgc.dis.control.RandomUserLoaderCommand;
import es.ulpgc.dis.model.User;
import es.ulpgc.dis.view.UserPanel;
import org.jsoup.Jsoup;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new RandomUserLoaderCommand().execute();

        JFrame frame = new JFrame("Users Photos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 10));

        for (User user : users) {
            UserPanel userPanel = new UserPanel();
            userPanel.setPhoto(user.getPhoto());
            frame.add(userPanel);
        }

        frame.pack();
        frame.setVisible(true);
    }
}