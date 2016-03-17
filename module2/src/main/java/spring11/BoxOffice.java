package spring11;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jweeta.malayya on 3/16/16.
 */
public class BoxOffice {

    List<String> movies;

    @PostConstruct
    public void populateMovies() {
        movies = new ArrayList<>();
        System.out.println("Adding movies");
        movies.add("Pulp");
        movies.add("Happy Valley");
    }

    public void currentPlaying() {
        System.out.println(movies);
    }

    public void clearMovies() {
        System.out.println("Removing movies");
        movies.clear();
    }
}
