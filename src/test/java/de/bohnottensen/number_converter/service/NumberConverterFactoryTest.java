package de.bohnottensen.number_converter.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Test;

class NumberConverterFactoryTest {

    @Test
    void givenDecimalNumberReturnDecimalNumberService() {
        AbstractNumberConverter numberConverter = NumberConverterFactory.getNumberConverterService("decimal");
        assertThat(numberConverter, isA(DecimalNumberService.class));
    }

    @Test
    void givenBinaryNumberReturnBinaryNumberService() {
        AbstractNumberConverter numberConverter = NumberConverterFactory.getNumberConverterService("binary");
        assertThat(numberConverter, isA(BinaryNumberService.class));
    }

    @Test
    void givenRomanNumberReturnBinaryNumberService() {
        AbstractNumberConverter numberConverter = NumberConverterFactory.getNumberConverterService("roman");
        assertThat(numberConverter, isA(RomanNumberService.class));
    }
}