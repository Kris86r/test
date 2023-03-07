package com.javarush.task.pro.task09.task0912;


public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("http://")) {
            url = "http";
        } else if (url.startsWith("https://")) {
            url = "https";
        } else {
            url = "неизвестный";
        }
        return url;
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            url = "com";
        } else if (url.endsWith("ru")) {
            url = "ru";
        } else if (url.endsWith("net")) {
            url = "net";
        } else if (url.endsWith("org")) {
            url = "org";
        } else {
            url = "неизвестный";
        }
        return url;
    }
}






























