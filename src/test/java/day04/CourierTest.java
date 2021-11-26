package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier courier = new Courier();

    @BeforeEach
    void addRides() {

        courier.addRide(new Ride(1, 1, 9));
        courier.addRide(new Ride(1, 2, 5));
        courier.addRide(new Ride(1, 3, 7));
        courier.addRide(new Ride(1, 4, 4));

    }

    @Test
    void addRide() {

        Ride invalidRide = new Ride(1, 4, 4);
        assertThrows(IllegalArgumentException.class, () -> courier.addRide(invalidRide));

        Ride validRide = new Ride(1, 5, 4);
        assertDoesNotThrow(()-> courier.addRide(validRide));

    }

    @Test
    void getRides() {

        assertEquals(4, courier.getRides().size());

    }
}