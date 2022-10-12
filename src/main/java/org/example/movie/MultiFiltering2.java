package org.example.movie;

import org.springframework.stereotype.Component;

//@Named
//@Qualifier("MF2")
@Component
public class MultiFiltering2 implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Ice Age", "Toy Story", "The Croods"};
    }
}