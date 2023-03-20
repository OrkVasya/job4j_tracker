package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student mike = new Student();
        mike.setFullName("Mike");
        mike.setGroupNumber(23);
        mike.setDateOfAdmission(LocalDate.now());

        System.out.println("Данные о студенте:");
        System.out.println("Имя: " + mike.getFullName());
        System.out.println("Номер группы: " + mike.getGroupNumber());
        System.out.println("Дата поступления: " + mike.getDateOfAdmission());
    }
}
