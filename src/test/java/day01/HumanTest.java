package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HumanTest {

    @Test
    void createTest() {

        Human human = new Human("Kovács István", 1950);

        assertEquals("Kovács István", human.getName());
        assertEquals(1950, human.getYearOfBirth());

    }

    @Test
    void invalidConstructorParameters() {

        assertThrows(IllegalArgumentException.class, () -> new Human("Pistike", 2015));
        assertThrows(IllegalArgumentException.class, () -> new Human("Bözsi néni", 1899));
        assertThrows(IllegalArgumentException.class, () -> new Human(null, 2000));

    }

}