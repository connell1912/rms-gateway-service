package com.rms.config;

import com.rms.filters.PreFilter;
import com.rms.filters.PostFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig{
    
    @Bean
    public PreFilter makePre(){
        return new PreFilter();
    }

    @Bean
    public PostFilter makePost(){
        return new PostFilter();
    }

}