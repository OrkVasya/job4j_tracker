package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index + 1; i < products.length; i++) {
            products[i - 1] = products[i];
            if (i == products.length - 1) {
                products[i] = null;
            }
        }
        return products;
    }
}
