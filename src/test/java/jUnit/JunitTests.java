package jUnit;

import org.example.movie.ContentFiltering2;
import org.example.movie.MultiFiltering2;
import org.example.movie.RecommendedMovieImplementation2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;


public class JunitTests {

    @Test
    public void testRecommendMoviesContentFiltering(){

        RecommendedMovieImplementation2 obj = new RecommendedMovieImplementation2(new ContentFiltering2());

        assertArrayEquals(new String[]{"Italian Job","MI","MI3"}, obj.recommendMovie("Master"));
    }

    @Test
    public void testRecommendMovieMultiFiltering(){

        RecommendedMovieImplementation2 obj = new RecommendedMovieImplementation2(new MultiFiltering2());

        assertArrayEquals(new String[]{"Ice Age", "Toy Story", "The Croods"}, obj.recommendMovie("Master"));
    }
}