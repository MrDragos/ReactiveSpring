package com.example.reactive.spring.Temperature;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class TemperatureSensor {

    private final Random rnd = new Random();

    private Temperature probe() {
        return new Temperature(16 + rnd.nextGaussian() * 10);
    }
}
