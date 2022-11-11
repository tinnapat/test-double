package com.tinnapat.testdouble.dummy;

public class CalculatorService {

    private Logger logger;

    public CalculatorService(Logger logger) {
        this.logger = logger;
    }

    public double add(double a, double b) {
        logger.log(String.format("adding %s and %b", a, b));
        return a + b;
    }
}
