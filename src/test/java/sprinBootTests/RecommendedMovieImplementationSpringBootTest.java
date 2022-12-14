package sprinBootTests;

import org.example.Main;
import org.example.movie.RecommendedMovieImplementation2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes= Main.class)
public class RecommendedMovieImplementationSpringBootTest {

    @Autowired
    private RecommendedMovieImplementation2 movieImplementation2;

    @Test
    public void TestRecommendedMovie(){

        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplementation2.recommendMovie("Master"));
        //assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplementation2.recommendedMovie("Master"));

    }

}
