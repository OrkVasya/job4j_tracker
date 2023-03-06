package ru.job4j.oop;

public class Error {

    boolean active;

    int status;

    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error emptyError = new Error();
        emptyError.printInfo();
        System.out.println();
        Error scaryError = new Error(true, 1, "Ощенно страшная ошибка, хозяин!");
        scaryError.printInfo();
        System.out.println();
        Error noFoodError = new Error(true, 2, "Амбар практически пуст, милорд!");
        noFoodError.printInfo();
    }
}
