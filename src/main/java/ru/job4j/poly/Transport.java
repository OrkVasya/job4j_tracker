package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int passengerNum);

    double refuel(int amount);
}
