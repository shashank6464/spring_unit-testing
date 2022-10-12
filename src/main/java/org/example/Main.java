package org.example;

import org.example.movie.RecommendedMovieImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = SpringApplication.run(Main.class, args);

        RecommendedMovieImplementation2 recommender = context.getBean(RecommendedMovieImplementation2.class);
        String[] result = recommender.recommendMovie("Master");
        System.out.println(Arrays.toString(result));
    }
}