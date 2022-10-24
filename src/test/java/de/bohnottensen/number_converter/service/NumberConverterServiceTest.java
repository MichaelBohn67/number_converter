package de.bohnottensen.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberConverterServiceTest {

    @Test
    void givenADecimalNumberReturnARomanNummeral() {
        NumberConverterService service = new NumberConverterService();

        String result = service.convertIntegerToRoman(28);

        assertEquals("XXVIII", result);
    }

    @Test
    void givenADecimalNumberReturnABinaryNumber() {
        NumberConverterService service = new NumberConverterService();

        String result = service.convertIntegerToBinary(28);

        assertEquals("11100", result);
    }
}