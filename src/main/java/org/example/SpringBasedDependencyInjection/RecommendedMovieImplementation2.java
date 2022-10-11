package org.example.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Inject
@Component
public class RecommendedMovieImplementation2 {

    // Defining dependency as Filterr via spring
    @Autowired
    private Filter filter;


    // Constructor Injection (Autowiring + Injecting)
    public RecommendedMovieImplementation2( Filter filter){
        this.filter = filter;
    }

    public String[] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage : "+ filter+"\n");
        String[] resultMovies = filter.getRecommendations(movie);

        return resultMovies;
    }
}
