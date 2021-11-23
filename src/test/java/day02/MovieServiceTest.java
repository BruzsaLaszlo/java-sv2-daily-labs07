package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MovieServiceTest {

    Path path = Path.of("./src/main/resources/movies.csv");
    MovieService ms = new MovieService(path);

    @Test
    void getMoviesListSizeTest() {

        assertEquals(5, ms.getMovies().size());

    }

    @Test
    void isMovieInList() {

        assertEquals("Star Wars", ms.getMovies().get(2).getTitle());

    }

    @Test
    void illegalFileTest() {

        Path path = Path.of("illegal_file");
        assertThrows(IllegalArgumentException.class, () -> new MovieService(path));

    }
}