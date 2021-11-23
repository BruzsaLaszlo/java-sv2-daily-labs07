package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoviesTest {

    @Test
    void createTest() {

        String title = "Star Wars";
        int year = 1977;
        String director = "George Lucas";

        Movies movie = new Movies(title, year, director);

        assertEquals(title, movie.getTitle());
        assertEquals(year, movie.getYearOfRelease());
        assertEquals(director, movie.getDirector());

    }

}