package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurierFileManagerTest {

    @Test
    void createCurierByFile() {

        Path path = Path.of("./src/main/resources/Courier.csv");
        CurierFileManager cfm = new CurierFileManager();
        Courier courier = cfm.createCurierByFile(path);

        assertEquals(6, courier.getRides().size());

        assertEquals(9, courier.getRides().get(5).getDistance());

    }
}