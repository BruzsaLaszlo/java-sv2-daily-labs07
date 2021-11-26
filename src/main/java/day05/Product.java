package day05;

import java.time.LocalDate;

public class Product {

    private final String name;
    private final LocalDate soldDate;
    private final int price;

    public Product(String name, LocalDate soldDate, int price) {
        this.name = name;
        this.soldDate = soldDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getSoldDate() {
        return soldDate;
    }

    public int getPrice() {
        return price;
    }
}
