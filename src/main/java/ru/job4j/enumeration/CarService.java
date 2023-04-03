package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println(
                "Заказ-наряд №" + order.getNumber()
                        + " на автомобиль " + order.getCar()
                        + ", статус ремонта: " + order.getStatus().getInfo()
                        + ", подробности: " + order.getStatus().getMessage()
        );

        Status[] statuses = Status.values();
        for (Status status : statuses) {
            System.out.println(
                    "Название статуса: " + status.name()
                            + ", Порядковый номер статуса: " + status.ordinal()
            );
        }
    }
}
