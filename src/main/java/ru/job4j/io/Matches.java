package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.print(player + " введите число от 1 до " + (Math.min(count, 3)) + ": ");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            while (matches < 1 || matches > Math.min(count, 3)) {
                if (count == 1) {
                    System.out.println("Должна быть 1 спичка.");
                } else if (count <= 3) {
                    System.out.println("Должно быть от 1 до " + count + " спичек.");
                } else {
                    System.out.println("Должно быть от 1 до 3 спичек.");
                }
                System.out.print(player + " введите число от 1 до " + (Math.min(count, 3)) + ": ");
                matches = Integer.parseInt(input.nextLine());
            }
            count -= matches;
            System.out.println("Спичек на столе: " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
