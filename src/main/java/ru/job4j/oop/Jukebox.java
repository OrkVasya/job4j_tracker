package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже\nТра-ля-ля, тра-ля-ля\n");
        } else if (position == 2) {
            System.out.println("Рыбки уснули в пруду-у-у...\n");
        } else {
            System.out.println("Песня не найдена\n");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        for (int i = 1; i <= 3; i++) {
            jukebox.music(i);
        }
    }
}
