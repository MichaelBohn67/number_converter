package de.bohnottensen.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalNumberServiceTest {

    private final DecimalNumberService service = new DecimalNumberService();

    @Test
    void givenDecimalOneReturnI(){
        String result = service.convertNumber(1);

        assertEquals("I", result);
    }

    @Test
    void givenDecimalThreeReturnIII(){
        String result = service.convertNumber(3);

        assertEquals("III", result);
    }

    @Test
    void givenDecimal28ReturnXXVIII(){
        String result = service.convertNumber(28);

        assertEquals("XXVIII", result);
    }

    @Test
    void givenDecimal1952ReturnXXVIII(){
        String result = service.convertNumber(1952);

        assertEquals("MCMLII", result);
    }
}
