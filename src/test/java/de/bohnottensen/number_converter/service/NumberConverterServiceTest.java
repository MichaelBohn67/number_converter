package de.bohnottensen.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberConverterServiceTest {

    @Test
    void givenADecimalNumberReturnARomanNumber() {
        NumberConverterService service = new NumberConverterService();

        String result = service.convertIntegerToBinary(28,"decimal");

        assertEquals("XXVIII", result);
    }

    @Test
    void givenADecimalNumberReturnABinaryNumber() {
        NumberConverterService service = new NumberConverterService();

        String result = service.convertIntegerToBinary(28,"binary");

        assertEquals("11100", result);
    }
}