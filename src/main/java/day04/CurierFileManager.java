package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CurierFileManager {

    public Courier createCurierByFile(Path path) {

        Courier courier = new Courier();

        List<String> lines = readFromFile(path);
        for (String line : lines) {
            Ride ride = createRideFrom(line);
            courier.addRide(ride);
        }

        return courier;

    }

    private List<String> readFromFile(Path path) {

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("no file: " + path);
        }

    }

    private Ride createRideFrom(String line) {

        String[] raw = line.split("[ ]");
        return new Ride(
                Integer.parseInt(raw[0]),
                Integer.parseInt(raw[1]),
                Integer.parseInt(raw[2])
        );

    }

}
