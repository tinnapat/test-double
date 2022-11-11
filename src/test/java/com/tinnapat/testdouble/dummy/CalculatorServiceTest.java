package com.tinnapat.testdouble.dummy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void add_2_3_must_be_5() {
        // set up
        Logger dummyLogger = new Logger() {
            @Override
            public void log(String s) {
                // do nothing
            }
        };

        // when
        CalculatorService c = new CalculatorService(dummyLogger);

        // then
        assertEquals(5, c.add(2, 3));
    }
}