package org.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Inject
@Component
public class RecommendedMovieImplementation2 {

    // Defining dependency as Filterr via spring
    @Autowired
    private Filter filter;


    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplementation2( Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendations(movie);

        return resultMovies;
    }
}
