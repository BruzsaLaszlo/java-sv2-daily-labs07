package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Product> products = new ArrayList<>();
    private Path path;

    public void addProduct(Product product) {
        if (validateProduct(product))
            products.add(product);
        else throw new IllegalArgumentException("invalid sold date");
    }

    private boolean validateProduct(Product product) {
        return product.getSoldDate().isBefore(LocalDate.now());
    }

    public String writeAllProductIn(Month month) {

        StringBuilder lines = new StringBuilder();
        for (Product p : products) {
            if (p.getSoldDate().getMonth().equals(month)) {
                lines.append(p.getName() + ";" + p.getSoldDate() + ";" + p.getPrice() + "\n");
            }
        }

        return writeToFile(lines.toString(), month);

    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    private String writeToFile(String lines, Month month) {

        path = Path.of("./src/main/resources/" + month + ".csv");
        try {
            Files.writeString(path, lines);
        } catch (IOException e) {
            throw new IllegalStateException("cant create file");
        }

        return lines;
    }

    public Path getPath() {
        return path;
    }
}
