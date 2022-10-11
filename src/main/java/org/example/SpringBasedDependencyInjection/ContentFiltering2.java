package org.example.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Qualifier("CF2")
@Component
@Primary
public class ContentFiltering2 implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Italian Job","MI","MI3"};
    }
}