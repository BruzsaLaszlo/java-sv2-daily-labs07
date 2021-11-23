package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private final List<Movies> movies;

    public MovieService(Path path) {
        try {
            movies = readFromFile(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("nincs ilyen file!");
        }
    }

    private List<Movies> readFromFile(Path path) throws IOException {

        List<Movies> result = new ArrayList<>();
        for (String line : Files.readAllLines(path)) {
            String[] s = line.split(";");
            result.add(new Movies(s[0], Integer.parseInt(s[1]), s[2]));
        }

        return result;
    }

    public List<Movies> getMovies() {
        return List.copyOf(movies);
    }
}
