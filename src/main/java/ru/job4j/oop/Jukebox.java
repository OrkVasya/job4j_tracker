package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String sep = System.lineSeparator();
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже" + sep + "Тра-ля-ля, тра-ля-ля" + sep);
            case 2 -> System.out.println("Рыбки уснули в пруду-у-у..." + sep);
            default -> System.out.println("Песня не найдена" + sep);
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        for (int i = 1; i <= 3; i++) {
            jukebox.music(i);
        }
    }
}
