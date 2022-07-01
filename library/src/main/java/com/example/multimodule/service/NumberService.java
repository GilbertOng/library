package com.example.multimodule.service;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(NumberProperties.class)
public class NumberService {
    private final NumberProperties numberProperties;

    public NumberService(NumberProperties numberProperties) {
        this.numberProperties = numberProperties;
    }

    public String npwp(String text){
        return this.numberProperties.npwp(text);
    }
}
