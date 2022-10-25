package de.bohnottensen.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberServiceTest {

    private final RomanNumberService service = new RomanNumberService();

    @Test
    void givenDecimalOneReturnI(){
        int result = service.convertNumber("I");

        assertEquals(1, result);
    }

    @Test
    void givenDecimalThreeReturnIII(){
       int result = service.convertNumber("III");

        assertEquals(3, result);
    }

    @Test
    void givenDecimal28ReturnXXVIII(){
        int result = service.convertNumber("XXVIII");

        assertEquals(28, result);
    }

    @Test
    void givenDecimal1952ReturnXXVIII(){
        int result = service.convertNumber("MCMLII");

        assertEquals(1952, result);
    }
}
