package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void addProducts() {

        store.addProduct(new Product("alma", LocalDate.of(2021, 05, 19), 200));
        store.addProduct(new Product("körte", LocalDate.of(2021, 05, 29), 250));
        store.addProduct(new Product("sárgarépa", LocalDate.of(2021, 07, 3), 3500));
        store.addProduct(new Product("tök", LocalDate.of(2021, 8, 8), 4500));

    }

    @Test
    void addProduct() {

        assertEquals(4, store.getProducts().size());

    }

    @Test
    void writedFileTest() throws IOException {

        String actual = store.writeAllProductIn(Month.MAY);
        String expected = Files.readString(store.getPath());

        assertEquals(expected, actual);

    }

    @Test
    void writedProductTest() throws IOException {

        String actual = store.writeAllProductIn(Month.MAY);
        List<String> lines = Files.readAllLines(store.getPath());

        String[] firstLine = lines.get(0).split(";");
        assertEquals("alma", firstLine[0]);

    }
}