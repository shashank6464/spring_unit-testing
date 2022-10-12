package jUnit;

import org.example.Main;
import org.example.movie.RecommendedMovieImplementation2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Main.class)
public class RecommendedMovieSpringTest {

    @Autowired
    RecommendedMovieImplementation2 movieImplementation2;

    @Test
    public void TestRecommendedMovie(){
        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, movieImplementation2.recommendMovie("Master"));
    }


}
