package es.ulpgc.dis;

import org.jsoup.Jsoup;

public class Main {
    public static void main(String[] args) {

        Jsoup.connect("https://randomuser.me/api/");
    }
}