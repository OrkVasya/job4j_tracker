package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Едем только вперед. Врум-врум-врум.");
    }

    @Override
    public void passengers(int passengerNum) {
        System.out.println("Взяли " + passengerNum + " пассажиров!");
    }

    @Override
    public double refuel(int amount) {
        System.out.println("Заправили " + amount + " литров.");
        return amount;
    }
}
