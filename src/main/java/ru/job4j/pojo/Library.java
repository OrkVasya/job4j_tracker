package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Clean code", 450),
                new Book("Java. The Complete Reference", 1280),
                new Book("IT", 1000),
                new Book("Swan song", 1500)
        };
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + "; Pages: " + book.getPagesNumber());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + "; Pages: " + book.getPagesNumber());
        }
        System.out.println();
        for (Book book : books) {
            if ("Clean code".equals(book.getTitle())) {
                System.out.println("Title: " + book.getTitle() + "; Pages: " + book.getPagesNumber());
            }
        }
    }
}
