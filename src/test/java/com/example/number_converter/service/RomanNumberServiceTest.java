package com.example.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberServiceTest {

    private final RomanNumberService service = new RomanNumberService();

    @Test
    void givenDecimalOneReturnI(){
        String result = service.convertToRoman(1);

        assertEquals("I", result);
    }

    @Test
    void givenDecimalThreeReturnIII(){
        String result = service.convertToRoman(3);

        assertEquals("III", result);
    }

    @Test
    void givenDecimal28ReturnXXVIII(){
        String result = service.convertToRoman(28);

        assertEquals("XXVIII", result);
    }

    @Test
    void givenDecimal1952ReturnXXVIII(){
        String result = service.convertToRoman(1952);

        assertEquals("MCMLII", result);
    }

}
