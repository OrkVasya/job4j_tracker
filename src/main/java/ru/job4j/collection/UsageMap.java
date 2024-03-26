package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1@email.ru", "1");
        map.put("2@email.ru", "2");
        map.put("3@email.ru", "3");
        map.put("4@email.ru", "4");
        map.put("3@email.ru", "5");
        map.put("1@email.ru", "6");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
